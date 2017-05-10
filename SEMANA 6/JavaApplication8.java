
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @LENIN SANCHEZ
 * 10/05/2017
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Creacion de variable para entrada de datos
        
        Scanner datos = new Scanner(System.in);
        int n, cont=2, i=1,res=0,x=0; 
        
        // creacion de varablees
        
        System.out.println("Ingrese el limite de la serie");
        n=datos.nextInt();
        
          /* do{
            System.out.print ("\n variables : " +contador);
            contador++;
        
    } while contador (contador<n);
    
        do{
            System.out.print ("\n variables : " +contador);
            contador++;
            
            
    }while (contador!=10);*/
                
            do{
                x=(int)(Math.random()*n);
                System.out.print ("\n numero : " +x);
                
            } while (x % 2 !=0);
                System.out.print ("\n numero seleccionado es : " +x);
        
    }
    
}
