/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Lenin Sanchez
 */
public class Ejercicio1 {
     public static double iva=0.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Variable para entrada de datos
        Scanner datos = new Scanner(System.in);
    
        // creo variables para pedir por consola los datos
        double resultado;
        mensaje();
        resultado=calculaiva(354,0.12);
        System.out.println("el calculo del iva es:" +resultado);
        
    }
   
    public static void mensaje(){
        System.out.println("mensaje de la funcion mensaje");
        
    }

    public static double calculaiva(double subtotal, double iva){
        double subtotal2=0; double total=0; 
        
        subtotal2=subtotal*iva;
        total=subtotal2+subtotal; 
        return total;
    }


}
