
import java.util.Scanner;

public class vendedorComision_9 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        float sueldo, venta1, venta2, venta3;
        double comision, porcentaje = 0.10;
        try {
            System.out.println("Hola, calcularemos el 10% de 3 ventas y el tota de dinero que obtendrá");
            System.out.println("Ingresa el porfavor el sueldo base");

            sueldo = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa porfavor el valor de la primer venta");
            venta1 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa porfavor el valor de la segunda venta");
            venta2 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa porfavor el valor de la tercer venta");
            venta3 = Float.parseFloat(scannerTerminal.nextLine());

            comision = (venta1 + venta2 + venta3) * porcentaje;

            System.out.println("Este es el 10% de tus ventas " + comision);
            System.out.println("Este es total que obtendra con el sueldo base " + (sueldo + comision));

        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }

    }

}
