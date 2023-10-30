
package com.mycompany.ejercicio1;
import java.util.Scanner;

public class Ejercicio28 {
   public static void main(String[] args){
        System.out.println("Ejercicio numero 28");
     Scanner scanner = new Scanner(System.in);

        int cantidadEstudiantes = ingresarEnteroEntre(scanner, "Ingrese la cantidad de estudiantes (entre 1 y 10): ", 1, 10);
        int cantidadPeriodos = ingresarEnteroEntre(scanner, "Ingrese la cantidad de períodos académicos (entre 3 y 5): ", 3, 5);

        double[][] calificaciones = new double[cantidadEstudiantes][cantidadPeriodos];

        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Ingresar calificaciones por período");
            System.out.println("2. Ingresar calificaciones por estudiante");
            System.out.println("3. Ver calificaciones");
            System.out.println("4. Salir");
            opcion = ingresarEnteroEntre(scanner, "Ingrese una opción: ", 1, 4);

            switch (opcion) {
                case 1:
                    int numeroPeriodo = ingresarEnteroEntre(scanner, "Ingrese el número de período (entre 1 y " + cantidadPeriodos + "): ", 1, cantidadPeriodos);
                    ingresarCalificacionesPorPeriodo(scanner, calificaciones, numeroPeriodo);
                    break;
                case 2:
                    int numeroEstudiante = ingresarEnteroEntre(scanner, "Ingrese el número de estudiante (entre 1 y " + cantidadEstudiantes + "): ", 1, cantidadEstudiantes);
                    numeroPeriodo = ingresarEnteroEntre(scanner, "Ingrese el número de período (entre 1 y " + cantidadPeriodos + "): ", 1, cantidadPeriodos);
                    ingresarCalificacionesPorEstudiante(scanner, calificaciones, numeroEstudiante, numeroPeriodo);
                    break;
                case 3:
                    verCalificaciones(calificaciones);
                    break;
            }
        } while (opcion != 4);

        System.out.println("Programa finalizado.");
    }

    public static int ingresarEnteroEntre(Scanner scanner, String mensaje, int min, int max) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
        } while (numero < min || numero > max);
        return numero;
    }

    public static void ingresarCalificacionesPorPeriodo(Scanner scanner, double[][] calificaciones, int numeroPeriodo) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " para el período " + numeroPeriodo + ": ");
            calificaciones[i][numeroPeriodo - 1] = scanner.nextDouble();
        }
    }

    public static void ingresarCalificacionesPorEstudiante(Scanner scanner, double[][] calificaciones, int numeroEstudiante, int numeroPeriodo) {
        System.out.print("Ingrese la calificación del estudiante " + numeroEstudiante + " para el período " + numeroPeriodo + ": ");
        calificaciones[numeroEstudiante - 1][numeroPeriodo - 1] = scanner.nextDouble();
    }

    public static void verCalificaciones(double[][] calificaciones) {
        System.out.println("Calificaciones:");
        System.out.print("Estudiante\t");
        for (int i = 0; i < calificaciones[0].length; i++) {
            System.out.print("Período " + (i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + "\t");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

}
