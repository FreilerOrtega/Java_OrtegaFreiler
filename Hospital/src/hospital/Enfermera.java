/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
class Enfermera extends Personal {
    private String areaTrabajo;
    
    public Enfermera(String nombre, String direccion, String fechaVinculacion, double salario, String areaTrabajo) {
        super(nombre, direccion, fechaVinculacion, salario);
        this.areaTrabajo = areaTrabajo;
    }
    
    public String getAreaTrabajo() {
        return areaTrabajo;
    }
}