/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6java;

/**
 *
 * @author Uniminuto Tibu
 */
public class inventario {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public inventario() {
    }

    public inventario(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
       if (cantidad >=0 ){
            this.cantidad = cantidad;
       }else{
           System.out.println("ingrese una cantidad positiva ");
       }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >0){
         this.precio = precio;
        }else{
            System.out.println("el precio no puede ser menor a 0 ");
        }
    }
    
    public void actualizarstock(int Cantidad ){
        
        if (Cantidad>0){
        cantidad+=Cantidad;
        }else{
            if(cantidad>=Cantidad){
            cantidad+=Cantidad;
            }else{
                System.out.println("la cantidad a restar debe ser menor o igual al stock");
            }
            
        }
    
    }

    @Override
    public String toString() {
        return "inventario{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}
