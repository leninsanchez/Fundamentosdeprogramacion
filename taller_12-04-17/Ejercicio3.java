/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author lenin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //creo una variable por consola para obtener los datos 
        Scanner datos = new Scanner(System.in);

        // Creacion de variables
        String nombre;
        double person1,person2,person3,person4,person5;
        double media;
      
        
        //asignacion de variables
        person1=0;
        person2=0;    
        person3=0;
        person4=0;
        person5=0;
        //Solicitud de variables 
        System.out.print("Ingrese la altura de la persona 1 :");
        person1=datos.nextDouble();
        
        System.out.print("Ingrese la altura de la persona 2 :");
        person2=datos.nextDouble();
        
        System.out.print("Ingrese la altura de la persona 3 :");
        person3=datos.nextDouble();
        
        System.out.print("Ingrese la altura de la persona 4 :");
        person4=datos.nextDouble();
        
        System.out.print("Ingrese la altura de la persona 5 :");
        person5=datos.nextDouble();
        
        //realizo la opracion 
        media=(person1+person2+person3+person4+person5)/5; 
        
                      
        //salida de pantalla
        System.out.print("La media es "+media+"\n");
    }
    
}
