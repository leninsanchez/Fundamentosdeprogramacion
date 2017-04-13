/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author lenin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo una variable por consola para obtener datos
     Scanner datos = new Scanner(System.in);
        // creacion de variables
        
        double metros,anchura,longitud,total;
        
        //asignacion de variables
        metros=0;
        anchura=0;    
        longitud=0;
        total=0;
        
        //Solicitud de variables 
        System.out.print("Ingrese los metros :");
        metros=datos.nextDouble();
        
        System.out.print("Ingrese la anchura :");
        anchura=datos.nextDouble();
        
        System.out.print("Ingrese la longitud :");
        longitud=datos.nextDouble();
        
        //realizo la opracion 
        total=(anchura*longitud)*metros;
        
        //salida de pantalla
        System.out.print("El costo del terreno es  "+total+"\n");
        
        
    }
    
}
