import java.util.Scanner;

public class Main {
    static Scanner teclado;

    public static void main(String[] args) {

        /*
         * Persona p1 = new Persona(); Persona p2 = new Persona(); Persona p3 = new
         * Persona(); Persona p4 = new Persona(); Persona px = new Persona(); Persona
         * alumno = new Persona(); px.mayordeEdad(); p1.mayordeEdad();
         * 
         */

        // Profesor prof1 = new Profesor(); prof1.materias = "Intro a la Programacion";

        // Declaracion de un arreglo de 4 elementos

        int[] numeros = new int[4]; // [8,15,3,72]
                                    // 0 1 2 3

        for (int f = 4; f < 4; f++) {

            System.out.println("Ingrese el numero");

            numeros[f] = teclado.nextInt();// 8, 15, 3, 72

        }

        int[] arreglo = { 35, 89, 9, -92, 3, 63, -1, -43, 7, 6, 7, 34, 5 };

        // Imprime la cantidad de elementos de un arreglo con .length
        System.out.println("cantidad de Elementos: " + arreglo.length);
        int acum = 0;
        for (int f = 0; f < arreglo.length; f++) {

            System.out.println(arreglo[f]);
            acum = arreglo[f] + acum;
        }

        String[] paises = { "Argentina", "Peru", "Brasil" };

        for (int i = 0; i < paises.length; i++) {

            System.out.println(paises[i]);

        }

        // Programa que ingresa la cantidad de datos a cargar en el arreglo
        teclado = new Scanner(System.in);
        int cantidad = 0; // declaramos una variable cantidad
        System.out.println("Ingrese la cantidad de Provincias a cargar");
        cantidad = teclado.nextInt(); // 5

        String[] provincias = new String[cantidad];// 5 aqui va la cantidad de provincias

        for (int f = 0; f < provincias.length; f++) {

            System.out.println("Ingrese la provincia");
            provincias[f] = teclado.next();

        }

        System.out.println("----------");

        for (int i = 0; i < provincias.length; i++) {

            System.out.println(provincias[i]);

        }

    }

}
