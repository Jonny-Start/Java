import java.util.Scanner;

public class Media_7 {

	public static void main(String[] args) {
		
	    Scanner scannerTerminal = new Scanner(System.in);
	    
	    Float  number1, number2, number3;
	    try {
		    System.out.println("Hola, calcularemos la media de 3 numeros");
		    System.out.println("Porfavor ingresa el primer numero");
		    
		    number1 = Float.parseFloat(scannerTerminal.nextLine());
		    
		    System.out.println("Porfavor ingresa el segundo numero");
		    
		    number2 = Float.parseFloat(scannerTerminal.nextLine());
		    
		    System.out.println("Porfavor ingresa el tercer numero");
		    
		    number3 = Float.parseFloat(scannerTerminal.nextLine());
		    
		    System.out.println("La media de los 3 numeros ingresados es " + (( number1 + number2 + number3)/3));
		    
		} catch (Exception e) {
			System.out.println("No puede estar vacio el campo de los numeros "+e);
		}

	}

}
