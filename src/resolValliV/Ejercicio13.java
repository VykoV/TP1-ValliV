package resolValliV;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alumno = new String[3];
        double[][] nota = new double[3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println(" Ingrese nombre de alumno nro " + (i+1));
            alumno[i] = scanner.nextLine();

            for (int j = 0; j < 5; j++) {
                System.out.println(" Ingrese nota: " + (j+1));
                nota[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }
        double prom;
        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for(int j = 0; j < 5; j++) {
                sum= sum + nota[i][j];
            }
            prom=sum/5;
            System.out.println(" El promedio del alumno " + alumno[i] + " es de:" + prom);
        }

    }
}
