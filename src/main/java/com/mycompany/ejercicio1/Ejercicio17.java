
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
       System.out.println("Ejercicio 17");
   Scanner pato = new Scanner(System.in);
   int temporal=0;
   int matriz[][]= new int [3][3];
   
       for (int contador = 0; contador < 3; contador++) {
           for (int contador2 = 0; contador2 < 3; contador2++) {
               
               System.out.println("Matriz ["+contador+"]{"+contador2+"}");
               matriz[contador ][contador2]=pato.nextInt();
           }
           
       }
       System.out.println("La matriz antes de transponerla");
       for (int contador = 0; contador < 3; contador++) {
           for (int contador2 = 0; contador2 < 3; contador2++) {
               System.out.print(+matriz[contador][contador2]+" ");
           }
           System.out.println(" ");
       }
   
       System.out.println("  ");
       for (int contador = 0; contador < 3; contador++) {
           for (int contador2 = 0; contador2 < contador; contador2++) {
               
               temporal=matriz[contador][contador2];
               matriz[contador][contador2]= matriz[contador2][contador];
               matriz[contador2][contador]=temporal;
             
       }
       }
       System.out.println("   ");
      
       for (int contador = 0; contador < 3; contador++) {
           for (int contador2 = 0; contador2 < 3; contador2++) {
          System.out.print(matriz[contador][contador2]+ " ");
       }
           System.out.println(" ");   
       } 
   }  
}

    

