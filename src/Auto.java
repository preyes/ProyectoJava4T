public class Auto {

    // Atributos o caracteristas de
    String marca;
    String patente;
    String color;
    boolean encender;

    // Metodos

    Auto(String m, String p, String c, boolean e) {

        this.marca = m;
        this.patente = "PATENTE: " + p;
        this.color = c;
        this.encender = e;

    }

    public void encender(boolean encendido) {

        this.encender = encendido;
    }

    public void MostrarDatos() {

        String mensaje = "La Marca es:" + marca + " El color es:" + color;
        System.out.println(mensaje);
    }

    public int suma(int a, int b) {

        int suma = a + b;

        return suma;

    }

    void encendido(boolean e) {

        this.encender = e;

    }

}
