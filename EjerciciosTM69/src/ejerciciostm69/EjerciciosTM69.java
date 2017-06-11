/*
 * Escribir la función "imprimirSimbolo", para que luego se imprima por consola
 * x veces un caracter en la misma línea. Tanto la cantidad de veces que se
 * desea imprimir como el caracter, se reciben por consola.
 */
package ejerciciostm69;

import java.util.Scanner;

/**
 *
 * @author Johanna Yoli
 */
public class EjerciciosTM69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner entrada = new Scanner (System.in);
    char simbolo;
    int repeticion;
    System.out.println("Imprima un caracter: ");
    simbolo = entrada.next().charAt(0);
    System.out.println("Ingrese la cantidad de veces que desea que se repita: ");
    repeticion= entrada.nextInt();
    procedimientoImprimirSimbolo(simbolo, repeticion);
    }
    
    // Procedimiento para imprimir un caracter x cantidad de veces.
    public static void procedimientoImprimirSimbolo (char simbolo, int repeticion){
        for (int i = 0; i < repeticion; i++) {
            System.out.print(simbolo+" ");
        }  
    }
}