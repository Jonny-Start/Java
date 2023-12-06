
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int numEmpleados;
        System.out.println("Ingrese numero de empleados: ");
        numEmpleados = scanner.nextInt();
        scanner.nextLine();

        try {
            for (int i = 0; i < numEmpleados; i++) {
                System.out.println("\n Empleado #" + (i + 1));

                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Numero de indentificacion: ");
                Integer numeroIdentificacion = scanner.nextInt();

                System.out.println("Salario: ");
                double salario = scanner.nextDouble();

                scanner.nextLine();

                Empleado empleado = new Empleado(nombre, numeroIdentificacion, salario);
                listaEmpleados.add(empleado);
            }

        } catch (Exception e) {
            System.out.println("Error, los datos ingresados no son los solicitados: " + e);
        }

        System.out.println("\n Informaacion de Empleados: ");
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Numero de identificacion: " + empleado.getNumeroIdentificacion());
            System.out.println("Salario: $" + empleado.getSalario());
            System.out.println("");
        }

        scanner.close();

    }

}
