package resolValliV;

import java.util.Scanner;

public class Ejercicio11 {

    public static int fibonacci (int fib ){
        if (fib == 1 || fib == 2) {
            return 1;
        } else {
            return fibonacci(fib - 1) + fibonacci(fib - 2);
        }
    }

    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(fibonacci(i));
        }

    }
}
