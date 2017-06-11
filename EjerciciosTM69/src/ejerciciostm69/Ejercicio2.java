/*
 * Un corredor desea registrar sus tiempos parciales por cada vuelta en segundos.
 * Para eso se ingreará cada una de las 8 vueltas que dura la carrera.
 * Tiene que mostrar en forma de lista una M si mejoró el tiempo anterior
 * y una P si lo empeoró.
 */
package ejerciciostm69;

import java.util.Scanner;

/**
 *
 * @author Johanna Yoli
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int vueltas [] = new int [8];
        System.out.println("¡Bienvenido!\nIngrese el tiempo de la primer vuelta en segundos:");
        vueltas [0] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la segunda vuelta en segundos:");
        vueltas [1] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la tercer vuelta en segundos:");
        vueltas [2] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la cuarta vuelta en segundos:");
        vueltas [3] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la quinta vuelta en segundos:");
        vueltas [4] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la sexta vuelta en segundos:");
        vueltas [5] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la séptima vuelta en segundos:");
        vueltas [6] = entrada.nextInt();
        System.out.println("Ingrese el tiempo de la octava vuelta en segundos:");
        vueltas [7] = entrada.nextInt();
        
        procedimientoTiempoVueltas (vueltas);
    }
    
    //Procedimiento para definir si se mejoró o se empeoró el tiempo por vuelta.
    public static void procedimientoTiempoVueltas (int vueltas[]) {
        
        //Vuelta 1
        System.out.println("Primer vuelta: "+vueltas[0]+" segundos.");
        
        //Vuelta 2
        if (vueltas[1] > vueltas [0] ) {
            System.out.println("Segunda vuelta: "+vueltas[1]+" segundos. P");
        }
        else if (vueltas[1] < vueltas [0] ){
            System.out.println("Segunda vuelta: "+vueltas[1]+" segundos. M");
        } else if (vueltas[1] == vueltas [0]){
            System.out.println("Segunda vuelta: "+vueltas[1]+" segundos. I");
        }
        
        //Vuelta 3
         if (vueltas[2] > vueltas [1] ) {
            System.out.println("Tercer vuelta: "+vueltas[2]+" segundos. P");
        }
        else if (vueltas[2] < vueltas [1] ){
            System.out.println("Tercer vuelta: "+vueltas[2]+" segundos. M");
        } else if (vueltas[2] == vueltas [1]){
            System.out.println("Tercer vuelta: "+vueltas[2]+" segundos. I");
        }
         
        //Vuelta 4
         if (vueltas[3] > vueltas [2] ) {
            System.out.println("Cuarta vuelta: "+vueltas[3]+" segundos. P");
        }
        else if (vueltas[3] < vueltas [3] ){
            System.out.println("Cuarta vuelta: "+vueltas[3]+" segundos. M");
        } else if (vueltas[3] == vueltas [2]){
            System.out.println("Cuarta vuelta: "+vueltas[3]+" segundos. I");
        }
         
        //Vuelta 5
         if (vueltas[4] > vueltas [3] ) {
            System.out.println("Quinta vuelta: "+vueltas[4]+" segundos. P");
        }
        else if (vueltas[4] < vueltas [3] ){
            System.out.println("Quinta vuelta: "+vueltas[4]+" segundos. M");
        } else if (vueltas[4] == vueltas [3]){
            System.out.println("Quinta vuelta: "+vueltas[4]+" segundos. I");
        }
         
        //Vuelta 6
         if (vueltas[5] > vueltas [4] ) {
            System.out.println("Sexta vuelta: "+vueltas[5]+" segundos. P");
        }
        else if (vueltas[5] < vueltas [4] ){
            System.out.println("Sexta vuelta: "+vueltas[5]+" segundos. M");
        } else if (vueltas[5] == vueltas [4]){
            System.out.println("Sexta vuelta: "+vueltas[5]+" segundos. I");
        }
         
        //Vuelta 7
         if (vueltas[6] > vueltas [5] ) {
            System.out.println("Séptima vuelta: "+vueltas[6]+" segundos. P");
        }
        else if (vueltas[6] < vueltas [5] ){
            System.out.println("Séptima vuelta: "+vueltas[6]+" segundos. M");
        } else if (vueltas[6] == vueltas [5]){
            System.out.println("Séptima vuelta: "+vueltas[6]+" segundos. I");
        }
         
        //Vuelta 8
         if (vueltas[7] > vueltas [6] ) {
            System.out.println("Octava vuelta: "+vueltas[7]+" segundos. P");
        }
        else if (vueltas[7] < vueltas [6] ){
            System.out.println("Octava vuelta: "+vueltas[7]+" segundos. M");
        } else if (vueltas[7] == vueltas [6]){
            System.out.println("Octava vuelta: "+vueltas[7]+" segundos. I");
        }
         
    }
        
}