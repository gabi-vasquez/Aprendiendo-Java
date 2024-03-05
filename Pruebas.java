import java.util.Random;
import java.util.Scanner;


public class Pruebas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = consola.nextInt();
        int factorial = numero;
        for (int i = numero - 1;i > 0;i--){
            factorial = factorial * i;
        }
        System.out.println(" numero " + numero + " factorial " + factorial);
    

    }

}
