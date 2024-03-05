package Arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numero {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();

        boolean salir = false;
        int suma = 0;
        int promedio = 0;
        while(salir == false){
            String numero = JOptionPane.showInputDialog(null,"Ingresa un numero "+"-1 para salir");
            int num = Integer.parseInt(numero);
            if(num==-1){
                break;
            }
            numeros.add(num);
        }
        int menor = numeros.get(0);
        int mayor = numeros.get(0);
        for(int i = 0;i < numeros.size();i++){
            if(numeros.get(i) > mayor){
                mayor = numeros.get(i);
            }if(numeros.get(i) < menor){
                menor = numeros.get(i);
            }
            suma = suma + numeros.get(i);
        }
        promedio = suma / numeros.size();
        JOptionPane.showMessageDialog(null, "Menor-> "+ menor+"\n"+ "Mayor-> "+mayor+"\n"+"Suma de todos los numeros-> "+ suma+"\n"+"Promedio-> "+promedio);

    }
    
}
