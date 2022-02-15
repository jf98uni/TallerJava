package Taller_Requerimiento_17;

import javax.security.auth.callback.CallbackHandler;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
    // atributos por defecto
    protected static final String colorPorDefecto = "blanco";
    protected static final double pesoPorDefecto = 5;
    protected static final double precioPorDefecto = 100;
    protected static final char consumoPorDefecto = 'F';


    // Atributos de la calse

    private String color;
    private double peso;
    private double precio;
    private  char consumo;

    //Constructores

    public Electrodomestico(){
        this.color = colorPorDefecto;
        this.peso = pesoPorDefecto;
        this.precio = precioPorDefecto;
        this.consumo = consumoPorDefecto;
    }
    public Electrodomestico(double pPeso, double pPrecio){
        this.color = colorPorDefecto;
        this.peso = pPeso;
        this.precio = pPrecio;
        this.consumo = consumoPorDefecto;
    }
    public Electrodomestico(String pColor, double pPeso, double pPrecio, char pConsumo){
        this.color = pColor;
        this.peso = pPeso;
        this.precio = pPrecio;
        this.consumo = pConsumo;
    }

    // getters and setters

    public void setPeso (double pPeso){
        this.peso = pPeso;
    }

    public void setColor (String pColor){
        this.color = pColor;
    }
    public void setPrecio (double pPrecio){
        this.precio = pPrecio;
    }
    public void setConsumo (char pConsumo){
        this.consumo = pConsumo;
    }

    public double getPeso (){
        return peso;
    }

    public String getColor () {
        return color;
    }

    public double getPrecio (){
        return precio;
    }

    public char getConsumo (){
        return consumo;
    }

    private void comprobarConsumoEnergetico(char letra){
        char letra2 = Character.toLowerCase(letra);
        if ((letra2 == 'a') || (letra2 == 'b') || (letra2 == 'c')  || (letra2 == 'd')  || (letra2 == 'e')  || (letra2 == 'f')){

            this.consumo = letra;

        }

        this.consumo = consumoPorDefecto;
    }

    private void comprobarColor(String color){

        String colores[] = {"negro","rojo","azul","gris"};
        boolean y = false;

        for (String x : colores){
            if (x.equalsIgnoreCase(color)){

                y = true;
                this.color = color;
            }
        }

        if (y == false) {
            this.color = colorPorDefecto;
        }

    }

    public void precioFinal(char pChar,double pPeso){

        double precio = 0;

        switch (Character.toLowerCase(pChar)){

            case 'a':

                precio += 100;
                break;

            case 'b':

                precio += 80;
                break;

            case 'c':

                precio += 60;
                break;

            case 'd':

                precio += 50;
                break;

            case 'e':

                precio += 30;
                break;

            case 'f':
                precio += 10;
                break;

        }

        if (pPeso <= 19){

            precio += 10;
        }

        else if  (pPeso <=49){

            precio += 50;
        }

        else if (pPeso <= 79){
            precio += 80;
        }

        else {
            precio += 100;
        }

        this.precio = precio;

    }



}
