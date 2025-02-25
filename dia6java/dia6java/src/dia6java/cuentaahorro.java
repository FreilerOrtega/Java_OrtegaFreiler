/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6java;

/**
 *
 * @author Uniminuto Tibu
 */
 class cuentaahorro extends cuentabancaria {
    
    private double Tasainteres;

    public cuentaahorro() {
    }
    
    

    public cuentaahorro(double Tasainteres, String numerocuenta, double saldo) {
        super(numerocuenta, saldo);
        this.Tasainteres = Tasainteres;
    }

    public double getTasainteres() {
        return Tasainteres;
    }

    public void setTasainteres(double Tasainteres) {
        this.Tasainteres = Tasainteres;
    }
    
    public void aplicarInteres(double saldo){
    
        saldo = saldo + (saldo * Tasainteres / 100);
        
        System.out.println(saldo);
        
        
    }
    
    
}
