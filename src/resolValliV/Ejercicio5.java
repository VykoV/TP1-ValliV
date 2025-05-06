package resolValliV;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] arg){
        /* Importo java.util.Scanner */
        Scanner scanner = new Scanner (System.in);

        /* Ingreso una palabra */
        System.out.println("Ingrese una palabra");
        String palabra = scanner.next().toLowerCase();

        /* Cantidad de letras */
        int letras = palabra.length();
        /*System.out.println("La palabra contiene " + letras + " letras");*/

        int j = Math.round((float) letras /2);

        int contador = 0;
        int aux= letras-1;

        for (int i = 0; i < j; i++) {

            if (palabra.charAt(i)==palabra.charAt(aux)){
                contador ++;
            }

            /*System.out.println("Letra posicion " + i + ": " + palabra.charAt(i) + "\nLetra posicion " + (aux) + ": " + palabra.charAt(aux));*/
            aux--;
        }

        if (contador==j){
            System.out.println("La palabra " + palabra + " es palíndroma");
        } else {
            System.out.println("La palabra " + palabra + " no es palíndroma");
        }


    }
}
