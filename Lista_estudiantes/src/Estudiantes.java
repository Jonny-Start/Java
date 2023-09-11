
import java.security.DrbgParameters;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
class Estudiante {

    String nombre;
    String codigo;
    List<Materia> materias;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materias = new ArrayList<>();
    }
}

class Materia {

    String nombre;
    double nota1;
    double nota2;
    double nota3;

    public Materia(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }
}

public class Estudiantes {

    static List<Estudiante> listaEstudiantes = new ArrayList<>();
    static List<Materia> listaMaterias = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una opción:\n"
                    + "0. Promedio de estudiante\n"
                    + "1. Agregar estudiante\n"
                    + "2. Mostrar estudiante con materias y notas\n"
                    + "3. Actualizar estudiante\n"
                    + "4. Eliminar estudiante con sus notas\n"
                    + "5. Agregar materia\n"
                    + "6. Actualizar materia\n"
                    + "7. Eliminar materia\n"
                    + "8. Actualizar notas\n"
                    + "9. Mostrar todos los estudiantes\n"
                    + "10. Mostrar todas las materias\n"
                    + "11. Salir"));

            switch (opcion) {
                case 0:
                    average_notes();
                    break;
                case 1:
                    create_student();
                    break;
                case 2:
                    read_student_and_notes();
                    break;
                case 3:
                    update_student();
                    break;
                case 4:
                    delete_student();
                    break;
                case 5:
                    create_subjects();
                    break;
                case 6:
                    update_subjects();
                    break;
                case 7:
                    delete_subjects();
                    break;
                case 8:
                    update_note();
                    break;
                case 9:
                    read_all_students();
                    break;
                case 10:
                    read_all_subjects();
                    break;
                case 11:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    static void average_notes() {
        //Promedio de notas (0)
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            return;
        }

        StringBuilder estudiantes = new StringBuilder("Estudiante:\n");
        for (Estudiante estudianteUni : listaEstudiantes) {

            if (!estudianteUni.codigo.equalsIgnoreCase(codigo)) {
                continue;
            }

            estudiantes.append("Nombre: " + estudianteUni.nombre).append("\n");

            if (estudianteUni.materias.size() == 0) {
                estudiantes.append("¡El estudiante no cuenta con notas para ninguna materia!");
            } else {

                double sumProms = 0;

                DecimalFormat formato = new DecimalFormat("#.##"); // Dos decimales

                for (int i = 0; i < estudianteUni.materias.size(); i++) {
                    double prom = ((estudianteUni.materias.get(i).nota1 + estudianteUni.materias.get(i).nota2 + estudianteUni.materias.get(i).nota3) / 3);
                    estudiantes.append("Promedio " + estudianteUni.materias.get(i).nombre + ": " + formato.format(prom)).append("\n");
                    sumProms = sumProms + prom;
                }
                double generalProm = (sumProms / listaMaterias.size());
                estudiantes.append("El promedio general del estudiante es " + formato.format(generalProm)).append("\n");

                if (generalProm >= 7.5) {
                    estudiantes.append("El estudiante esta aprobando el semestre").append("\n");
                } else {
                    estudiantes.append("El estudiante NO esta aprobando el semestre").append("\n");
                }
            }
        }
        JOptionPane.showMessageDialog(null, estudiantes.toString());
    }

    static void create_student() {
        //Crear estudiantes (1)

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");

        int longitud = 10; // Longitud deseada de la cadena
        String cadenaAlfanumerica = generarCadenaAlfanumerica(longitud);

        String codigo = cadenaAlfanumerica;

        Estudiante estudiante = new Estudiante(nombre, codigo);
        listaEstudiantes.add(estudiante);

        JOptionPane.showMessageDialog(null, "¡Estudiante almacenado! \n este es el codigo del estudiante \n " + codigo);
        System.out.println(codigo);
    }

    static void read_student_and_notes() {
        //Listar estudiante con sus notas (2)

        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            return;
        }

        StringBuilder estudiantes = new StringBuilder("Estudiante:\n");
        for (Estudiante estudianteUni : listaEstudiantes) {
            if (!estudianteUni.codigo.equalsIgnoreCase(codigo)) {
                continue;
            }
            estudiantes.append("Nombre: " + estudianteUni.nombre + " // codigo: " + estudianteUni.codigo).append("\n");

            if (estudianteUni.materias.size() == 0) {
                estudiantes.append("¡El estudiante no cuenta con notas para ninguna materia!");

            } else {
                for (int i = 0; i < estudianteUni.materias.size(); i++) {
                    estudiantes.append(estudianteUni.materias.get(i).nombre + ": \t nota1: " + estudianteUni.materias.get(i).nota1 + " \t nota2: " + estudianteUni.materias.get(i).nota2 + " \t nota3: " + estudianteUni.materias.get(i).nota3 + "").append("\n");
                }
            }

        }
        JOptionPane.showMessageDialog(null, estudiantes.toString());

    }

    static void update_student() {
        //Actualizar estudiante (3)
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del estudiante");

        for (Estudiante estudianteUni : listaEstudiantes) {
            if (estudianteUni.codigo.equalsIgnoreCase(codigo)) {
                estudianteUni.nombre = nombre;
                JOptionPane.showMessageDialog(null, "¡Nombre actualizado!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante no encontrado para actualizar el nombre");

    }

    static void delete_student() {
        //Eliminar estudiante (4)
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            return;
        }

        for (Estudiante estudianteUni : listaEstudiantes) {
            if (estudianteUni.codigo.equalsIgnoreCase(codigo)) {
                listaEstudiantes.remove(estudianteUni);
                JOptionPane.showMessageDialog(null, "¡Estudiante eliminado!");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Estudiante no encontrado para la eliminación");
    }

    static void create_subjects() {
        //Crear asignatura (5)

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la asignatura");

        Materia materiaUni = buscarMateria(nombre);
        if (materiaUni != null) {
            JOptionPane.showMessageDialog(null, "¡Esta materia ya existe!");
            return;
        }

        double nota1 = -1, nota2 = -1, nota3 = -1;

        Materia materia = new Materia(nombre, nota1, nota2, nota3);
        listaMaterias.add(materia);

        JOptionPane.showMessageDialog(null, "¡Asignatura de " + nombre + " almacenada!");

    }

    static void update_subjects() {
        //Actualizar asignatura (6)
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la asignatura");
        Materia materia = buscarMateria(nombre);
        if (materia == null) {
            JOptionPane.showMessageDialog(null, "Materia no encontrada");
            return;
        }

        String newNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la materia");

        for (Materia materiaUni : listaMaterias) {
            if (materiaUni.nombre.equalsIgnoreCase(nombre)) {
                materiaUni.nombre = newNombre;
                JOptionPane.showMessageDialog(null, "¡Nombre actualizado!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Materia no encontrada para actualizar el nombre");
    }

    static void delete_subjects() {
        //Eliminar asignatura (7)

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la materia");
        Materia materia = buscarMateria(nombre);
        if (materia == null) {
            JOptionPane.showMessageDialog(null, "Materia no encontrada");
            return;
        }

        for (Materia materiaUni : listaMaterias) {
            if (materiaUni.nombre.equalsIgnoreCase(nombre)) {
                listaMaterias.remove(materiaUni);
                JOptionPane.showMessageDialog(null, "¡Materia eliminada!");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Materia no encontrada para la eliminación");

    }

    static void update_note() {
        //Actualizar notas (8)

        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante");
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la materia");
        Materia materia = buscarMateria(nombre);
        if (materia == null) {
            JOptionPane.showMessageDialog(null, "Materia no encontrada");
            return;
        }

        for (Estudiante estudianteUni : listaEstudiantes) {
            if (estudianteUni.codigo.equalsIgnoreCase(codigo)) {

                double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primer nota"));
                double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
                double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercer nota"));

                materia = new Materia(nombre, nota1, nota2, nota3);
                //listaMaterias.add(materia);
                estudianteUni.materias.add(materia);

                JOptionPane.showMessageDialog(null, "¡Materia y notas almacenada actualizado!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante no encontrado para actualizar el nombre");

    }

    static void read_all_students() {
        //Listar todos los estudiante(9)

        StringBuilder estudiantes = new StringBuilder("Estudiantes:\n");
        for (Estudiante estudiante : listaEstudiantes) {
            estudiantes.append("Nombre: " + estudiante.nombre + " // codigo: " + estudiante.codigo).append("\n");
            System.out.println("Nombre: " + estudiante.nombre + " // codigo: " + estudiante.codigo);
        }
        JOptionPane.showMessageDialog(null, estudiantes.toString());

    }

    static void read_all_subjects() {
        //Listar todos los estudiante(9)

        StringBuilder materias = new StringBuilder("Materias:\n");
        for (Materia materia : listaMaterias) {
            materias.append("Nombre: " + materia.nombre).append("\n");
            System.out.println("Nombre: " + materia.nombre);
        }
        JOptionPane.showMessageDialog(null, materias.toString());

    }

    public static String generarCadenaAlfanumerica(int longitud) {
        final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new SecureRandom();
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadena.append(caracterAleatorio);
        }

        return cadena.toString();
    }

    static Estudiante buscarEstudiante(String codigo) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.codigo.equalsIgnoreCase(codigo)) {
                return estudiante;
            }
        }
        return null;
    }

    static Materia buscarMateria(String nombre) {
        for (Materia materia : listaMaterias) {
            if (materia.nombre.equalsIgnoreCase(nombre)) {
                return materia;
            }
        }
        return null;
    }
}
