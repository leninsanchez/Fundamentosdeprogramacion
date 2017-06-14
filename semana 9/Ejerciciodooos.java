/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodooos;
import java.util.Scanner; 
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciodooos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, a=1, b=1, sum1=0, sum2=0, lim=0;
        int[] lista;
        int[] lista2;
        int[] lista3;
        lista = new int[1000];
        lista2 = new int[1000];
        lista3 = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese aqui el limite del arreglo");
        n=datos.nextInt();
        lim=(n/2)+1;
        // Proceso
        for(i=1;i<=n;i++){
            System.out.println("Ingrese aqui el elemento "+i);
            lista[i]=datos.nextInt();            
        }
        for(i=1;i<=n;i=i+2){
            lista2[a]=lista[i];
            sum1=sum1+lista[i];
            a++;                              
        }
        lista2[5]=sum1;
        for(i=0;i<=n;i=i+2){
            lista3[b]=lista[i];
            sum2=sum2+lista[i];
            b++;                              
        } 
        lista3[5]=sum2;
        for(a=1;a<=lim+1;a++){
            System.out.println("lista 2 ["+a+"] = "+lista2[a]);
                      
        }
        for(a=2;a<=lim+1;a++){
            System.out.println("lista 3 ["+a+"] = "+lista3[a]);
                      
        }
    }
    
}
