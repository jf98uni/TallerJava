package Taller;
import java.util.Scanner;

// calcula el area de un circulo
public class CalcularArea {
    static Scanner captura = new Scanner(System.in);

// pide el radio del circulo para calcular el area y retorna le area
    public static double calcularA(double radio){


        double area = (Math.pow(radio,2)*Math.PI);

        return area;

    }
// pide al usuario el radio y devulve el resultado
    public static void main(String[] args) {
        // write your code here
        System.out.println("Ingrese el radio en cm:");
        System.out.println( "El area es:" + calcularA(Double.parseDouble((captura.nextLine()))) + " cm cuadrados");

    }
}
