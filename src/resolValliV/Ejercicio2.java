package resolValliV;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /* Importo java.util.Scanner */
        Scanner scanner= new Scanner(System.in);

        /* Ingreso el numero x consola */
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();

        /* Verifico si el resultado de la division tiene residuo */
        if (numero % 2 != 0){
            /* Si tiene residuos es impar */
            System.out.println("Es impar");
        }else{
            /* Si no tiene residuos es par */
            System.out.println("Es par");
        }
    }
}
