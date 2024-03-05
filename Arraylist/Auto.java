package Arraylist;

/**
 * Auto
 */
public class Auto {

    //Atributos
    private String matricula;
    private String marca;
    private String color;
    private int modelo;
    private boolean electrico;
    private String nombre;

    //Constructor
    public Auto(String matricula, String marca, String color, int modelo,boolean electrico){
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.electrico = electrico;
    }
    public Auto(){}

    //Metodos
    public String acelerar(){
        return "El coche esta acelerado";
    }

    public String frenar(){
        return "El coche esta frenado";
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    public boolean isElectrico(){
        return electrico;
    }
    int contador = 1;
    @Override
    public String toString() {
      return "Matricula-> " + matricula+"\n"+"Marca-> "+ marca +"\n"+ "Color-> "+ color +"\n" +"Modelo-> "+ modelo +"\n"+ (isElectrico()?"Electrico":"No electrico");
    }


    
}