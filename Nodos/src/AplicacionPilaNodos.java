import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Pila {
    Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (tope == null) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.siguiente = tope;
            tope = nuevoNodo;
        }
    }

    public int pop() {
        if (tope == null) {
            throw new IllegalStateException("La pila está vacía.");
        }
        int dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void mostrarNodos() {
        Nodo nodoActual = tope;
        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " ");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println();
    }
}

public class AplicacionPilaNodos {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar nodo a la pila");
            System.out.println("2. Mostrar todos los nodos");
            System.out.println("3. Eliminar último nodo");
            System.out.println("4. Salir");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un número:");
                    int numero = Integer.parseInt(scanner.nextLine());
                    pila.push(numero);
                    System.out.println("Nodo agregado a la pila.");
                    break;
                case 2:
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("Nodos en la pila:");
                        pila.mostrarNodos();
                    }
                    break;
                case 3:
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        pila.pop();
                        System.out.println("Último nodo eliminado de la pila.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicación.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
