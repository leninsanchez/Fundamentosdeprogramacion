
package trabajo.en.clase;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class TrabajoEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6,val7,val8,val9,val10;
        int res1,res2,res3,res4,res5,res6,res7,res8,res9,res10;
        int suma; 
        int decena, unidad, total, resta, mod;
        
        // ingreso de datos
        
        System.out.print("Ingrese los 10 dijitos deñ numero de cedula");
        val1=datos.nextInt();    

        val2=datos.nextInt();    
        
        val3=datos.nextInt();
        
        val4=datos.nextInt();
        
        val5=datos.nextInt();

        val6=datos.nextInt();

        val7=datos.nextInt();

        val8=datos.nextInt();

        val9=datos.nextInt();

        val10=datos.nextInt();
        
        
        //proceso 
        
        res1=val1*2;
        res2=val2*1;
        res3=val3*2;
        res4=val4*1;
        res5=val5*2;
        res6=val6*1;
        res7=val7*2;
        res8=val8*1;
        res9=val9*2;
             
        //condicion
        if (res1>=10){
        unidad =res1%10;
        decena=res1/10;
        res1=decena+unidad;
        }
        
        if (res3>=10){
        unidad =res3%10;
        decena=res3/10;
        res3=decena+unidad; 
        }
        if (res5>=10){
        unidad =res5%10;
        decena=res5/10;
        res5=decena+unidad; 
        }
        if (res7>=10){
        unidad =res7%10;
        decena=res7/10;
        res7=decena+unidad;
        }
        if (res9>=10){
        unidad =res9%10;
        decena=res9/10;
        res9=decena+unidad; 
        }
        
    
    
       suma=res1+res2+res3+res4+res5+res6+res7+res8+res9;
        System.out.println("La suma de los digitos: "+suma); 
        mod=suma%10;
        total=suma+10-mod;
        System.out.println("Inmediato superior: "+total);    
        do{
            resta=total-suma;
            System.out.println("Digito a comparar: "+resta);
            System.out.println("Ultimo digito: "+val10);
            System.out.println("Su cedula es correcta");
        }while(resta>val10);
            
        }
                
}
