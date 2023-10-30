
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
    System.out.println("Ejercicio 11");
     Scanner Pato = new Scanner(System.in);
     int posicion;
     int []numeros= new int [10];
         System.out.println("Ingrese los numeros");
         for (int contador = 0; contador < numeros.length; contador++) {
             numeros[contador]= Pato.nextInt();
         }
         System.out.println("INdice a eliminar");
         posicion = Pato.nextInt();
     
         for (int contador = posicion; contador < 9; contador++) {
             numeros[contador]= numeros[contador+1];
         }
         for (int contador = 0; contador < 9; contador++) {
             System.out.println(numeros[contador]);
         }
     }
}

        
    
    
    
    


    

