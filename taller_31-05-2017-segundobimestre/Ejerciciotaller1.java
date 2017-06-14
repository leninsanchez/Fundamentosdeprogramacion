
package ejerciciotaller1;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciotaller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner datos = new Scanner(System.in);
    //declaracion de variables
    int i=0, n=0, mayor=0; 
    double promd=0, suma=0;
    int[] lista;
    lista = new int[1000];

     // Entrada de datos
        
        System.out.println("Ingrese el limite del arreglo");
        n=datos.nextInt();
        
        // Proceso
        
        for(i=1;i<=n;i++){
            System.out.println("Ingrese la lista "+i);
            lista[i]=datos.nextInt();      
            
        }
    
        for(i=1;i<=n;i++){
          suma=suma+lista[i];
          if (lista[i]>mayor){
              mayor=lista[i];
            
          }
            
        }
            promd=suma/n;
            System.out.println("La suma es "+suma);
            System.out.println("el promedio es  "+promd);
            System.out.println("el mayor es "+mayor);
    }
    
    
}
