import java.util.Scanner;

public class Registro {

    int[] notas;
    String[] nombres;

    Scanner teclado;

    // CONSTRUCTOR
    Registro() {

        int cantidad = 0;
        teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de notas a procesar");
        cantidad = teclado.nextInt();

        notas = new int[cantidad];
        nombres = new String[cantidad];

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Ingrese el nombre de cada alumno");
            nombres[i] = teclado.next();

            System.out.println("Ingrese la nota del alumno");
            notas[i] = teclado.nextInt();

        }

    }

    public void mostrarpromedionotas() {

        for (int i = 0; i < nombres.length; i++) {

        }
        System.out.println("Las notas son:" + notas);

    }

    public void notasmayores() {
        System.out.println("La notas es mayor");

    }

    public void notasmenores() {
        System.out.println("La nota es menor");
    }

}
