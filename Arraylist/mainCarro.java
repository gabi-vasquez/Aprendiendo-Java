package Arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class mainCarro {
    public static void main(String[] args) {
        // Creacion de el array
        ArrayList<Carro> carros = new ArrayList<>();

        // Ciclo repetitivo
        boolean salir = false;
        String informacion = "";
        while (salir == false) {
            String carroNuevo = JOptionPane.showInputDialog("Menu: " + "\n" + "1-> Añadir un carro" + "\n"
                    + "2-> Eliminar un carro" + "\n" + "3-> Mostrar los carros existentes" + "\n" + "4--> Salir");
            int carNuevo = Integer.parseInt(carroNuevo);
            switch (carNuevo) {
                case 1:
                    String marcaCarro = JOptionPane.showInputDialog("Ingresa la marca");
                    String modeloCarro = JOptionPane.showInputDialog("Ingresa el modelo de el carro");
                    int modelCarro = Integer.parseInt(modeloCarro);
                    Carro carrocontador = new Carro(marcaCarro, modelCarro);
                    carros.add(carrocontador);
                    break;
                case 2:
                    String eliminarCarro = JOptionPane.showInputDialog(
                        "Ingresa el carro a eliminar dependiendo el indice,va de 0 hacia arriba");
                    int posicion = Integer.parseInt(eliminarCarro);
                    if(posicion>= 0 && posicion< carros.size()){
                        carros.remove(posicion);
                    }else{
                        JOptionPane.showMessageDialog(null, "No existe el carro a eliminar");
                    }
                    break;
                case 3:
                    informacion = "";
                    int contador = 1;
                    for (int i = 0;i < carros.size();i++) {
                        informacion += "Carro"+contador+"\n"+ carros.get(i).toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, informacion);
                    break;
                case 4:
                    salir = true;
                default:
                    break;
            }

        }

    }

}
