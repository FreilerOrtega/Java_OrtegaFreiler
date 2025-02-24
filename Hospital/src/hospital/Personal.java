/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class Personal extends Persona {
  protected String fechaVinculacion;
    protected double salario;
    
    public Personal(String nombre, String direccion, String fechaVinculacion, double salario) {
        super(nombre, direccion);
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
    }
    
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }
    
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Personal{" + "fechaVinculacion=" + fechaVinculacion + ", salario=" + salario + '}';
    }
    
}

    

