package Taller_Requerimiento_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner captura = new Scanner(System.in);

    public static int calcularIMC(double peso, double altura){

        double imc = (peso/(Math.pow(altura,2)));

        if (imc < 20){
            return -1;
        }
        if ((imc >= 20 ) && (imc <= 25)){
            return 0;
        }

        else{
            return 1;
        }

    }

    public static boolean esMayorDeEdad(int edad){
        if (edad < 18){
            return false;
        }

        else{
            return true;
        }
    }

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
        int pEdad = Integer.getInteger(captura.nextLine());

        System.out.println("Escribe el sexo: ");
        char pSexo = captura.nextLine().toLowerCase().charAt(0);

        System.out.println("Escribe el nombre: ");
        String pDNI = captura.nextLine();

        System.out.println("Escribe el nombre: ");
        double pAltura = Integer.getInteger(captura.nextLine());

        System.out.println("Escribe el nombre: ");
        double pPeso = Integer.getInteger(captura.nextLine());

        Persona persona1 = new Persona();

        Persona persona2 = new Persona(pNombre,pEdad,pSexo);

        Persona persona3 = new Persona(pNombre,pEdad,pSexo,pDNI,pPeso,pAltura);

        ArrayList personas = new ArrayList();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
    }
}
