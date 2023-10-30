
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){ 
       System.out.println("Ejercicio 9");
      Scanner gallina = new Scanner(System.in);
     int [] N = new int [10];
       System.out.println("Ingrese los numeros");
       for (int contador = 0; contador < 10; contador++) {
           N[contador]= gallina.nextInt();
       }
       int finalj = N[9];
       for (int contador = 8; contador >=0; contador--) {
           N[contador+1] =N[contador];
       }
                N[0] = finalj;
       for (int contador = 0; contador < 10; contador++) {
           System.out.println(N[contador]);
       }
           }
}

    

