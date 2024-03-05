
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Arraylist.String;

public class Swing extends JFrame{
    public static void main(String[] args) {
        String mensaje = """
                Digite la serie a generar.
                1. Serie 1
                2. Serie 2
                3. Serie 3
                4. Serie 4
                5. Serie 5 
                6. Serie 6
                7. Serie 7
                8. Serie 8
                9. Serie 9 
                10. Serie 10
                """;
        String opcion = JOptionPane.showInputDialog(mensaje);
        switch (opcion) {
            case "1":
                
                break;
            case "2":

                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "10":
                break;
        
            default:
                break;
        }
    }
}
