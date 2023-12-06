/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonny
 */
public class recorridoArboles {

    public static void main(String[] args) {
        arbolBinario arbol = new arbolBinario();
        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierdo = new Nodo(2);
        arbol.raiz.derecho = new Nodo(3);
        arbol.raiz.izquierdo.izquierdo = new Nodo(4);
        arbol.raiz.izquierdo.derecho = new Nodo(5);

        System.out.println("Reccorrido en orden");
        arbol.recorridoEnOrden(arbol.raiz);

        System.out.println("Recorrido pre-orden");
        arbol.recorridoPreOrden(arbol.raiz);

        System.out.println("Recorrido pos-orden");
        arbol.recorridoPosOrden(arbol.raiz);

    }

}
