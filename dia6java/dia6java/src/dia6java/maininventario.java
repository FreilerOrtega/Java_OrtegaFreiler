/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia6java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class maininventario {
    
    
    public static void main(String[] args) {
 
        inventario p1 = new inventario ("344242","arroz",20,3000);
        inventario p2 = new inventario ("34522d","platano",25,5000);
        inventario p3 = new inventario ("357674","yuca",20,3000);
        
        ArrayList<inventario>productos= new ArrayList<>();
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        
        System.out.println(productos);
                
        
        Scanner sn = new Scanner (System.in);
        
        System.out.println("////menuu\\\\");
        System.out.println("1.comprar");
        System.out.println("2.agregar");
        
        System.out.println("eleje una opcion");
        
        int opc = sn.nextInt();
        
        if (opc == 1){
            
            System.out.println("ingresa el codigo del producto");
            String cd = sn.next();
            
            for (inventario i:productos){
                if (cd.equalsIgnoreCase(i.getCodigo()) ){
                    System.out.println("ingresa la cantidad a comprar  ");
                    int can = sn.nextInt();
                    
                    i.actualizarstock(can);
                    System.out.println(i.getCantidad());
                } 
            
            }
            
            
        
        }else if (opc == 2) {
            System.out.println("ingresa el codigo del producto");
            String cd2 = sn.next();
            
            for (inventario i:productos){
                if (cd2.equalsIgnoreCase(i.getCodigo()) ){
                    System.out.println("ingresa la cantidad a agregar   ");
                    int can2 = sn.nextInt();
                    
                    i.actualizarstock(can2);
                    System.out.println(i.getCantidad());
                } 
            
            }
            
           
        }
      
        
       
       
    }
    
}
