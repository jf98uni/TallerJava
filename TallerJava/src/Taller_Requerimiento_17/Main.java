package Taller_Requerimiento_17;

import java.awt.*;

public class Main {

    public static Electrodomestico[] listaE = new Electrodomestico[10];

    public static Electrodomestico[] getListaE() {
        listaE[0] = new Electrodomestico("negro",60,1000,'a');
        listaE[1] = new Televisor("rojo",5,100,'e',true,50);
        listaE[2] = new Lavadora("rojo",80,100,'e',10);
        listaE[3] = new Electrodomestico("negro",60,1000,'a');
        listaE[4] = new Televisor("azul",5,100,'e',false,20);
        listaE[5] = new Lavadora("rojo",80,20,'e',50);
        listaE[6] = new Electrodomestico("azul",20,1000,'a');
        listaE[7] = new Televisor("negro",5,100,'e',false,20);
        listaE[8] = new Lavadora();
        listaE[9] = new Electrodomestico("gris",40,1000,'a');

        return listaE;
    }


    public static void main(String[] args){
        Electrodomestico[] listaElectro = getListaE();

        double precioTV = 0;
        String Tv = "";
        double precioLav = 0;
        String lav = "";
        double precioTotal = 0;


        for (Electrodomestico electro : listaElectro){

            double temp = electro.getPrecio();
            if (electro instanceof Televisor){
                precioTV += temp;
            }
            else if (electro instanceof Lavadora){
                precioLav += temp;
            }
            precioTotal += temp;
        }

        if (precioTV != 0){

            Tv = " donde el precio de los televisores es de: " + precioTV;

        }
        if (precioLav != 0){

            lav = " donde precio de las lavadoras es de: " + precioLav;
        }

        System.out.println("El precio de los electrodomesticos es de: " + precioTotal + Tv + lav );
    }

}
