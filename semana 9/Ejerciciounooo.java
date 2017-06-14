/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciounooo;
import java.util.Scanner;
/**
 *
 * @author lenin sanchez
 */
public class Ejerciciounooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=0, facto=1;
        int[] lista;
        lista = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese aqui el limite del arreglo");
        n=datos.nextInt();
        // Proceso
        for(i=1;i<=n;i++){
            System.out.println("Ingrese aqui el elemento "+i);
            lista[i]=datos.nextInt();            
        }
        for(i=1;i<=n;i++){
            if(lista[i]%2!=0){
                System.out.println("lista ["+i+"] = "+lista[i]+" es impar");
                if(lista[i]<=5){
                    j=lista[i];
                    while(j!=0){
                        facto=facto*j;
                        j--;
                    }
                    
                    System.out.println("lista ["+i+"] = "+lista[i]+" su factorial es: "+facto);
                }
                facto=1;
            }                      
        }    
    }
    
}
