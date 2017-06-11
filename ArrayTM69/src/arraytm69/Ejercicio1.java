/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytm69;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a6pplication logic here
        int miArray[][] = new int[3][2];
        miArray[0][0]=10;
        miArray[0][1]=20;
        miArray[1][0]=30;
        miArray[1][1]=40;
        miArray[2][0]=50;
        miArray[2][1]=60;
        System.out.println("Array 1: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
            System.out.print(miArray[i][j]+" ");
        }
        System.out.println();
        }
        
        System.out.println();
        int miArray2[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        
        System.out.println("Array 2: ");
        
        for(int y=0;y<4;y++){
            for(int z=0;z<3;z++){
            System.out.print(miArray2[y][z]+" ");
        }
        System.out.println();
        }
    System.out.println();
  }
}
