
package ejerciciotaller4;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciotaller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=1, uni=0, dec=0, sum=0, mod=0, total=0, resta=0, val10=0;
        int[] lista, res;
        lista = new int[11];
        res = new int [11];
        
        // Proceso
        for(i=1;i<=10;i++){
            System.out.println("Introduzca el numero "+i);
            lista[i]=datos.nextInt();
            
        }
        for(i=1;i<=10;i++){
            if(i%2!=0){
                res[j]=lista[i]*2;
                j++;
            }else{
                res[j]=lista[i];
                j++;
            }
            if(i==10){
                val10=lista[10];
            }
        }
        for(i=1;i<=9;i++){
            if(res[i]>=10){
                uni=res[i]%10;
                dec=res[i]/10;
                res[i]=dec+uni;
            }               
        }
        for(i=1;i<=9;i++){
            sum=sum+res[i];             
        }
        System.out.println("El resultado de la suma de los digitos: "+sum);        
        mod=sum%10;
        total=sum+10-mod;        
        System.out.println("El Inmediato superior: "+total); 
        resta=total-sum;
        System.out.println("El Digito a comparar: "+resta);
        
        if(resta==val10){
            System.out.println("Su cedula es correcta");
        } else {
            System.out.println("Su cedula es incorrecta");
        }
        
    }
    
}
