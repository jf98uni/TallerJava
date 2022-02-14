package Taller_RequerimientosDel_1_al_15;

import java.util.Scanner;

public class Requerimiento_8 {
    static Scanner captura = new Scanner(System.in);
    // compara el dato ingresado por el usuario con los casos y retorna si es dia habil o no
    public static String comparador (String dia)
    {

        boolean habil = true;
        // le dice al programa que retornar dependiendo del dia ingresado, si no lo encuentra lo vuelve a pedir
        switch (dia)
        {
            case "lunes":
                break;
            case "martes":
                break;
            case "miercoles":
                break;
            case "jueves":
                break;
            case "viernes":
                break;
            case "sabado":
                return ("No es dia habil");
            case "domingo":
                return ("No es dia habil");

            default:
                System.out.println("Por favor vuelva a ingresar el dia");
                System.out.println(comparador(captura.nextLine().toLowerCase()));
                habil = false;
                break;
        }

        if (habil){
            return "Es dia habil";
        }

        return "";

    }

    public static void main(String[] args){
        System.out.println("Escriba un dia: ");
        System.out.println(comparador(captura.nextLine().toLowerCase()));
    }
}

