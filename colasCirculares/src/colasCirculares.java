
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class colasCirculares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        sistemasDeTurnos objeto = new sistemasDeTurnos();

        int opcion;

        do {
            System.out.println("\n Seleccione una opcion");
            System.out.println("1. Tomar turno");
            System.out.println("2. Atender cliente");
            System.out.println("3. Salir \n");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    objeto.tomarTurno();
                    break;
                case 2:
                    objeto.atenCliente();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }

        } while (opcion != 0);
    }
}
