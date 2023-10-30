
package com.mycompany.ejercicio1;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6");
       String[] nombresPokemonA = {
"Pikachu",
"Charizard",
"Bulbasaur",
"Squirtle",
"Jigglypuff",
"Eevee",
"Mewtwo",
"Snorlax",
"Gengar",
"Machamp"
};
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
String [] nombrespokemonc = new String[20];
int contadores = 0;          

               
          for (int contador = 0; contador < 10; contador++) {
             nombrespokemonc[contadores] = nombresPokemonA[contador];
             contadores++;
             
             nombrespokemonc[contadores] = nombresPokemonB[contador];
             contadores++;
        }
          
         
        System.out.println("\n El tercer arreglo es:");
           
            for (int contador = 0; contador < nombrespokemonc.length; contador++) {
                System.out.println(""+nombrespokemonc[contador]);
        }
          
}

}

    

