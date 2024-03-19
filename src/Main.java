public class Main {
    public static void main(String[] args) {

        String[][] vinilos = new String[100][3];
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        System.out.println("espacio máximo coleccion: " +vinilos.length );
        contarVinilos(vinilos);
        contarEspaciosLibres(vinilos);

        buscarArtista(vinilos, "Iron Maiden");
        buscarArtista(vinilos, "The Beatles");

        mostrarVinilos(vinilos);

    }

    public static void agregarVinilo(String[][] vinilos, String artista, String album, String año) {
        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] == null) {
                vinilos[i][0] = artista;
                vinilos[i][1] = album;
                vinilos[i][2] = año;
                System.out.println("Vinilo agregado correctamente.");
                return;
            }
        }
        System.out.println("No se pudo agregar el vinilo. El arreglo está lleno.");
    }

    public static void mostrarVinilos(String[][] vinilos) {
        System.out.println("Lista de vinilos:");
        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] != null) {
                System.out.print("/ Artista: " + vinilos[i][0]);
                System.out.print(" / Álbum: " + vinilos[i][1]);
                System.out.print(" / Año: " + vinilos[i][2] + " /");
                System.out.println();
            }
        }
    }
    public static void contarVinilos(String[][] vinilos) {
        int contadorVinilos = 0; // Variable para contar los vinilos

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] != null) { // Verificar si hay un vinilo en esta posición
                contadorVinilos++; // Incrementar el contador de vinilos
            }
        }

        // Imprimir la cantidad total de vinilos
        System.out.println("Total de vinilos en la colección: " + contadorVinilos);
    }

    // Función para contar e imprimir la cantidad de espacios libres en la colección
    public static void contarEspaciosLibres(String[][] vinilos) {
        int espaciosLibres = 0; // Variable para contar los espacios libres

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] == null) { // Verificar si hay un espacio libre en esta posición
                espaciosLibres++; // Incrementar el contador de espacios libres
            }
        }

        // Imprimir la cantidad total de espacios libres
        System.out.println("Espacios libres en la colección: " + espaciosLibres);
    }

    // Función para buscar un artista en la colección
    public static void buscarArtista(String[][] vinilos, String nombreArtista) {
        boolean encontrado = false; // Variable para indicar si se encontró el artista

        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] != null && vinilos[i][0].equalsIgnoreCase(nombreArtista)) { // Comparar ignorando mayúsculas y minúsculas
                encontrado = true;
                break; // Si se encuentra el artista, salir del bucle
            }
        }

        // Imprimir si se encontró o no el artista
        if (encontrado) {
            System.out.println("El artista \"" + nombreArtista + "\" está presente en la colección.");
        } else {
            System.out.println("El artista \"" + nombreArtista + "\" no está presente en la colección.");
        }
    }


}