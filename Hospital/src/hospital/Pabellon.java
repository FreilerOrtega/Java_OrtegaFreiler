/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
class Pabellon {
    private String nombre;
    private int capacidad;
    
    public Pabellon(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Pabellon{" + "nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
    
    
}

    
    
    
    

