/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author lenin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // creo una variable por consola para obtener datos
     Scanner datos = new Scanner(System.in);
        // creacion de variables
        
        double horas,minutos,segundos,dias;
        
        //asignacion de variables
        horas=0;
        minutos=0;    
        segundos=0;
        dias=0;
    
        //Solicitud de variables 
        System.out.print("Ingrese las horas :");
        horas=datos.nextDouble();
        
        //realizo la opracion 
        dias=horas/24;
        minutos=horas*60;
        segundos=horas*3600;
                
        //salida de pantalla
        System.out.print("El equivalente en minutos es "+minutos+"\n");
        System.out.print("El equivalente en dias es "+dias+"\n");
         System.out.print("El equivalente en segundos es "+segundos+"\n");
    }
    
    
}
