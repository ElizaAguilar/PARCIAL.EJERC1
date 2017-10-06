/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejerc1=new Scanner(System.in);
         int a=0,n,numero1;
         System.out.println("INGRESE EL NUMERO QUE DESEE");
         
         numero1 = ejerc1.nextInt();
         
         for(n=1; n<(numero1+1);n++)
         {
             
         if(numero1%n == 0)
         {
             a++;
             
            }
         }
         
         if(a!=2){
              System.out.println("EL NUMERO INGRESADO NO ES PRIMO");
            }
         else 
         {
                System.out.println("EL NUMERO INGRESADO SI ES PRIMO");
                
    }
    
}
}
