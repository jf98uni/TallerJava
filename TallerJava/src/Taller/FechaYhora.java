package Taller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FechaYhora {
    static Scanner captura = new Scanner(System.in);


    public static String preguntar (String a){

        if ("y".equalsIgnoreCase(a)){

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            return (dtf.format(LocalDateTime.now()));
        }
        if (a.equalsIgnoreCase("n")){
            return "Nos vemos luego";
        }
        else{
            System.out.println("responde n o y por favor");

            return preguntar(captura.nextLine()) ;

        }
    }

    public static void main(String[] args) {

        System.out.println("Presione /y/ para saber la hora y fecha, presione /n/ para salir");
        System.out.println(preguntar(captura.nextLine()));

    }
}
