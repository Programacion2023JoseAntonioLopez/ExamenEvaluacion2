public class Ejercicio1y2 {
    public static int[] ejercicio1(int[] array, int posicion, int elemento) {

        // Crear un nuevo array con un tamaño 1 mayor que el array original
        int[] nuevoArray = new int[array.length + 1];

        // Copiar los elementos hasta la posición deseada
        for (int i = 0; i < posicion; i++) {
            nuevoArray[i] = array[i];
        }

        // Insertar el nuevo elemento en la posición deseada
        nuevoArray[posicion] = elemento;

        // Copiar los elementos desde la posición deseada hasta el final del array original
        for (int i = posicion + 1; i < nuevoArray.length; i++) {
            nuevoArray[i] = array[i - 1];
        }

        return nuevoArray;
    }

    public static int[][] Ejercicio2(int[][] array1, int[][] array2) {
        int filas = array1.length;
        int columnas = array1[0].length;

        // Crear un nuevo array para almacenar los mayores en cada posición
        int[][] resultado = new int[filas][columnas];

        // Comparar los valores de cada posición y almacenar el mayor en el nuevo array
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (array1[i][j] > array2[i][j])
                    resultado[i][j] = array1[i][j];
                else
                    resultado[i][j] = array2[i][j];
            }
        }

        return resultado;
    }
}
