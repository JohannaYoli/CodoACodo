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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String nombre = funcionNombre(entrada);
        String ocupacion = funcionOcupacion(entrada);
        int edad = funcionEdad(entrada);
        procedimientoInfo(nombre, ocupacion, edad);
    }
    
    public static String funcionNombre (Scanner entrada) {
       System.out.println("Ingrese nombre: ");
       String nombre = entrada.nextLine();
       return nombre;
    }
    
    public static String funcionOcupacion (Scanner entrada) {
       System.out.println("Ingrese ocupación: ");
       String ocupacion = entrada.nextLine();
       return ocupacion;
    }
    
     public static int funcionEdad (Scanner entrada) {
       System.out.println("Ingrese edad: ");
       int edad = entrada.nextInt();
       return edad;
    }
    
     public static void procedimientoInfo (String nombre, String ocupacion, int edad){
         System.out.println("Bienvenido!\nSu nombre es "+nombre+".\nSu ocupación es "+ocupacion.toLowerCase()+".\nSu edad es "+edad+" y dentro de 85 años usted tendrá "+(edad+85)+".");
     }
}
