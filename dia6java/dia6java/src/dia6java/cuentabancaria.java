/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6java;

/**
 *
 * @author Uniminuto Tibu
 */

public class cuentabancaria {
    
    private String numerocuenta;
    private double saldo;

    public cuentabancaria() {
    }

    public cuentabancaria(String numerocuenta, double saldo) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }
    
    
    // no voy a crear un setter para el numero de cuenta 
    // razon : para que no se modifique  depues de haberse creado

    public String getNumerocuenta() {
        return numerocuenta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar (double cantidad ){
    if (cantidad >0){
        saldo = saldo = cantidad;
        System.out.println("saldo agregado con exito ");
               
    }else {
        System.out.println("la cantidad a depositar debe ser positiva ");
    }
    }
    
    public void retirar (double cantidad ){
    if (cantidad > 0 && cantidad <= saldo){
        saldo = saldo - cantidad;
        System.out.println("su retiro fue exitoso ");
    }else if (cantidad > saldo){
        System.out.println("no tiene los fondos suficientes");
    }else{
        System.out.println("por fevor debes ingresar una cantidad ");
    }
    
    }
    
    
}
