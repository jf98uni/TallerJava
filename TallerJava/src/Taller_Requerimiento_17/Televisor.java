package Taller_Requerimiento_17;

public class Televisor extends Electrodomestico {

    // atributos por defecto
    protected static final double resolucionPorDefecto = 20;
    protected static final boolean TDTporDefecto = false;


    //atributos clase

    private double resolucion;
    private boolean TDT;
    private double precio;

    // constructores

    public  Televisor(){
        this.resolucion = resolucionPorDefecto;

        this.TDT = TDTporDefecto;
    }
    public Televisor(double pPeso, double pPrecio){
        super(pPeso,pPrecio);
        this.TDT = TDTporDefecto;
        this.resolucion = resolucionPorDefecto;

    }

    public Televisor (String pColor, double pPeso, double pPrecio, char pConsumo, boolean pTDT, double pResolucion){
        super(pColor, pPeso, pPrecio, pConsumo);
        this.TDT = pTDT;
        this.resolucion = pResolucion;
    }

    //getters and setters

    public void setResolucion(double pResolucion){
        this.resolucion = pResolucion;
    }

    public void setTDT (boolean pTDT){
        this.TDT = pTDT;
    }

    public double getResolucion (){
        return resolucion;
    }

    public boolean getTDT (){
        return TDT;
    }

    public void precioFinal(double resolucion , boolean TDT){
        if ( resolucion > 40){
            double preNuevo = super.getPrecio() * (1+0.3);
            super.setPrecio(preNuevo);
        }
        if (TDT){
            double preNuevo2 = super.getPrecio() + 50;
            super.setPrecio(preNuevo2);
        }
        super.getPrecio();
    }
}
