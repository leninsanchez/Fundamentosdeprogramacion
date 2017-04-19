
package ejercicio;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner datos = new Scanner (System.in);
        // creacion de las variables
        
    String dia;
    
        // Ingreso de variables
        
    System.out.print("Ingrese el  dia \n");
    dia=datos.next();
    
     // menu de opciones
        switch(dia){
            case "Lunes":
                System.out.print("Gestion Productiva \n");
                break;
            case "Martes":
                System.out.print("Fundamentos Informaticos \n");
                break;
            case "Miercoles":
                System.out.print("Programacion \n");
                break;
            case "Jueves":
                System.out.print("Discretas \n");
                break;
            case "Viernes":
                System.out.print("Nada \n");
                break;              
            default :
                System.out.print("Ingrese un dia correcto \n");
            
        }
        
            
    }
}    
            
    
   

    
        
    
    

