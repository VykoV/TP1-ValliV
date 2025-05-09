package resolValliV;

import java.util.Scanner;

public class Ejercicio12 {
    public  void ejercicio12 () {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingrese un numero ");
        int[] num = new int[5];
        int[] aux = new int[5];

        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
            aux[i] = num[i];
        }

        for (int i = 0; i < 5 - 1; i++) {
            int min = i;
            for (int j = i + 1; j < 5; j++) {
                if (aux[j] > aux[min]) {
                    min = j;
                }
            }
            int aux1 = aux[i];
            aux[i] = aux[min];
            aux[min] = aux1;
        }
        System.out.print("Arreglo origina: ");
        for (int i = 0; i < 5; i++) {
            System.out.print( num[i] + " ");
        }
        System.out.print("\nArreglo ordenado: ");
        for (int i = 0; i < 5; i++) {
            System.out.print( aux[i] + " ");
        }
    }
}
