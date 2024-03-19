public class Main {
    public static void main(String[] args) {

        String[][] vinilos = new String[100][3];
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        mostrarVinilos(vinilos);

    }


    // Función para agregar un vinilo al arreglo
    public static void agregarVinilo(String[][] vinilos, String artista, String album, String año) {
        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] == null) { // Buscar la primera posición vacía para agregar el vinilo
                vinilos[i][0] = artista;
                vinilos[i][1] = album;
                vinilos[i][2] = año;
                System.out.println("Vinilo agregado correctamente.");
                return; // Salir de la función después de agregar el vinilo
            }
        }
        System.out.println("No se pudo agregar el vinilo. El arreglo está lleno.");
    }

    // Función para mostrar todos los vinilos agregados al arreglo
    public static void mostrarVinilos(String[][] vinilos) {
        System.out.println("Lista de vinilos:");
        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] != null) { // Verificar si hay un vinilo en esta posición
                System.out.print("/Artista: " + vinilos[i][0]);
                System.out.print("/ Álbum: " + vinilos[i][1]);
                System.out.print("/ Año: " + vinilos[i][2] + "/");
                System.out.println(); // Añadir una línea en blanco entre cada vinilo
            }
        }
    }



}