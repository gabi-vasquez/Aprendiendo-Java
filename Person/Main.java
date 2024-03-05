package Person;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        

        Persona persona1 = new Persona();
        JOptionPane.showMessageDialog(null, persona1.toString());
        muestraMensajeImc(persona1);
        muestraMensajeMayorEdad(persona1);

        Persona persona2 = crearPersona();
        JOptionPane.showMessageDialog(null, persona2.toString());
        muestraMensajeImc(persona2);
        muestraMensajeMayorEdad(persona2);

        Persona persona3 = crearPersonaCompleta();
        JOptionPane.showMessageDialog(null, persona3.toString());
        muestraMensajeImc(persona3);
        muestraMensajeMayorEdad(persona3);
    }

    public static void muestraMensajeImc(Persona persona) {

        if (persona.calcularIMC() == -1) {
            JOptionPane.showMessageDialog(null, "La persona se encuentra en peso ideal.");
        } else if (persona.calcularIMC() == 0) {
            JOptionPane.showMessageDialog(null, "La persona esta por debajo de su peso ideal");
        } else {
            JOptionPane.showMessageDialog(null, "La persona esta por encima de su peso ideal");
        }
    }

    public static void muestraMensajeMayorEdad(Persona persona) {
        if (persona.esMayorDeEdad() == true) {
            JOptionPane.showMessageDialog(null, "La persona es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "La persona es menor de edad");
        }
    }

    public static Persona crearPersonaCompleta(){

        String nombrePersona = JOptionPane.showInputDialog("Ingresa el nombre de la persona");

        String edadPersona = JOptionPane.showInputDialog("Digita la edad");
        int edadPerson = Integer.parseInt(edadPersona);

        String sexoPersona = JOptionPane.showInputDialog("Ingresa el sexo de la persona");
        char sexoPerson = sexoPersona.charAt(0);

        String pesoPersona = JOptionPane.showInputDialog("Ingresa el peso de la persona");
        double pesoPerson = Double.parseDouble(pesoPersona);

        String alturaPersona = JOptionPane.showInputDialog("Ingresa la altura de la persona");
        double alturaPerson = Double.parseDouble(alturaPersona);

        Persona persona = new Persona(nombrePersona, edadPerson, sexoPerson, alturaPersona, pesoPerson, alturaPerson);
        return persona;
    }

    public static Persona crearPersona() {
        String nombrePersona = JOptionPane.showInputDialog("Ingresa el nombre de la persona");

        String edadPersona = JOptionPane.showInputDialog("Digita la edad");
        int edadPerson = Integer.parseInt(edadPersona);

        String sexoPersona = JOptionPane.showInputDialog("Ingresa el sexo de la persona");
        char sexoPerson = sexoPersona.charAt(0);

        Persona persona = new Persona(nombrePersona, edadPerson, sexoPerson);
        return persona;
    }


}
