/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;
import java.util.Scanner;
/**
 *
 * @author lenin
 */
public class Ejerciciouno {

    /**
     * deber
     * ejercicio1
     */
    public static void main(String[] args) {
        // Creacion de variable para pedir los datos
        Scanner datos = new Scanner(System.in);
        
        // Creacion de variables
        int cant=0;
        double costomat, costofij, total=0;  
        
        // Asignacion de variables
        costomat=3.5;
        costofij=10700;  
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el numero de unidades a producir: \n");
        cant=datos.nextInt();
        // Realiza las operaciones
        total=costomat*cant+costofij;
        
        // Salida en pantalla
        System.out.print("El costo total es: "+total+"\n");
        
        
    }
    
}
