package GestionDeDatosPacientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    static List<Paciente> pacientes = new ArrayList<>();
    static List<Medico> doctores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void registrarPaciente() {
        System.out.println("\nIngresar datos del paciente:");

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Peso: ");
        double peso = obtenerDoubleDesdeEntrada("Peso: ");

        System.out.print("Temperatura: ");
        double temperatura = obtenerDoubleDesdeEntrada("Temperatura: ");

        Paciente nuevoPaciente = new Paciente(dni, nombre, direccion, peso, temperatura);
        pacientes.add(nuevoPaciente);

        System.out.println("Paciente registrado con éxito:\n" + nuevoPaciente);
    }

    private double obtenerDoubleDesdeEntrada(String mensaje) {
        double valor = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                valor = scanner.nextDouble();
                entradaValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número decimal válido.");
                scanner.nextLine(); 
            }
        }

        return valor;
    }
}