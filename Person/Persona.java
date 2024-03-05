package Person;

import java.util.Random;

public class Persona {
    // Constantes
    static private final char hombre = 'H';
    static private final char mujer = 'M';
    static private final int pesoIdeal = -1;
    static private final int intrapeso = 0;
    static private final int sobrepeso = 1;

    // Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String DNI;
    private double peso;
    private double altura;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.DNI= generarDNI();
    }

    // Constructores con parámetros

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarsexo(sexo);
        this.DNI =generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, String DNI, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarsexo(sexo);
        this.DNI = generarDNI();
        this.peso = peso;
        this.altura = altura;
    }

    // metodos privados

    private String generarDNI() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10000000, 100000000);
        int indiceLetra = numeroAleatorio % 26;
        char letra = (char) (indiceLetra + 'A');
        String DNI = Integer.toString(indiceLetra) + letra;
        return DNI;
    }

    private void comprobarsexo(char sexo) {
        if (sexo != hombre && sexo != mujer) {
            this.sexo = hombre;
        }
    }

    //Metodos publicos
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public int calcularIMC(){
        double pesoActual = (peso /(altura * altura));
        if(pesoActual < 20){
            return pesoIdeal;
        }else if(pesoActual >= 20 && pesoActual <= 25 ){
            return intrapeso;
        }else{
            return sobrepeso;
        }
    }

    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(edad >= 18){
            mayor = true;
            return mayor;
        }
        return mayor;     
    }
    public String toString(){
        return "Nombre-> "+ nombre+"\n"+ "Edad-> "+edad+"\n"+"Sexo-> "+sexo+"\n"+"DNI-> "+DNI+"\n"+"Peso-> "+peso+"\n"+"Altura-> "+ altura; 
    }

    }

