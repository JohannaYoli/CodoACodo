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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a6pplication logic here
       
       Scanner entrada=new Scanner(System.in);
       
       System.out.println("Ingrese tamaño del arreglo: ");
       
       int tamanio=entrada.nextInt();
       int miArray []=new int[tamanio];
       
       for(int i=0;i<miArray.length;i++){
           System.out.println("Ingrese número en la posición: "+i);
           miArray[i]=entrada.nextInt();
       }
  
        for(int j=0;j<miArray.length;j++){
            System.out.println("Posición: "+j+" Valor: "+miArray[j]);
        }
        
        for(int k=0;k<miArray.length;k++){
            System.out.print(miArray[k]+" ");
        }
        System.out.println();
    }
}
