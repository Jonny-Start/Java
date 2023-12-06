/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonny
 */
class arbolBinario {

    Nodo raiz;

    public arbolBinario() {
        raiz = null;
    }

    // Metodo para realizar un recorrido en orden
    public void recorridoEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo);
            System.out.println(nodo.valor + " ");
            recorridoEnOrden(nodo.derecho);
        }
    }

    // Metodo para realizar un recorrido pre-orden
    public void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.valor + " ");
            recorridoEnOrden(nodo.izquierdo);
            recorridoEnOrden(nodo.derecho);
        }
    }

    // Metodo para realizar un recorrido pos-orden
    public void recorridoPosOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo);
            recorridoEnOrden(nodo.derecho);
            System.out.println(nodo.valor + " ");
        }
    }
}
