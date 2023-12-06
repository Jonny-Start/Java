
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
class Fruta {

    private String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class ArregloPilaColaFrutas {

    private Fruta[] pila;
    private Fruta[] cola;
    private int pilaSize;
    private int colaSize;
    private int pilaTop;
    private int colaFront;
    private int colaRear;

    public ArregloPilaColaFrutas() {
        pila = new Fruta[5];
        cola = new Fruta[5];
        pilaSize = 0;
        colaSize = 0;
        pilaTop = -1;
        colaFront = 0;
        colaRear = -1;
    }

    // Métodos para la pila
    public void push(Fruta fruta) {
        if (pilaSize < 5) {
            pila[++pilaTop] = fruta;
            pilaSize++;
        } else {
            System.out.println("La pila está llena.");
        }
    }

    public Fruta pop() {
        if (!isEmptyPila()) {
            pilaSize--;
            return pila[pilaTop--];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmptyPila() {
        return pilaSize == 0;
    }

    // Métodos para la cola
    public void enqueue(Fruta fruta) {
        if (colaSize < 5) {
            cola[(++colaRear) % 5] = fruta;
            colaSize++;
        } else {
            System.out.println("La cola está llena.");
        }
    }

    public Fruta dequeue() {
        if (!isEmptyCola()) {
            colaSize--;
            return cola[(colaFront++) % 5];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmptyCola() {
        return colaSize == 0;
    }

    public static void main(String[] args) {
        ArregloPilaColaFrutas pilaCola = new ArregloPilaColaFrutas();

        // Prueba de la pila
        pilaCola.push(new Fruta("Manzana"));
        pilaCola.push(new Fruta("Banana"));
        pilaCola.push(new Fruta("Naranja"));
        System.out.println("Fruta retirada de la pila: " + pilaCola.pop());

        // Prueba de la cola
        pilaCola.enqueue(new Fruta("Fresa"));
        pilaCola.enqueue(new Fruta("Pera"));
        pilaCola.enqueue(new Fruta("Uva"));
        System.out.println("Fruta retirada de la cola: " + pilaCola.dequeue());
    }
}
