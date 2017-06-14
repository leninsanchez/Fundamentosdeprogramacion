/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner; 
/**
 *
 * @author Salas
 */
public class Ejercicio2 {
    public static double iva=0.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Variable para entrada de datos
        Scanner datos = new Scanner(System.in);
    
        // creo variables para pedir por consola los datos
        double resultado;
        double tip=0, desc=0, subt=0; 
        //datos de entrada
        System.out.println("Que tipo de empresa es:");
        System.out.println("1. es Publica:");
        System.out.println("2. es Privada:");
        System.out.println("3. Es Persona Natural:");
        tip=datos.nextInt();
        System.out.println("Ingrese aqui el subtotal:");
        subt=datos.nextDouble();
        //llamado de la funcion 
        desc=tipoempresa(tip)*100;
        System.out.println("el descuento es :"+desc+"%");
        resultado=calculaiva(subt,iva)-(calculaiva(subt,iva))*tipoempresa(tip);
        System.out.println("el calculo con iva y descuento es :"+resultado);
    }
   
    public static double tipoempresa(double op){
      
        double desc1=0.06, desc2=0.02,desc3=0.08;
        if (op==1){
            return desc1;
        }
        if (op==2){
            return desc2;
        }
        if (op==3){
            return desc3;
        }
        return 0; 
    }

    public static double calculaiva(double subtotal, double iva){
               
        double total=0;
        total=subtotal+(subtotal*iva); 
        return total;
    }


}

