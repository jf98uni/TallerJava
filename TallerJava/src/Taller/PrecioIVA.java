package Taller;

import java.util.Scanner;

//calcula el precio con iva
public class PrecioIVA {
    // pide el precio al usuario
    static Scanner captura = new Scanner(System.in);
    // el porcentagje es fijo
    static double porcentaje = 0.21 ;

    // recibe el precio y retorna el precio con el iva
    public static Double calcularPrecioIVA (double precio){

        double preciofull = precio * (1+porcentaje);

        return preciofull;
    }
    // impime los mensajes y el resultado
    public static void main(String[] args) {
        // write your code here
        System.out.println("Ingrese el precio:");
        System.out.println( "El precio con IVA es:" + calcularPrecioIVA(Double.parseDouble((captura.nextLine()))) + " $ pesos");

    }
}
