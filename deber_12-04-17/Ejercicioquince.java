/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquince;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejercicioquince {

    /**
     * deber
     */
    public static void main(String[] args) {
      // Creacion de variable para pedir por consola los datos
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double dolares=0;
        double cambioyen=0, cambiopes=0, cambiolib=0, cambiomar=0;
        double yenes=0, pesetas=0, libras=0,marcos=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los dolares: \n");
        dolares=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a yenes: \n");
        cambioyen=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a pesetas: \n");
        cambiopes=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a libras: \n");
        cambiolib=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a marcos: \n");
        cambiomar=datos.nextDouble();
                      
        // Realiza las operaciones
        yenes=dolares*cambioyen;
        pesetas=dolares*cambiopes;
        libras=dolares*cambiolib;
        marcos=dolares*cambiomar;
        
        // Salida en pantalla
        System.out.print(+dolares+" dolares equivale a : \n");
        System.out.print(+yenes+" yenes \n");
        System.out.print(+pesetas+" pesetas \n");
        System.out.print(+libras+" libras \n");
        System.out.print(+marcos+" marcos \n");
    }
    
}
