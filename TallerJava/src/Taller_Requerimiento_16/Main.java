package Taller_Requerimiento_16;

import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner captura = new Scanner(System.in);


    public static char comprobarSexo(char sexo){
        if ((sexo == 'h') || (sexo == 'm')){

            return sexo;

        }

        return 'h';
    }


    public static void main(String[] args) {

        System.out.println("Escribe el nombre: ");
        String pNombre = captura.nextLine();

        System.out.println("Escribe la edad: ");

        String edad = captura.nextLine();

        int pEdad = Integer.parseInt(edad);



        System.out.println("Escribe el sexo: ( 'm' o 'h' ");
        char pSexo = captura.nextLine().toLowerCase().charAt(0);


        System.out.println("Escribe la altura en metros: ");
        double pAltura = Double.parseDouble(captura.nextLine());

        System.out.println("Escribe el peso en kg: ");
        double pPeso = Double.parseDouble(captura.nextLine());

        Persona persona1 = new Persona();

        Persona persona2 = new Persona(pNombre,pEdad,pSexo);

        persona2.setNombre(pNombre);
        persona2.setEdad(pEdad);
        persona2.setSexo(comprobarSexo(pSexo));

        Persona persona3 = new Persona(pNombre,pEdad,pSexo,pPeso,pAltura);

        persona3.setAltura(pAltura);
        persona3.setSexo(comprobarSexo(pSexo));
        persona3.setPeso(pPeso);
        persona3.setNombre(pNombre);
        persona3.setEdad(pEdad);

        System.out.println(persona1);
        System.out.println("La siguiente \n\n");
        System.out.println(persona2);
        System.out.println("La siguiente \n\n");
        System.out.println(persona3);
        System.out.println("Fin");

    }
}
