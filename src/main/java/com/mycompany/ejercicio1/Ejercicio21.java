
package com.mycompany.ejercicio1;
public class Ejercicio21 {
    public static void main(String[] args){
   System.out.println("Ejercicio 21"); 
int Array[] = {1,2,3,4,5};
       for (int contador = 0; contador < 5; contador++) {
           System.out.println("Array original: "+Array[contador]);
       }
       System.out.println("  ");
       for (int contador = Array.length-1; contador>=0 ; contador--) {
           System.out.println("Numeros invertidos: "+Array[contador]);
       }
   }
}

    

