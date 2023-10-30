
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        System.out.println("Ejercicio 15");
      Scanner pato = new Scanner(System.in);
    String[] nombresPokemon = {"pikachu", "charizard",
"bulbasaur", "squirtle", "jigglypuff"};

int[] poderesPokemon = {100, 150, 80, 90, 120};
    
int cantidaddepoder=0;
String nombres ;

        System.out.println("Ingres el nombre del pokemon ");
        nombres = pato.next();

        System.out.println("Ingres la cantidad de poder del pokemon ");
        cantidaddepoder = pato.nextInt();

        for (int contador = 0; contador < 5; contador++) {
            if (nombresPokemon[contador].equals(nombres)) {
                System.out.println("El nombre del pokemon es: "+ nombresPokemon[contador]);
            
            }}
        
            for (int contador2 = 0; contador2 < poderesPokemon.length; contador2++) {
                
                if (poderesPokemon[contador2]<=cantidaddepoder) {
                    poderesPokemon[contador2] = cantidaddepoder;
                    System.out.println("La nueva cantidad de poder es:"+ poderesPokemon[contador2]);    
                }
                
                break;
            }
            
        }
}


