import java.util.Scanner;

public class Arreglos1 {

    int[] arreglo;
    Scanner teclado;

    public void llenarArreglo() {

        teclado = new Scanner(System.in);
        arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Ingrese elemento");
            arreglo[i] = teclado.nextInt();

        }

    }

    public void mostrarArreglo() {

        for (int f = 0; f < 10; f++) {

            System.out.println(arreglo[f]);

        }

    }

}
