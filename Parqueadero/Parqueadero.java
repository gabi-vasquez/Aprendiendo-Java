package Parqueadero;
import javax.swing.JOptionPane;

public class Parqueadero {
    public static void main(String[] args) {

        String placaC = JOptionPane.showInputDialog("Ingresa la placa del carro");
        String marcaC = JOptionPane.showInputDialog("Ingresa la marca de el carro");
        //JOptionPane.showMessageDialog(null, "Placa-> "+ placaC+"\n"+ "Marca-> "+marcaC); 
        
        String placaCa = JOptionPane.showInputDialog("Ingresa la placa del carro");
        JOptionPane.showMessageDialog(null,"Carro 1"+"\n"+ "Placa-> "+ placaC+"\n"+ "Marca-> "+marcaC + "\n"+"Carro 2"+"\n"+"Placa-> "+ placaCa);

        Carro carro1 = new Carro(placaC, marcaC);
        Carro carro2 = new Carro(placaC);

        carro1.toString();

    }
}
