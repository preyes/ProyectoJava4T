import java.util.Scanner;

public class BubleSort {

    int[] arreglo;
    Scanner teclado;

    public void llenarArreglo() {

        teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos que tendra el arreglo");
        int cantidad = teclado.nextInt();

        arreglo = new int[cantidad];

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Ingrese elemento");
            arreglo[i] = teclado.nextInt();

        }

    }

}
