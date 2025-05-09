package resolValliV;

import java.util.Scanner;

public class Ejercicio9 {
    public void ejercicio9 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una oracion");
        String oracion = scanner.nextLine();

        String[] palabras = oracion.split("[\\s,¡!¿?.]+");

        int contadorPalabras = 0;
        for (int i = 0; i < palabras.length; i++) {
            /*String palabra = palabras[i];
            System.out.println(palabra);*/
            contadorPalabras++;
        }
        System.out.println("En esta oracion hay " + contadorPalabras + " palabras");
    }
}
