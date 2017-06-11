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
public class ArrayTM69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a6pplication logic here
        int miArray[] = new int[6];
        miArray[0]=10;
        miArray[1]=20;
        miArray[2]=30;
        miArray[3]=40;
        miArray[4]=50;
        miArray[5]=60;
        System.out.println("Array 1: ");
        for(int i=0;i<miArray.length;i++){
            System.out.print(miArray[i]+" ");
        }
        System.out.println();
        
        int miArray2[]={2,7,51,65,21};
        
        System.out.println("Array 2: ");
        
        for(int j=0;j<miArray2.length;j++){
            System.out.print(miArray2[j]+" ");
        }
        System.out.println();
        
        
        int miArray3[]={2,7,51,65,21};
        
        System.out.println("Array 3: ");
        
        for(int j=4;j>miArray3.length;j--){
            System.out.print(miArray3[j]+" ");
        }
        System.out.println();
        
        
        
    }
    
}
