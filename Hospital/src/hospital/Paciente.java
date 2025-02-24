/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class Paciente extends Persona {
   private String fechaNacimiento;
    private String diagnostico;
    private Pabellon pabellon;
    
    public Paciente(String nombre, String direccion, String fechaNacimiento, String diagnostico) {
        super(nombre, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.diagnostico = diagnostico;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }
    
    public void asignarPabellon(Pabellon pabellon) {
        this.pabellon = pabellon;
    }

    @Override
    public String toString() {
        return "Paciente{" + "fechaNacimiento=" + fechaNacimiento + ", diagnostico=" + diagnostico + ", pabellon=" + pabellon + '}';
    }
    
    
}

   
    
    
    
    
    
    

