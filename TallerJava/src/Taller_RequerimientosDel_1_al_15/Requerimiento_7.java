package Taller_RequerimientosDel_1_al_15;

import java.util.Scanner;


// prueba si el numero ingresado es mayor a cero y si no lo es lo vuelve a pedir hasta que sea mayor a cero
public class Requerimiento_7 {
    static Scanner captura = new Scanner(System.in);

    public static String comprobar (double a){

        do{

            System.out.println("Ingrese un numero mayor a 0:");
            a = Double.parseDouble((captura.nextLine()));

        }while (a <= 0);

        return String.valueOf(a);

    }

    public static void main(String[] args){
        System.out.println("Ingrese un numero mayor a 0:");

        System.out.println(comprobar(Double.parseDouble(captura.nextLine())));

    }
}
