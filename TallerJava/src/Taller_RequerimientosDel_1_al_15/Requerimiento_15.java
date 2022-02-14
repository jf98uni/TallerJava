package Taller_RequerimientosDel_1_al_15;

import java.util.Scanner;

public class Requerimiento_15 {

    static Scanner captura = new Scanner(System.in);

    public static void main(String[] args){

         // valor inicial del string
        String x = "0";

        // crea un ciclo que solo se rompe cuando el usuario ingresa 8
        while (x != "8"){


            // imprime el menu
            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            x = captura.nextLine();

            //compara el valor por parametro con las posibles opciones
            switch (x)
            {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    // cambia x a 8 para asi romper el ciclo
                    x = "8";
            }

        }

    }

}
