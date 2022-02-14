package Taller_RequerimientosDel_1_al_14;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Requerimiento_14 {

    static Scanner captura = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Escribe el numero");

        String numero = captura.nextLine();

        int temp = Integer.parseInt(numero);

        for (int i = temp ; i <= 1000; i = i + 2){

            System.out.println(i);

        }

    }
}
