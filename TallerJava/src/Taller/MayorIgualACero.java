package Taller;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class MayorIgualACero {
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
