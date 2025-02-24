/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Equipomedico {
    
    private String nombre;
    private doctor lider;
    private List<doctor> doctores;
    
    public Equipomedico(String nombre, doctor lider) {
        this.nombre = nombre;
        this.lider = lider;
        this.doctores = new ArrayList<>();
        this.doctores.add(lider);
    }
    
    public void agregarDoctor(doctor doctor) {
        this.doctores.add(doctor);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public doctor getLider() {
        return lider;
    }
    
    public List<doctor> getDoctores() {
        return doctores;
    }

    @Override
    public String toString() {
        return "Equipomedico{" + "nombre=" + nombre + ", lider=" + lider + ", doctores=" + doctores + '}';
    }
    
    
}

    

