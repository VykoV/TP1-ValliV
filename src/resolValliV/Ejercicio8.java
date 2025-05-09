package resolValliV;

import java.util.Scanner;

public class Ejercicio8 {
    public void ejercicio8 (){
        Scanner scanner = new Scanner (System.in);

        System.out.println("¡Bienvenido!\n1. Convertir Celsius a Fahrenheit\n2. Convertir Fahrenheit a Celsius\n3.Salir");
        int opcion = scanner.nextInt();
        double grados;

        if((opcion==1) || (opcion==2)){
            System.out.println("Ingrese los grados que quiere convertir");
            grados = scanner.nextDouble();
            switch (opcion){
                case 1:
                    double F = (grados*9/5)+32;
                    System.out.println("Celsius a Fahrenheit = " + F);
                    break;
                case 2:
                    double C = (grados-32)*5/9;
                    System.out.println("Fahrenheit a Celsius = " + C);
                    break;
            }
        }else if(opcion==3){
            System.exit(0);
        }else{
            System.out.println("Numero no corresponde a las opciones, intente de nuevo");
            ejercicio8();
        }
    }
}
