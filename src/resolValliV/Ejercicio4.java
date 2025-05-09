package resolValliV;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4(){
        /* Importo Java.Util.Scanner */
        Scanner scanner = new Scanner(System.in);

        /* Ingreso una palabra */
        System.out.println("Ingrese una palabra");
        String palabra = scanner.next().toLowerCase();

        /* Cantidad de letras */
        int letras = palabra.length();

        System.out.println("La palabra contiene " + letras + " letras");

        /* Declaro la variable vocal */
        int vocal = 0;

        /* Cuento vocales */
        for (int i = 0; i < letras; i++) {
            if(palabra.charAt(i)=='a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='i' || palabra.charAt(i)=='o' || palabra.charAt(i)=='u'){
                vocal++;
            }
        }
        /*Muestro el resultado*/
        System.out.println("La cantidad de vocales que tiene la palabra '" + palabra + "' es: " + vocal);
    }
}
