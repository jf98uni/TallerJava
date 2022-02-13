package Taller;

import java.util.Scanner;

// cuenta la cantidad de letras
public class LongitudFrase {
    static Scanner captura = new Scanner(System.in);
    public static String contador (String phrase){
        return "La longitud es de:" + phrase.length();
    }
    // devuelve la cantidad de vocales
    public static String contadorBocales (String frase){
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int x = 0; x < frase.length(); x++) {
            char actual = frase.toLowerCase().charAt(x);

            switch (actual) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        return "Total de vocales: " + (a+e+i+o+u);
    }

    public static void main(String[] args){
        System.out.println("Escriba una frase");
        // le quita los espacios a la frase que ingresa
        String letras = captura.nextLine().replace(" ","");
        System.out.println(contador(letras));

        System.out.println(contadorBocales(letras));
    }
}
