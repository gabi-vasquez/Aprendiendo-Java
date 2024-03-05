package ConjuntoResidencial;

public class Casa {
    
    //Atributos
    private int numeroCasa;
    private String direccion;
    private String nombrePropietario;
    static int contadorCasas;

    //Constructor
    public Casa(int numeroCasa,String direccion,String nombrePropietario){
        this.direccion= direccion;
        this.nombrePropietario = nombrePropietario;
        this.numeroCasa = numeroCasa;
    }
    //Metodos
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombrePropietario() {
        return nombrePropietario;
    }
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
    public int getNumeroCasa() {
        return numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }


    @Override
    public String toString() {
        return "Casa "+ numeroCasa +" de "+ Casa.contadorCasas+ "\n"+"La direccion de la casa es-> " + direccion +"\n"+ "el nombre del propietario es-> "+ nombrePropietario;
    }

    
}
