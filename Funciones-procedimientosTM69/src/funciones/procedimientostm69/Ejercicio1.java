/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.procedimientostm69;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println(funcionSaludo (nombre));
        System.out.println("Bienvenido a Gmail!");
    }
    
    public static String funcionSaludo (String nombre) {
       return "Hola "+nombre+"!";
    }
    
}
