package Taller_Requerimiento_16;

public class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private String DNI;
    private double peso;
    private double altura;

    //metodos constructores

    Persona(){
        this.nombre="";
        this.sexo='H';
        this.edad = 20;
        this.DNI = "0000000000";
        this.peso = 60;
        this.altura = 160;

    }

    Persona(String pNombre,int pEdad, char pSexo){

        this.nombre=pNombre;
        this.sexo=pSexo;
        this.edad = pEdad;
        this.DNI = "0000000000";
        this.peso = 60;
        this.altura = 160;

    }

    Persona(String pNombre,int pEdad, char pSexo,String pDNI, double pPeso , double pAltura){

        this.nombre=pNombre;
        this.sexo=pSexo;
        this.edad = pEdad;
        this.DNI = pDNI;
        this.peso = pPeso;
        this.altura = pAltura;

    }




}
