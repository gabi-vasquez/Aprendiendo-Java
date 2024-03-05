package Arraylist;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cadena {
    public static void main(String[] args) {
        
        //Crear lista
        ArrayList<String> nombres = new ArrayList<>();
        boolean salir = false;
        String informacion = "";
        //Ciclo repetitivo
        while (salir == false) {
            String opcion = JOptionPane
                    .showInputDialog("Menu:" + "\n" + "1-> " + "Salir" + "\n" + "2-> " + "Agregar nombre" + "\n"
                            + "3-> " + "Eliminar nombre" + "\n" + "4-> " + "Imprimir lista de nombres");
            int option = Integer.parseInt(opcion);
            
            switch (option) {
                case 1:
                    salir = true;
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre que quieres agregar");
                    nombres.add(nombre);
                    break;
                case 3:
                    String nombreEliminar = JOptionPane.showInputDialog("Ingresa el nombre que quieres eliminar");
                    nombres.remove(nombreEliminar);
                    break;
                case 4:
                    for (int i = 0; i < nombres.size(); i++) {
                        informacion += nombres.get(i)+"\n";
                    }
                    JOptionPane.showMessageDialog(null, informacion);
                    break;
                default:
                    break;
            }

        }

    }

}
