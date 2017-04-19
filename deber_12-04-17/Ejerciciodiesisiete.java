/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiesisiete;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciodiesisiete {

    /**
     * deber
     */
    public static void main(String[] args) {
       // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double angulo=0;
        double tangente=0, cotangente=0, secante=0, cosecante=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el angulo en radianes: \n");
        angulo=datos.nextDouble();
                      
        // Realiza las operaciones
        tangente=sin(angulo)/cos(angulo);
        cotangente=1/tangente;
        secante=1/cos(angulo);
        cosecante=1/sin(angulo);
        
        // Salida en pantalla
        System.out.print("La tangente es: "+tangente+"\n");
        System.out.print("La cotangente es: "+cotangente+"\n");
        System.out.print("La secante es: "+secante+"\n");
        System.out.print("La cosecante es: "+cosecante+"\n");
    }
    
}
