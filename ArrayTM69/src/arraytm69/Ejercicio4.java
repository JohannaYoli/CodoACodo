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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a6pplication logic here
       Scanner entrada=new Scanner(System.in);
       boolean flag=false;
       int contador=0;
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
                    flag=true;
                    break;
              }

                flag=false;
           }
           
           if(flag){
               System.out.println("Contraseña correcta");
               contador=0;
           }else{
               contador++;
               System.out.println("Contraseña incorrecta. Ha ingresado la contraseña "+contador+" veces.");
               if (contador==3){
                   System.out.println("Ingresó la contraseña 3 veces mal, el programa se cerrará");
                   System.exit(0);
               }
           }  
   }
 }
}