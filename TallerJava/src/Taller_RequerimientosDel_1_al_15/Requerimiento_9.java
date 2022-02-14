package Taller_RequerimientosDel_1_al_15;

public class Requerimiento_9 {

// cambia las a por e usando replace
    public static String iterador (){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";

        return frase.replace("a","e");
    }

    public static void main(String[] args){
    // concatena los string
        System.out.println(iterador().concat("-- Ya se cambiaron las a por las e"));

    }
}
