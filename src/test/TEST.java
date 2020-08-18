/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author Gerardo Flores
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int n, i ,j, val;
        System.out.println("Ingrese el valorde n");
        n=teclado.nextInt();
        int matriz[][]=new int [n][n];
        System.out.println("Ingresa el valor");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                val=teclado.nextInt();
                if (val>0) {
                    matriz[i][j]=val;
                }else{
                    System.out.println("Intente de nuevo");
                }
            }
            
        }
                        System.out.println("MATRIZ ORIGINAL");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) 
                System.out.printf("%2d ",matriz[i][j]);
                System.out.println("");
        }
        
        int matriz2[][]=new int [n][n];
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz2[i][j]=matriz[j][i];
                
            }
            
        }
                        System.out.println("MATRIZ TRANSPUESTA");

         for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) 
                System.out.printf("%2d ",matriz2[i][j]);
                System.out.println("");
         }
        
        int matriz3[][]=new int[n][n];
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz3[i][j]=matriz2[i][j]+matriz[i][j];
            }
            
        }
        
        
                        System.out.println("MATRIZ RESULTANTE");

          for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) 
                System.out.printf("%2d ",matriz3[i][j]);
                System.out.println("");
          
        }
        
        // TODO code application logic here
    }
    
}
