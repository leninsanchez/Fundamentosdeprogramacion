/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 * Fecha: 12/04/17
 */
public class Ejerciciotres {

    /**
     * Deber
     */
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);
        
        // Creacion de variables
        int horas=0, min=0, seg=0;
        double dias=0;
        
        // Solicitud de variabes al usuario
        System.out.print("Ingrese el numero de horas a convertir: \n");
        horas=datos.nextInt();
        
        // Operaciones
        min=horas*60;
        seg=horas*3600;
        dias=horas/24;
        
        // Salida en pantalla
        System.out.print(+horas+" horas son: "+min+" minutos \n");
        System.out.print(+horas+" horas son: "+seg+" segundos \n");
        System.out.print(+horas+" horas son: "+dias+" dias \n");  
    }
    
}
