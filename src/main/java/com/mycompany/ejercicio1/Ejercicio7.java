
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio7 {public static void main(String[] args) {
        System.out.println("Ejercicio 7");
    Scanner Gallo =new Scanner(System.in);      
    int [] N = new int[10];   
    boolean Creciente = false;  boolean Decreciente = false;
        for (int contador = 0; contador < N.length; contador++) {
            System.out.println("Ingrese los numeros");
            N[contador] = Gallo.nextInt();
        }
     for (int contador = 0; contador < N.length; contador++) {
            System.out.println( N[contador]);
        }
    for( int contador =0; contador<9; contador++){
        if (N[contador]< N[contador+1]) {
        Creciente= true;   
        }   
        if (N[contador]>N[contador+1]) {
        Decreciente= true;
        }
         if (Creciente == true && Decreciente == false ) {
         System.out.println("Los numeros son crecientestes"+ N[contador]);
        } else if (Creciente == false && Decreciente==true){
         System.out.println("Los numeros son decrecientes"+N[contador+1]);
        }else if( Creciente==true && Decreciente==true){
             System.out.println(" Los numeros estan desordenados"+ N[contador]);
        }else if(Creciente == false && Decreciente == false){
         System.out.println("Todos los numeros son iguales"+N[contador]);
        }
        }
    } 
    
    
    
}

    

