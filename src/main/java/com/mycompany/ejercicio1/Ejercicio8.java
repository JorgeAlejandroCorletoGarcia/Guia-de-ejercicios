
package com.mycompany.ejercicio1;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
Scanner gallo = new Scanner(System.in);
int aux=0,numero=0;
int posicion=0;
    System.out.println("Ejercicio 8");
int[] numeros = new int [10];
        System.out.println("Ingrese los numeros");
    for (int contador = 0; contador < 8; contador++) {
        numeros[contador] = gallo.nextInt();
    }
    for (int contador = 7; contador >= posicion; contador--) {
        numeros[contador+1]=numeros[contador];
    } 
        System.out.println("Ingrese el numero ");
        numero=gallo.nextInt();
    
        System.out.println("Ingrese la posicion ");
        posicion=gallo.nextInt();
numeros[posicion]=numero;
            System.out.println("Resltados");  
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println(numeros[contador]);            
    }   
}

}

    

