
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");
     int Elem;
     Scanner polo = new Scanner(System.in);
     System.out.println(" Ingrese el numero de elementos");
     Elem= polo.nextInt();
     
   int []numeros = new int[Elem];
    
        for (int pato = 0; pato < Elem; pato++) {
              System.out.println((pato)+" Ingrese los numeros");
              numeros[pato] = polo.nextInt();
        }
        
        for (int pato = 0; pato < Elem; pato++) { 
            if (numeros[pato]>0) {
        System.out.println("El numero es positivo:"+ numeros[pato]);
        }else if(numeros[pato]<0){
            System.out.println(" El numero es negativo"+ numeros[pato]);
        }
                
            }
     }
}

    

