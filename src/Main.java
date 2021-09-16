import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Persona p1 = new Persona(); Persona p2 = new Persona(); Persona p3 = new
         * Persona(); Persona p4 = new Persona(); Persona px = new Persona(); Persona
         * alumno = new Persona(); px.mayordeEdad(); p1.mayordeEdad();
         * 
         */

        // Profesor prof1 = new Profesor(); prof1.materias = "Intro a la Programacion";

        int numeros[] = new int[4];// declarando un arreglo de 4 elementos

        int arreglo[] = { 35, 89, 9, -92, 3, 63, -1, -43, 7, 6, 7, 34, 5 };

        System.out.println("cantidad de Elementos: " + arreglo.length);

        for (int f = 0; f < arreglo.length; f++) {

            System.out.println(arreglo[f]);

        }

        String paises[] = { "Argentina", "Peru", "Brasil" };

        for (int i = 0; i < paises.length; i++) {

            System.out.println(paises[i]);

        }

        // Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Provincias a procesar");

        String[] provincias = new String[4];// aqui va la cantidad de provincias

        for (int f = 0; f < provincias.length; f++) {

            System.out.println("Ingrese la provincia");
            provincias[f] = teclado.nextLine();

        }

        System.out.println("----------");

        for (int i = 0; i < provincias.length; i++) {

            System.out.println(provincias[i]);

        }

    }

}
