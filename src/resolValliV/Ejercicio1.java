package resolValliV;

import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1() {
        /*Declaro Java.util.Scanner*/
        Scanner scanner=new Scanner(System.in);

        /* Ingreso del nombre*/
        System.out.println("Ingrese su nombre");
        String nombre= scanner.nextLine();

        /* Salida del nombre*/
        System.out.println("¡Hola " + nombre + "!");
    }
}