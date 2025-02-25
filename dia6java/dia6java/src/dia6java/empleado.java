/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6java;

/**
 *
 * @author Uniminuto Tibu
 */
public class empleado {
    private String nombre;
    private int id;
    private double salario ;

    public empleado() {
    }

    public empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

  
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
           this.salario=salario;
           
        }else{
            System.out.println("ingresa un valor positivo "); 
        }
    }
    
   public void mostrarinformacion(){
       System.out.println("nombre:"+nombre+"\nid:"+id+"\nsalario"+salario);
       
   };

    
}
