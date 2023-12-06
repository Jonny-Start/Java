/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonny
 */
public class FilaCajero {
    private ArrayList<String> filaCajero = new ArrayList<>();
    
    public void agregarCliente(String nombreCliente){
        filaCajero.add(nombreCliente);
        System.out.println(nombreCliente + " se ha unido a la fila.");
        
    }
    
    public void atenderCliente(){
        if(!filaCajero.isEmpty()){
            String  clienteAtendido = filaCajero.remove(0);
            System.out.println(clienteAtendido + " esta siendo atendido");
        }else{
            System.out.println("La fila está vacía. No hay clientes para atender");
        }
    }
    
    public void mostrarEstadoFinal(){
        System.out.println("Estado final de la fila: " + filaCajero);
   
    }
}
