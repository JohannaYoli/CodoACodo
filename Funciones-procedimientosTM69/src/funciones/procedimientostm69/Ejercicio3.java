/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.procedimientostm69;

import java.util.Scanner;

/**
 *
 * @author Johanna Yoli
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1, num2, resultado;
        Scanner entrada = new Scanner(System.in);
        
        for (;;) {
            System.out.println("*Calculadora*");
            System.out.println("Ingrese un número: ");
            num1 = entrada.nextFloat();
            System.out.println("Ingrese otro número: ");
            num2 = entrada.nextFloat();
            System.out.println("Seleccione la opción que desea: "
                    +"\n1.Sumar"
                    +"\n2.Restar"
                    +"\n3.Multiplicar"
                    +"\n4.Dividir"
                    +"\n5.Par o Impar"
                    );
            System.out.println("");
            byte opciones = entrada.nextByte();
            System.out.println("");

            switch (opciones){
                case 1:
                    resultado = funcionSumar (num1, num2);
                    System.out.println("El resultado de la suma es: "+resultado+".");
                    break;
                case 2 :
                    resultado = funcionRestar (num1, num2);
                    System.out.println("El resultado de la resta es: "+resultado+".");
                    break;
                case 3 :
                    resultado = funcionMultiplicar (num1, num2);
                    System.out.println("El resultado de la multiplicación es: "+resultado+".");
                    break;
                case 4 :
                    if (num2==0) {
                        System.out.println("El segundo número no puede ser igual a 0.");
                    } else {
                    resultado = funcionDividir (num1, num2);
                    System.out.println("El resultado de la divición es: "+resultado+".");
                    }
                    break;
                case 5 : 
                    procedimientoParImpar (num1, num2);
                    break;
                default :
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
            System.out.println(funcionSalida());
            System.out.println("");
        }
}
    
    //Función Sumar
    public static float funcionSumar (float num1, float num2){
        float resultado = num1 + num2;
        return resultado;
    }
    
    //Función Restar
    public static float funcionRestar (float num1, float num2){
        float resultado = num1 - num2;
        return resultado;
    }
    
    //Función Multiplicar
    public static float funcionMultiplicar (float num1, float num2){
        float resultado = num1 * num2;
        return resultado;
    }
    
    //Función Dividir
    public static float funcionDividir (float num1, float num2){
        float resultado = num1 / num2;
        return resultado;
    }
     
    //Procedimiento para conocer si los número ingresados son pares o impares
    public static void procedimientoParImpar (float num1, float num2){
        if ((num1%2)==0) {
            System.out.println ("El número "+num1+" es par.");
        } else {
            System.out.println ("El número "+num1+" es impar.");
        }
        if ((num2%2)==0) {
            System.out.println ("El número "+num2+" es par.");
        } else {
            System.out.println ("El número "+num2+" es impar.");
        }
    }
    
    public static String funcionSalida (){
        return "Gracias por utilizar nuestra calculadora!";
    }
}