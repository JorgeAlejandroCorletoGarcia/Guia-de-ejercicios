
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Scanner teclado = new Scanner( System.in );
		int d[];
		 d = new int[5];
		 for (int i=0;i<5;i++)
		 {
		 System.out.print("Dijite un número: ");
		 d[i]=teclado.nextInt();
		 }
		 System.out.println("Los números son:");
		 for (int i=0;i<5;i++)
		 System.out.println(d[i]);  
    }
}
