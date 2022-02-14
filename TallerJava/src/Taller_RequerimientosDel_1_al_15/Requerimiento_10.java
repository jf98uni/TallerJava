package Taller_RequerimientosDel_1_al_15;

import java.util.Scanner;

public class Requerimiento_10 {
    static Scanner captura = new Scanner(System.in);

    // quita los espacio a una frase ingresada por el usuario.

    public static String quitarEspacios (String phrase){
        return phrase.replace(" ","");
    }

    public static void main(String[] args){
        System.out.println("Escriba una frase");
        System.out.println(quitarEspacios(captura.nextLine()));


    }
}
