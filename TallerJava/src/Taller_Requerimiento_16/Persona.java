package Taller_Requerimiento_16;

import java.util.ArrayList;
import java.util.Random;

public class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private String DNI;
    private double peso;
    private double altura;
    private boolean MayorDeEdad;
    private int IMCResult;

    //metodos constructores


    Persona(){
        this.nombre="Persona";
        this.sexo='H';
        this.edad = 20;
        this.DNI = calcularDNI();
        this.peso = 60;
        this.altura = 160;

    }

    Persona(String pNombre,int pEdad, char pSexo){

        this.nombre=pNombre;
        this.sexo=pSexo;
        this.edad = pEdad;
        this.DNI = calcularDNI();
        this.peso = 60;
        this.altura = 160;

    }

    Persona(String pNombre,int pEdad, char pSexo, double pPeso , double pAltura){

        this.nombre=pNombre;
        this.sexo=pSexo;
        this.edad = pEdad;
        this.DNI = calcularDNI();
        this.peso = pPeso;
        this.altura = pAltura;

    }

    // getters and setters
    public void  setMayorDeEdad(){
        this.MayorDeEdad = esMayorDeEdad(edad);
    }

    public void setIMCResult (){
        this.IMCResult = calcularIMC(peso,altura);
    }

    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }

    public void setAltura(double pAltura) {
        this.altura = pAltura;
    }

    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }

    public void setSexo(char pSexo){
        this.sexo = pSexo;
    }

    public void setPeso (double pPeso){
        this.peso =   pPeso;
    }

    public int getEdad (){
        return edad;
    }

    public double getAltura (){
        return altura;
    }

    public double getPeso (){
        return peso;
    }

    public char getSexo (){
        return sexo;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean getMayorDeEdad (){
        return MayorDeEdad;
    }

    public int getIMCResult (){
        return IMCResult;
    }

    // funciones

    public static boolean esMayorDeEdad(int edad){
        if (edad < 18){
            return false;
        }

        else{
            return true;
        }
    }

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

    public static String calcularDNI (){
        String nuevoDNI = "" ;
        ArrayList numeros = new ArrayList();

        for (int i = 0; i<8 ; i++){
            numeros.add(i);
        }

        Random random = new Random();

        for (Object numero: numeros ){

                nuevoDNI += String.valueOf(random.nextInt(numeros.size()));
        }

        return nuevoDNI;
    }

    // toString

    public String toString(){
        String IMCDescrito = "";
        String EsMayorRes = "";
        if (getIMCResult() == -1){
            IMCDescrito += "Esta por debajo del peso idea";
        }
        if (getIMCResult()==0){
            IMCDescrito += "Esta en el peso ideal";
        }
        else IMCDescrito += "Esta por encima de tu peso ideal";

        if (getMayorDeEdad()){
            EsMayorRes += "Es mayor de edad";
        }
        else EsMayorRes += "Es menor de edad";
        return "La persona tiene las siguientes caracteristicas: \n" +
                "Su nombre es: " + getNombre() +".\n"+
                "Su edad es: " + getEdad() +". \n"+
                "Su sexo es: "+ getSexo() +". \n" +
                "Su peso es: " + getPeso() + ". \n"+
                "Su altura es:" + getAltura() + ". \n" +
                "Su DNI es:" + DNI + ". \n" +
                IMCDescrito + " y " + EsMayorRes + ".";
    }




}
