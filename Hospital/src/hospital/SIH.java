/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class SIH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hospital hospital = new hospital("Hospital Central", "Calle 123, Ciudad");
        departamento departamento = new departamento("Cardiología");
        Pabellon pabellon = new Pabellon("Pabellón A", 10);
        
        doctor lider = new doctor("Dr. Juan Pérez", "Calle 456", "2020-05-01", 5000, "Cardiología");
        doctor doctor2 = new doctor("Dr. Luis Gómez", "Calle 789", "2019-03-15", 4800, "Cardiología");
        doctorjunior doctorJunior = new doctorjunior("Dr. Pedro Sánchez", "Calle 654", "2022-07-10", 3500, "Cardiología");
        Enfermera enfermera = new Enfermera("Ana Gómez", "Calle 789", "2018-09-15", 3000, "Emergencias");
        Paciente paciente = new Paciente("Carlos Ramírez", "Avenida 321", "1985-07-20", "Infarto");
        paciente.asignarPabellon(pabellon);
        
        Equipomedico equipo = new Equipomedico("Equipo Cardiología", lider);
        equipo.agregarDoctor(doctor2);
        equipo.agregarDoctor(doctorJunior);
        
        System.out.println("Información del Hospital: " + hospital.getNombre() + " - " + hospital.getDireccion());
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Pabellón: " + pabellon.getNombre() + " (Capacidad: " + pabellon.getCapacidad() + ")");
        System.out.println("Doctor Líder: " + lider.getNombre() + " - Especialidad: " + lider.getEspecialidad());
        System.out.println("Equipo Médico: " + equipo.getNombre() + " - Líder: " + equipo.getLider().getNombre());
        for (doctor doc : equipo.getDoctores()) {
            String tipo = (doc instanceof doctorjunior) ? "Doctor Junior" : "Doctor";
            System.out.println("  " + tipo + ": " + doc.getNombre() + " - Especialidad: " + doc.getEspecialidad());
        }
        System.out.println("Enfermera: " + enfermera.getNombre() + " - Área: " + enfermera.getAreaTrabajo());
        System.out.println("Paciente: " + paciente.getNombre() + " - Diagnóstico: " + paciente.getDiagnostico());
    }
}

