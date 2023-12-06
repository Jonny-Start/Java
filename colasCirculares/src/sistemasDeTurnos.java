/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonny
 */
public class sistemasDeTurnos {

    private int capacidadCola = 5;
    private String[] colaDeTurnos;
    private int frente, fin;
    private int numeroDeTurnos;

    public void sitemaDeTurnos() {
        colaDeTurnos = new String[capacidadCola];
        this.frente = -1;
        this.fin = -1;
        numeroDeTurnos = 1;
    }

    public void tomarTurno() {
        if ((fin + 1) % capacidadCola == frente) {
            // Frente = 1, fin = 0
            System.out.println("La cola de turnos se encuentra llena");
        } else {
            fin = (fin + 1) % capacidadCola;
            colaDeTurnos[fin] = "T" + numeroDeTurnos;
            numeroDeTurnos++;
            System.out.println("Se ha asignado el turno " + colaDeTurnos[fin]);

            if (frente == -1) {
                frente = 0;
            }
        }

    }

    public void atenCliente() {
        if (frente == -1) {
            System.out.println("No hay clientes en espera");
        } else {
            System.out.println("Atendiendo al cliente con turno " + colaDeTurnos[frente]);

            if (frente == fin) {
                frente = fin = -1;
            } else {
                frente = (frente + 1) % capacidadCola;
            }

        }

    }

}
