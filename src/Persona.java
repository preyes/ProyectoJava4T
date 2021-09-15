import java.util.Scanner;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    Scanner teclado;
    int dia;
    int mes;
    int año;

    Persona() {

        System.out.println("Ingrese un Nombre");
        nombre = teclado.next();

        System.out.println("Ingrese una edad");
        edad = teclado.nextInt();

    }

    public void mayordeEdad() {

        if (edad > 18) {
            System.out.println("La persona" + nombre + "es mayor de edad");

        } else {

            System.out.println("La persona" + nombre + "es menor de edad");
        }

    }

}
