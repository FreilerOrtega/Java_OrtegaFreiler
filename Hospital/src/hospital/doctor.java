/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class doctor extends Personal {
    private final String especialidad;
    
    public doctor(String nombre, String direccion, String fechaVinculacion, double salario, String especialidad) {
        super(nombre, direccion, fechaVinculacion, salario);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "doctor{" + "especialidad=" + especialidad + '}';
    }
    
    
}


