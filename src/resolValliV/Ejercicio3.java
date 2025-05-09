package resolValliV;

import java.util.Scanner;

public class Ejercicio3 {
    public  void ejercicio3(){
        /* Importo Java.Util.Scanner */
        Scanner scanner = new Scanner(System.in);

        /* Ingreso el dato */
        System.out.println("Ingresar un Numero Entero");
        int numero = scanner.nextInt();

        /* Creo una variable contar */
        int contar = 1;

        /* Multiplico el numero del 1 al 10 */
        for(int i=0; i<10; i++ ){
            int multiplicar = numero * contar;
            System.out.println(contar + " x " + numero + " = " + multiplicar);
            contar++;
        }
    }
}
