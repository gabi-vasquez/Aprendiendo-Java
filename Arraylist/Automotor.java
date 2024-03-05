package Arraylist;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Automotor {
    public static void main(String[] args) {
        //Crear array
        ArrayList <Auto> coches  = new ArrayList<>();

        //Ciclo para agregar carros al array
        boolean salir = false;
        
        do{
            String option = JOptionPane.showInputDialog(null,"""
                    MENU:
                    1-> Para ingresar un nuevo carro
                    2-> Mostrar todos los carros
                    3-> Para salir
                    """);
            int opcion = Integer.parseInt(option);
            
            switch (opcion) {
                case 1 :
                    String matricula = JOptionPane.showInputDialog("Ingresa la matricula del carro");
                    String marca = JOptionPane.showInputDialog("Ingresa la marca");
                    String color = JOptionPane.showInputDialog("Ingresa el color ");
                    String model = JOptionPane.showInputDialog("Ingresa el modelo del carro");
                    int modelo = Integer.parseInt(model);
                    String bool = JOptionPane.showInputDialog("true-> Si el carro es electrico y false-> Si no");
                    boolean electrico = Boolean.parseBoolean(bool);
                    Auto coche = new Auto(matricula,marca,color,modelo,electrico);
                    coches.add(coche);
                    break;
                case 2:
                    String informacion = "";
                    int contador = 1;
                    for(int i = 0; i < coches.size();i++ ){
                        informacion+="Carro "+contador+"\n"+ coches.get(i).toString()+"\n";
                        contador++;
                    }
                    JOptionPane.showMessageDialog(null, informacion);
                    break;
                case 3:
                    salir = true;
                default:
                    break;
            }
        }while(salir == false);
    }
    
}
