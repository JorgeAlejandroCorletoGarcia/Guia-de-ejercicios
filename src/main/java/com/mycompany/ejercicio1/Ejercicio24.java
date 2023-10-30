
package com.mycompany.ejercicio1;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
public class Ejercicio24 {
    public static void main(String[] args){
        System.out.println("Ejercicio numero 24");
  
      int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
     
        HashSet<Integer> numerosSinDuplicados = new HashSet<>();
        for (int numero : arrayOriginal) {
            numerosSinDuplicados.add(numero);
        }
        
        int[] numerosSinDuplicadosArray = new int[numerosSinDuplicados.size()];
        int index = 0;
        for (int numero : numerosSinDuplicados) {
            numerosSinDuplicadosArray[index++] = numero;
        }
        
        System.out.println("Array sin duplicados"+Arrays.toString(numerosSinDuplicadosArray));
  }  
}


