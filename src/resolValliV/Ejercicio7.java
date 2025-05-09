package resolValliV;

import java.util.Scanner;

public class Ejercicio7 {
    public void ejercicio7 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una opcion \n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Valor absoluto\n6.Potenciacion\n7.Raiz Cuadrada\n8.Salir");
        int opcion = scanner.nextInt();
        int numero1=0;
        int numero2=0;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer numero a sumar");
                numero1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero a sumar");
                numero2 = scanner.nextInt();

                int suma = numero1 + numero2;

                System.out.println(numero1 + " + " + numero2 + " = " + suma);
                break;
            case 2:
                System.out.println("Ingrese el primer numero a restar");
                numero1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero a restar");
                numero2 = scanner.nextInt();

                int resta = numero1 - numero2;

                System.out.println(numero1 + " - " + numero2 + " = " + resta);
                break;
            case 3:
                System.out.println("Ingrese el primer numero a multiplicar");
                numero1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero a multiplicar");
                numero2 = scanner.nextInt();

                int multi = numero1 * numero2;

                System.out.println(numero1 + " x " + numero2 + " = " + multi);
                break;
            case 4:
                System.out.println("Ingrese el primer numero a dividir");
                numero1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero a dividir");
                numero2 = scanner.nextInt();

                int div = numero1 / numero2;

                System.out.println(numero1 + " / " + numero2 + " = " + div);
                break;
            case 5:
                System.out.println("Ingrese un numero");
                numero1 = scanner.nextInt();
                System.out.println("El valor absoluto de " + numero1 + " es: " + Math.abs(numero1));
                break;
            case 6:
                System.out.println("Ingrese base");
                numero1 = scanner.nextInt();
                System.out.println("Ingrese exponente");
                numero2 = scanner.nextInt();

                double pot = Math.pow(numero1,numero2);

                System.out.println(numero1 + " ^ " + numero2 + " = " + pot);
                break;
            case 7:
                System.out.println("Ingrese un numero");
                numero1 = scanner.nextInt();

                double raiz = Math.sqrt(numero1);

                System.out.println(" √" + numero1 + " = " + raiz);
                break;
            case 8:
                System.exit(0);
                break;
        }


    }
}
