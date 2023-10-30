
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        String nombre;
        System.out.println("Ejercicio 12");
        Scanner pato = new Scanner(System.in);

      String[] nombresPokemonB = {
"Venusaur",
"Blastoise",
"Dragonite",
"Gyarados",
"Alakazam",
"Arcanine",
"Lapras",
"Golem",
"Gyarados",
"Rhydon"
};
        for (int contador = 0; contador < nombresPokemonB.length; contador++) {
            System.out.println(nombresPokemonB[contador]);
        }
          System.out.println("Ingrese el nombre del pokemon a buscar");
           nombre = pato.next();
          for (int contador = 0; contador < nombresPokemonB.length; contador++) {
           if (nombresPokemonB[contador].equals(nombre)) {                 
            System.out.println("El nombre del pokemon es: "+nombre+ " y la posicion es:"+contador);
            }
              
              
              
        }
    

    }
}
