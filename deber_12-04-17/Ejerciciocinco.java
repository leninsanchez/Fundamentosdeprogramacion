/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez 
 */
public class Ejerciciocinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
            // Creacion de variables
        int seg=0, vel, total=0;
                
        // Asignacion de variables
        vel=300000;        
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los segundos: \n");
        seg=datos.nextInt();
               
        // Realiza las operaciones
        total=seg*vel;
        
        // Salida en pantalla
        System.out.print("El recorrido total es: "+total+" kilometros \n");
    }
    
}
