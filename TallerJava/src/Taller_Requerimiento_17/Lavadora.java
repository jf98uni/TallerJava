package Taller_Requerimiento_17;

public class Lavadora extends Electrodomestico {

    protected static final double cargaPorDefecto = 5;

    // atributos

    private double carga;

    //constructores

    public Lavadora(){
        this.carga = cargaPorDefecto;
    }

    public Lavadora(double pPeso, double pPrecio){
        super(pPeso, pPrecio);
    }

    public Lavadora(String pColor, double pPeso, double pPrecio, char pConsumo, double pCarga){
        super( pColor, pPeso, pPrecio, pConsumo);
        this.carga = pCarga;
    }

    // getters and setters

    public  void setCarga(double pCarga){
        this.carga = pCarga;
    }

    public double getCarga (){
        return carga;
    }

    // funciones

    public void precioFinal(double pCarga){
        if (pCarga > 30){
            double precioNuevo = 50 + super.getPrecio();
            super.setPrecio(precioNuevo);

        }
        System.out.println(super.getPrecio());
    }


}
