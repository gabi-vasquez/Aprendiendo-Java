package Arraylist;

public class Carro {
    //Atributos
    private String marca;
    private int modelo;

    //Constructor
    public Carro(String marcaCarro, int modeloCarro){
        this.marca = marcaCarro;
        this.modelo = modeloCarro;
    }

    //Metodos
    public String getmarca(){
        return this.marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String toString(){
        return "La marca es-> "+ marca + "\n"+"El modelo es-> "+modelo;
    }
    
}
