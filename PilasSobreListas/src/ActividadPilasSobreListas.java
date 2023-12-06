
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class ActividadPilasSobreListas {

    public static void main(String[] args) {
        LinkedList<Empleado> pilaDePersonas = new LinkedList<>();

        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados: "));
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Empleado #:" + (1 + 1));
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Numero de identificacion: ");
            String ID = scanner.nextLine();

            Empleado empleado = new Empleado(nombre, ID);
            pilaDePersonas.push(empleado);
        }

        System.out.println("Pila de personas contratadas: " + pilaDePersonas);

        int numDePersonasDespedidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados a despedir: "));
        for (int i = 0; i < numDePersonasDespedidas; i++) {
            Empleado personaEliminada = pop(pilaDePersonas);
            System.out.println("Persona eliminada: " + personaEliminada.getNombre());
        }

    }

    private static void push(LinkedList<Empleado> pila, Empleado persona) {
        pila.push(persona);
    }

    private static Empleado pop(LinkedList<Empleado> pila) {
        return pila.pop();

    }

    private static Empleado peek(LinkedList<Empleado> pila) {
        return pila.peek();
    }
}
