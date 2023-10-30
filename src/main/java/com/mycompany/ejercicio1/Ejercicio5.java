
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
      int Elem,mayor,menor;
       System.out.println("Ejercicio 5");
     Scanner polo = new Scanner(System.in);
     System.out.println(" Ingrese el numero de elementos");
     Elem= polo.nextInt();
   int []numeros = new int[Elem];
        for (int pato = 0; pato < numeros.length; pato++) {
              System.out.println((pato)+" Digite los numeros");
              numeros[pato] = polo.nextInt();
        }     
        mayor=menor=numeros[0];
        for (int pato = 0; pato < numeros.length; pato++) { 
            if (numeros[pato]>mayor) {
                mayor = numeros[pato];
        }else if(numeros[pato]<menor){
            menor= numeros[pato];
        }
            }
                System.out.println("El numero es mayor:"+ mayor);
                 System.out.println(" El numero es menor: "+ menor);

    }
    
}

    

