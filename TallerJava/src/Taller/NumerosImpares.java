package Taller;

// calcula los impares de dos formas diferentes
public class NumerosImpares {

    // calcula los impares usando while
    public static String imparesWhile (){

        System.out.println("While empieza aca ");
        int i = 1;
        while(i <= 100){

            if (i%2 != 0){
                System.out.println(i);
            }
            i = i + 1;
        }

        return "Impares usando while fin ";
    }

    // calcula los impares usando for
    public static String imparesFor (){

        System.out.println("For empieza aca ");

        for(int i = 0;i <= 100;i++){

            if (i%2 != 0){
                System.out.println(i);
            }

        }

        return "Impares usando for";
    }


    public static void main(String[] args){
        System.out.println(imparesWhile());
        System.out.println(imparesFor());

    }
}
