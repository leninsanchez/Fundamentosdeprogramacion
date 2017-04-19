/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciosiete {

    /**
     * deber 
     * ejercicio 7
     */
    public static void main(String[] args) {
     // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double celsius=0, farenheit=0;
              
        // Solicitud de variables al usuario
        System.out.print("Ingrese los grados Celsius: \n");
        celsius=datos.nextInt();
               
        // Realiza las operaciones
        farenheit=(9/5)*celsius+32;
        
        // Salida en pantalla
        System.out.print(+celsius+" grados Celsius es igual a: "+farenheit+" grados Farenheit\n");
    }
    
}
