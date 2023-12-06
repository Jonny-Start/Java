/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.text.TabableView;

/**
 *
 * @author jonny
 */
public class Estudiante {

    private Map<Integer, String> tablaEstudiante = new HashMap<>();

    public Map<Integer, String> getTablaEstudiantes() {
        return tablaEstudiante;
    }

    public void anadirEstudiante(int id, String nombre) {
        tablaEstudiante.put(id, nombre);
        JOptionPane.showMessageDialog(null, "Estudiante añadido" + id + " " + nombre);

    }

    public void buscarEstudiante(int id) {

        if (tablaEstudiante.containsKey(id)) {
            String studentName = tablaEstudiante.get(id);
            JOptionPane.showConfirmDialog(null, "Estudiante encontrado: " + id + " " + studentName);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado!");
        }
    }

    public void eliminarEstudiante(int id) {
        if (tablaEstudiante.containsKey(id)) {
            String estudianteEliminado = tablaEstudiante.remove(id);
            JOptionPane.showMessageDialog(null, "Estudiante eliminado: " + id + " " + estudianteEliminado);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontradp !!");
        }
    }

    public void menu() {
        int contador = 0;
        while (contador == 0) {
            int ingresoUser = Integer.parseInt(JOptionPane.showInputDialog("Por favor elija una opción: \n1 Añadir estudiante \n2 Buscar estudiante \n3 Eliminar estudiante \n4 Salir"));
            switch (ingresoUser) {
                case 1:
                    if (tablaEstudiante.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Base de datos vacía, ingrese datos!!");
                        int ingresoID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante: "));
                        String ingresoNombre = JOptionPane.showInputDialog(null, "Ingrese el numero del estudiante: ");
                        anadirEstudiante(ingresoID, ingresoNombre);
                    } else {
                        int ingresoID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del estudiante"));
                        String ingresoNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
                        anadirEstudiante(ingresoID, ingresoNombre);
                    }
                    break;
                case 2:
                    if (tablaEstudiante.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Base de datos vacía, ingrese datos!!");
                        int ingresoID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante: "));
                        String ingresoNombre = JOptionPane.showInputDialog(null, "Ingrese el numero del estudiante: ");
                        anadirEstudiante(ingresoID, ingresoNombre);
                    } else {
                        int ingresoID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del estudiante a buscar"));
                        buscarEstudiante(ingresoID);
                    }
                    break;
                case 3:
                    if (tablaEstudiante.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Base de datos vacía, ingrese datos!!");
                        int ingresoID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante: "));
                        String ingresoNombre = JOptionPane.showInputDialog(null, "Ingrese el numero del estudiante: ");
                        anadirEstudiante(ingresoID, ingresoNombre);
                    } else {
                        int ingresoID = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del estudiante a eliminar "));
                        eliminarEstudiante(ingresoID);
                    }
                    break;
                case 4:
                    JOptionPane.showConfirmDialog(null, "Saliendo...");
                    contador = 1;
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }

}
