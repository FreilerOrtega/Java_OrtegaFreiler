/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class doctorjunior extends doctor {

    public doctorjunior(String nombre, String direccion, String fechaVinculacion, double salario, String especialidad) {
        super(nombre, direccion, fechaVinculacion, salario, especialidad);
    }

    @Override
    public String toString() {
        return "doctorjunior{" + '}';
    }
    
    
}
    

