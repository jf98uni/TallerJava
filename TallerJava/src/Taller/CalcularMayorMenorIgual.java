package Taller;

import java.security.DrbgParameters;
import java.util.Scanner;

// calcula si un numero es mayor, menor o igual a otro
public class CalcularMayorMenorIgual {
    static Scanner captura = new Scanner(System.in);

    // pide dos numeros y regra el mayor o dice sin son iguales
    public static String comparar (Double a, double b){

        if (a > b ){
            return ("El numero "+ a +" es mayor");
        }
        else if (b >a ){

            return ("El numero "+ b +" es mayor");

        }
        return "son iguales";
    }
    // pide los parametros y devuelve el resultado
    public static void main(String[] args) {
        // write your code here
        System.out.println("Ingrese el primer numero:");
        Double a = Double.parseDouble((captura.nextLine()));

        System.out.println("Ingrese el segundo numero:");
        Double b = Double.parseDouble( captura.nextLine());

        System.out.println(comparar(a,b));

    }


}
