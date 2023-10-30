
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
       int poderes=0;
       String name="" ;
       System.out.println("Ejercicio 16");
   String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur",
"Squirtle"};
int[] poderesPokemon = {100, 150, 80, 90};
   
       for (int contador = 0; contador < poderesPokemon.length; contador++) {
           if (poderesPokemon[contador]> poderesPokemon[poderes]) {
               
               poderes=contador;
           }
       }
   
       for (int contador = 0; contador < nombresPokemon.length; contador++) {
          name = nombresPokemon[poderes];
       }
       
       System.out.println("El nombre del pokemon con la mayor cantidad de poder es: "+name+ 
               " Y su cantidad de poder es:"+poderesPokemon[poderes]);
   }  
}

    

