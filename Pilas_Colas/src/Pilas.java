
import java.util.Stack;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
//Se elimina de primera el ultimo agregado
public class Pilas {

    static Stack<Integer> Pila = new Stack<Integer>();

    public static void main(String[] args) {

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Selecciona una Opción:\n"
                    + "1. Agregar numero a la pila\n"
                    + "2. Validar vació\n"
                    + "3. Buscar numero\n"
                    + "4. Eliminar ultimo numero\n"
                    + "5. Listar pila\n"
                    + "6. Salir"));
            switch (opcion) {
                case 1:
                    int numeroSave = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero: "));
                    Pila.push(numeroSave);

                    break;
                case 2:

                    JOptionPane.showMessageDialog(null, Pila.empty());

                    break;
                case 3:
                    int numeroSearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero a buscar: "));

                    if (Pila.search(numeroSearch) > 0) {
                        JOptionPane.showMessageDialog(null, "El numero existe en la pila");
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe el numero en la pila");
                    }

                    break;

                case 4:
                    Pila.pop();
                    JOptionPane.showMessageDialog(null, "Numero eliminado!");

                    break;
                case 5:
                    /*StringBuilder elementsPila = new StringBuilder("Elementos de la pila:\n");
                    for (Integer elemento : Pila) {
                    elementsPila.append("#: " + Pila).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, elementsPila.toString());*/
                    JOptionPane.showMessageDialog(null, "Elementos de la pila:\n" + Pila);
                    break;
                case 6:
                    System.exit(0);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        }

    }

}
