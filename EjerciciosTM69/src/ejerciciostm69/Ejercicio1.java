/*
 * Escribir la función "calcularPromedio" para que devuelva el promedio
 * resultante de un arreglo de números enteros recibidos como parámetros.
 */
package ejerciciostm69;

import java.util.Scanner;

/**
 *
 * @author Johanna Yoli
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numeros [] = new int [3];
        
        System.out.println("¡Bienvenido!\nIngrese 3 números para calcular el promedio.\nIngrese el primer número:");
        numeros [0] = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        numeros [1] = entrada.nextInt();
        System.out.println("Ingrese el tercer número:");
        numeros [2] = entrada.nextInt();
        System.out.println("El promedio de los números ingresados es "+funcionCalcularPromedio(numeros)+".");
    }
    
    //Función para calcular el promedio de los números ingresados.
    public static int funcionCalcularPromedio (int numeros []) {
        int promedio = (numeros [0] + numeros[1] + numeros[2])/3;
        return promedio;
    }
}