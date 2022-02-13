package Taller;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Scanner;

public class Soniguales {

    static Scanner captura = new Scanner(System.in);


    public static String comparar (String a , String b) {

        String NuevaPalabra = "";
        String letdif = "";

        // verifica si las palabras son iguales 
        if (a.equals(b)){
            return "Son iguales";
        }

        // verifica si las palabras son igual de largas
        if (a.length() != b.length()){
            System.out.println("hola mundo");
            NuevaPalabra += ("Sus longitudes son diferentes, ");

        }

        //Crea arrays para adicionar las letras
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        //anade las letras del string a un array
        for (String let1 : a.split("")){
            list1.add(let1);
            // anade las letras diferentes a un string
            if (!b.contains(let1) && (!letdif.contains(let1))){
                letdif += (let1 + ", ");
            }
        }
        //anade las letras del string a un array
        for (String let2 : b.split("")){
            list2.add(let2);

            // anade las letras diferentes a un string
            if (!a.contains(let2) && (!letdif.contains(let2))){
                letdif += (let2 + ", ");
            }
        }
        // verifica si las palabras empieza  por letras diferentes
        if (list1.get(0) != list2.get(0)){
            NuevaPalabra +=  ( "Empiezan por letras diferentes, ");
        }
        // verifica si las palabras terminan por letras diferentes
        if (list1.get(list1.size()-1) != list2.get(list2.size()-1)){
            NuevaPalabra += ( "Terminan por letras diferentes, ");
        }
        // verifica que si halla diferentes letras en las palabras
        if (!letdif.equals("")){

            NuevaPalabra += ("Tienen estas letras diferentes: " + letdif);
        }

        return "Las diferencias son: " + NuevaPalabra;
    }

    public static void main(String[] args){
        System.out.println("Escriba la primera palabra");
        String pal1 = captura.nextLine();
        System.out.println("Escriba la segunda palabra");
        String pal2 = captura.nextLine();
        System.out.println(comparar(pal1,pal2));


    }
}
