
package ejerciciotaller2;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciotaller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
    //declaracion de variables
    int i=0, n=0, menor=100000; 
    int[] lista;
    lista = new int[10000];
         // Entrada de datos
        
        System.out.println("Ingrese el limite del arreglo");
        n=datos.nextInt();
        
        // Proceso
        
        for(i=1;i<=n;i++){
            System.out.println("Ingrese la lista "+i);
            lista[i]=datos.nextInt();  
            if (lista[i]<menor){
            menor=lista[i]; 
            }    
         
        }
         System.out.println("el menor es "+menor);
    }
}