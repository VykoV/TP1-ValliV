package resolValliV;

import java.util.Scanner;

public class Ejercicio10 {
    public void ejercicio10 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la contraseña");
        String password = scanner.nextLine().trim();

        int j = password.length();
        int contarDig = 0;
        int contarletMayus = 0;
        int contarletMinus= 0;
        String mayus = password.toUpperCase();
        for (int i = 0; i < j ; i++) {
            char c =  password.charAt(i);
            if(Character.isDigit(c)){
                contarDig++;
            }else if(Character.isLetter(c)){
                if(c==mayus.charAt(i)){
                    contarletMayus++;
                }else{
                    contarletMinus++;
                }
            }

        }

        if(j>=8 && contarletMayus>=2 && contarletMinus>=3 && contarDig>=2){
            System.out.println("Tu contraseña es segura");
        }else{
            System.out.println("Tu contraseña no es segura.\nTu contraseña debe tener: ");
            if (j<8){
                System.out.println("→ Por lo menos 8 caracteres");
            }
            if (contarletMayus<2){
                System.out.println("→ Por lo menos 2 letras mayusculas");
            }
            if (contarletMinus<3){
                System.out.println("→ Por lo menos 3 letras minusculas");
            }
            if (contarDig<2) {
                System.out.println("→ Por lo menos 2 digitos numericos");
            }
        }

    }
}
