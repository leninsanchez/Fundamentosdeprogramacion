/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author Lenin Sanchez
 */
public class semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int i=0,res=0; 
       
       while (i<=12){
           //procesos 
           res=i%2;
           
           if (res==0) { 
         
            System.out.println(i+"es par");   
               
           }else{
            System.out.println (i+"es impar");   
           } 
        //contador 
                   
           i++; 
     
       }
    }
    
}
