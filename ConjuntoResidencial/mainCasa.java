package ConjuntoResidencial;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class mainCasa {
    public static void main(String[] args) {

        ArrayList<Casa> casas = new ArrayList<>();

        boolean salir = false;
        String direccion = "";
        String nombrePropietario = "";
        int id = 0;

        do {
            String option = JOptionPane.showInputDialog(null, """
                    MENU:
                    1-> Para ingresar una nueva casa
                    2-> Mostrar todos las casas
                    3-> Actualizar una casa
                    4-> Eliminar una casa
                    0-> Para salir
                    """);
            int opcion = Integer.parseInt(option);

            switch (opcion) {
                case 1:
                    direccion = JOptionPane.showInputDialog("Ingresa la direccion de la casa");
                    nombrePropietario = JOptionPane.showInputDialog("Ingresa el nombre del propietario de la casa");
                    Casa.contadorCasas++;
                    id++;
                    Casa casa = new Casa(id, direccion, nombrePropietario);
                    casas.add(casa);
                    break;

                case 2:
                    String informacion = "";

                    for (int i = 0; i < casas.size(); i++) {
                        informacion += casas.get(i).toString() + "\n";
                    }

                    JOptionPane.showMessageDialog(null, informacion);
                    break;

                case 3:
                    String casaActualizar = JOptionPane.showInputDialog("Ingresa el numero de la casa a actualizar");
                    int numeroCasa = Integer.parseInt(casaActualizar);
                    for (int i = 0; i < casas.size(); i++){
                        if (casas.get(i).getNumeroCasa() == numeroCasa) {
                            JOptionPane.showMessageDialog(null, casas.get(i).toString());
                            String valorActualiza = JOptionPane.showInputDialog("Ingresa lo que quieres actualizar"
                                    + "\n" + "1-> Direccion " + "\n" + "2-> Nombre del propietario");
                            int valorActualizar = Integer.parseInt(valorActualiza);
                            if (valorActualizar == 1) {
                                String actualizacion = JOptionPane.showInputDialog("Ingresa la direccion a actualizar");
                                casas.get(i).setDireccion(actualizacion);

                            } else if (valorActualizar == 2) {
                                String actualizacion = JOptionPane
                                        .showInputDialog("Ingresa el nombre de propietario a actualizar");
                                casas.get(i).setNombrePropietario(actualizacion);
                                
                            }

                        }
                    }
                    break;

                case 4:
                    String eliminarCasa = JOptionPane.showInputDialog(
                            "Ingresa la casa a eliminar");
                    int numeroCasaEliminar = Integer.parseInt(eliminarCasa);
                    boolean encontrado = false;
                    for(int i = 0; i < casas.size();i++){
                        if(casas.get(i).getNumeroCasa() == numeroCasaEliminar){
                            casas.remove(i);
                            encontrado = true;
                        }
                    }
                    if(encontrado == false){
                        JOptionPane.showMessageDialog(null, "Casa no encontrada");
                    }
                    Casa.contadorCasas--;
                    break;

                case 0:
                    salir = true;
                    break;

                default:
                    break;
            }

        } while (salir == false);
    }
}
