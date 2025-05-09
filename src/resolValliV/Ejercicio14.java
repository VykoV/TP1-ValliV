package resolValliV;

public class Ejercicio14 {

    public static void mostrar (int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  void ejercicio14 (){
        int[][] matriz = {
                {1,2,0,3,0,7},
                {0,0,0,0},
                {0,6,9,8,0,9,6},
                {0,0,0,0,7,9,0,0},
                {0,0,0,0,0},
                {8,7,0,8,9,0,8}
        };
        System.out.println("Matriz original:");

        mostrar(matriz);

        int filasSinCeros = 0;
        for (int i = 0; i < matriz.length; i++) {
            boolean filaDato = false;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    filaDato = true;
                    break;
                }
            }
            if (filaDato) {
                filasSinCeros++;
            }
        }

        int[][] matrizSinCeros = new int[filasSinCeros][];
        int filaActual = 0;

        for (int i = 0; i < matriz.length; i++) {
            int cantidadNoCeros = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    cantidadNoCeros++;
                }
            }

            if (cantidadNoCeros > 0) {
                matrizSinCeros[filaActual] = new int[cantidadNoCeros];
                int pos = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != 0) {
                        matrizSinCeros[filaActual][pos] = matriz[i][j];
                        pos++;
                    }
                }
                filaActual++;
            }
        }
        System.out.println("Matriz sin ceros:");
        mostrar(matrizSinCeros);
    }
}
