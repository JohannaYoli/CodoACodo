/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojava;

import java.util.Scanner;

/**
 *
 * @author Alumnop
 */
public class EjercicioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int varIndice=0,varOpcion;
        Scanner entrada =new Scanner(System.in);
        System.out.println("Hola - Ingrese opción");
        varOpcion = entrada.nextInt();
        if(condicion){
            System.out.println("Bloque de código IF");
        }
        else if(condicion){
            System.out.println("Bloque de código ELSE IF");
        }
        else(condicion){
            System.out.println("Bloque de código ELSE");
        }
        switch(expresion){
            case 1: System.out.println("Bloque de código CASE 1");
                break;
            case 2:
            case 3: System.out.println("Bloque de código CASE 2 y 3");
                break;
            default:System.out.println("Bloque de código DEFAULT");
                break;
        for (varIndice=0;varIndice<10;varIndice++){
            System.out.println("Bloque de código bucle FOR"+varIndice);
        }
        while(condicion){
            System.out.println("Bloque de código bucle WHIKE");
        }
        do {
            System.out.println("Bloque de código bucle DO-WHILE");
        }while(condicion);
    }
  } 
}
