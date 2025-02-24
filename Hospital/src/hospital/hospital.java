/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class hospital {
    
     private String nombre;
    private String direccion;
    
    public hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "hospital{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
    
}
    

