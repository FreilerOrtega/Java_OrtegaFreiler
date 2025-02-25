/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6java;

/**
 *
 * @author Uniminuto Tibu
 */
public class Cuenta {
    
    
    public static void main(String[] args) {
         
        cuentaahorro ca =new cuentaahorro(17,"847377374",20000000);
        
        System.out.println(ca.getSaldo());
        
        ca.depositar(2500000);
        System.out.println(ca.getSaldo());
        
        ca.retirar(900000);
        System.out.println(ca.getSaldo());
        
        ca.aplicarInteres(ca.getSaldo());
        
        
    }
}
