package Parqueadero;

public class Carro {
    //Atributos
    private String placaCarro;
    private String marcaCarro;

    //Constructor
    public Carro(String placa,String marca){
        this.placaCarro = placa;
        this.marcaCarro = marca;
    }
    public Carro(String placa){
        this.placaCarro = placa;
    }

    
    public String getplacaCarro(){
        return this.placaCarro;
    }
    public String getmarcaCarro(){
        return this.marcaCarro;
    }
    public String setplacaCarro(){
        return placaCarro;
    }
    public String setmarcaCarro(){
        return placaCarro;
    }

    public String toString(){
        return "Hola";
    }
}
