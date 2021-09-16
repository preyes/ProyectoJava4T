public class MainNotas {

    public static void main(String[] args) {

        String[] alumnos = { "Pepito", "juancito", "Cristiancito", "Jorgito", "Ronaldito" };
        int[] notas = { 8, 3, 6, 8, 9 };

        int mayor = notas[0]; // se guarda 8
        int pos = 0;

        for (int i = 1; i < notas.length; i++) {// se recorre el arreglo con i

            if (mayor < notas[i]) // Se compara mayor con cada elemento del arreglo notas
            {
                mayor = notas[i];// se guarda la nota mayor del arreglo
                pos = i; // se guarda la posicion 4

            }

        }

        System.out.println("La nota mayor es: " + mayor + " Corresponde a: " + alumnos[pos]);

    }

}
