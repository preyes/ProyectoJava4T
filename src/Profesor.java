
import java.util.Scanner;

public class Profesor {

    String nombre;
    String apellido;
    String materias;
    int dias;
    Scanner teclado;

    Profesor(int dias) {

        this.dias = 0;
    }

    Profesor() {

        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = teclado.next();

    }

}
