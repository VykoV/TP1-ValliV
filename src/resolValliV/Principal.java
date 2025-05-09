package resolValliV;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que programa quiere ejecutar?" +
                "\n01. Ejercicio 1: Programa saludador" +
                "\n02. Ejercicio 2: Numero Par" +
                "\n03. Ejercicio 3 : Tabla de multiplicar" +
                "\n04. Ejercicio 4: Contar vocales en una palabra" +
                "\n05. Ejercicio 5: Palíndromo" +
                "\n06. Ejercicio 6: Adivina el número" +
                "\n07. Ejercicio 7: Menú interactivo" +
                "\n08. Ejercicio 8: Conversor de temperatura" +
                "\n09. Ejercicio 9: Cuenta palabras" +
                "\n10. Ejercicio 10: Validar contraseña segura" +
                "\n11. Ejercicio 11: Fibonacci" +
                "\n12. Ejercicio 12: Arreglo unidimensional" +
                "\n13. Ejercicio 13: Notas de estudiantes" +
                "\n14. Ejercicio 14: Quitando ceros" +
                "\n15. Salir");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.ejercicio1();
                break;
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.ejercicio3();
                break;
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.ejercicio5();
                break;
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.ejercicio6();
                break;
            case 7:
                Ejercicio7 ejercicio7 = new Ejercicio7();
                ejercicio7.ejercicio7();
                break;
            case 8:
                Ejercicio8 ejercicio8 = new Ejercicio8();
                ejercicio8.ejercicio8();
                break;
            case 9:
                Ejercicio9 ejercicio9 = new Ejercicio9();
                ejercicio9.ejercicio9();
                break;
            case 10:
                Ejercicio10 ejercicio10 = new Ejercicio10();
                ejercicio10.ejercicio10();
                break;
            case 11:
                Ejercicio11 ejercicio11 = new Ejercicio11();
                ejercicio11.ejercicio11();
                break;
            case 12:
                Ejercicio12 ejercicio12 = new Ejercicio12();
                ejercicio12.ejercicio12();
                break;
            case 13:
                Ejercicio13 ejercicio13 = new Ejercicio13();
                ejercicio13.ejercicio13();
                break;
            case 14:
                Ejercicio14 ejercicio14 = new Ejercicio14();
                ejercicio14.ejercicio14();
                break;
            case 15:
                System.exit(0);
            default:
                System.out.println("Ejercicio no existente, intente de nuevo ");
                main(args);
        }
    }

}