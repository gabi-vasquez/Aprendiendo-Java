

public class Cuenta {
    // Atributos
    private String titular;
    private double cantidad;

    // Constructor
    public Cuenta(String titular){
        this.titular = titular;

        this.cantidad = 0;
    }
    public Cuenta(String titular,double cantidad){
        this.titular = titular;
        if (cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
    }
    //Metodos
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    //Ingresar dinero a la cuenta
    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " de dinero en la cuenta";
    }


}
