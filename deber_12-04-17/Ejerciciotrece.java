/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrece;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciotrece {

    /**
     * deber
     */
    public static void main(String[] args) {
            // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double rad=0,vol=0, area=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el radio: \n");
        rad=datos.nextDouble();
                      
        // Realiza las operaciones
        vol=(4*3.14*(rad*rad*rad))/3;
        area=3.14*(rad*rad);
        
        // Salida en pantalla
        System.out.print("El volumen es : "+vol+"\n");
        System.out.print("El area es : "+area+"\n");
    }
    
}
