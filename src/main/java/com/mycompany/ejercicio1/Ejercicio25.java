
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args){
        System.out.println("Ejercicio numero 25");
   char[] contrasena = {'A', 'x', '5', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        
        boolean cumpleRequisitos = verificarContrasena(contrasena);
        
        if (cumpleRequisitos) {
            System.out.println("La contraseña cumple con los requisitos.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }
    public static boolean verificarContrasena(char[] contrasena) {
        
        if (contrasena.length < 8) {
            return false;
        }
        
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;
        
        for (char c : contrasena) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            } else {
                tieneSimbolo = true;
            }
        }
        
        return tieneMayuscula && tieneMinuscula && tieneDigito && tieneSimbolo;
    
}
}

    

