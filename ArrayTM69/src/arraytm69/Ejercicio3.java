/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytm69;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a6pplication logic here
       Scanner entrada=new Scanner(System.in);
       int numIngresado;
       int contrasenia[]= new int[5];
       contrasenia[0]=10;
       contrasenia[1]=20;
       contrasenia[2]=30;
       contrasenia[3]=40;
       contrasenia[4]=50;
           for(;;){
           System.out.println("Ingrese contraseña: ");
           numIngresado=entrada.nextInt();
           
           for(int i=0;i<contrasenia.length;i++){
               if(numIngresado==contrasenia[i]){
                   System.out.println("Contraseña correcta");
                   break;
               }
           }
      
   }
 }
}