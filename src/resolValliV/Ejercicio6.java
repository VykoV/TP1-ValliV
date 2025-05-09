package resolValliV;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6 (){
        Scanner scanner = new Scanner(System.in);

        double random = Math.round(Math.random() * 100);
        /*System.out.println("random = " + random);*/

        System.out.println("Ingresar un numero del 1 al 100");
        int numero = 0;
        int contador = 0;
        do{
             numero = scanner.nextInt();
            if(numero==random){
                contador ++;
                System.out.println("¡Ha adivinado el numero!" + "\nEl numero: " + random + "\nCantidad de intentos:" + contador );

            }else if(numero > random) {
                contador ++;
                System.out.println("El numero es mas bajo \nIntente nuevamente" );
            } else if (numero < random) {
                contador ++;
                System.out.println("El numero es mas alto \nIntente nuevamente" );
            }
        }while (numero!=random);

    }
}
