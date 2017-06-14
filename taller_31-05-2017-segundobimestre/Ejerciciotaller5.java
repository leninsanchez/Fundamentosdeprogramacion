
package ejerciciotaller5;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez 
 */ 
public class Ejerciciotaller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0;
        int[] lista1;
        lista1 = new int[1000];
        int[] lista2;
        lista2 = new int[1000];
        int[] suma;
        suma = new int[1000];
        int[] resta;
        resta = new int[1000];
        int[] mult;
        mult = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese el limite de los arreglos");
        n=datos.nextInt();
        System.out.println("Arreglo lista1");
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el elemento "+i);
            lista1[i]=datos.nextInt();            
        }
        System.out.println("Arreglo lista2");
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el elemento "+i);
            lista2[i]=datos.nextInt();            
        }
        // Proceso
        for(i=1;i<=n;i++){
            suma[i]=lista1[i]+lista2[i];
            resta[i]=lista1[i]-lista2[i];
            mult[i]=lista1[i]*lista2[i];            
        }
        // Salida de datos
        System.out.println("Arreglo lista1: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+lista1[i]);
        }
        System.out.println();
        System.out.println("Arreglo lista2: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+lista2[i]);
        }
        System.out.println();
        System.out.println("La suma es: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+suma[i]);
        }
        System.out.println();
        System.out.println("La resta es: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+resta[i]);
        }
        System.out.println();
        System.out.println("La multiplicacion es: ");
        for(i=1;i<=n;i++){
            System.out.print(" "+mult[i]);
        }
        System.out.println();
    }
    
}


