import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Hospital2023 {
    private List<Pacientes> pacientes;
    private List<Doctores> doctores;

    public Hospital2023() {
        this.pacientes = new ArrayList<>();
        this.doctores = new ArrayList<>();
    }

    public void registrarPaciente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el DNI:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la direccion:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el peso:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la temperatura:");
        double temperatura = scanner.nextDouble();

        Pacientes nuevoPaciente = new Pacientes(dni, nombre, direccion, peso, temperatura, apellido);

        pacientes.add(nuevoPaciente);

        System.out.println("Paciente registrado");
    }
    
    public void eliminarPaciente(int posicion) {
        if (posicion >= 0 && posicion < pacientes.size()) {
            mostrarListaPacientesRegistrados();
            Pacientes pacienteEliminado = pacientes.remove(posicion);
            System.out.println("Paciente eliminado: " + pacienteEliminado.getNombre());
        } else {
            System.out.println("No se eliminó ningún paciente");
        }
    }


    public void modificarDatosPaciente(int posicion) {
        if (posicion >= 0 && posicion < pacientes.size()) {
            mostrarListaPacientesRegistrados();
            Scanner scanner = new Scanner(System.in);
            Pacientes pacienteAModificar = pacientes.get(posicion);

            System.out.println("Modificando datos del paciente: " + pacienteAModificar.getNombre());
            System.out.println("Ingrese el nuevo nombre:");
            String nuevoNombre = scanner.next();
            pacienteAModificar.setNombre(nuevoNombre);

            System.out.println("Ingrese la nueva dirección:");
            String nuevaDireccion = scanner.next();
            pacienteAModificar.setDireccion(nuevaDireccion);

            System.out.println("Ingrese el nuevo peso:");
            double nuevoPeso = scanner.nextDouble();
            pacienteAModificar.setPeso(nuevoPeso);

            System.out.println("Ingrese la nueva temperatura:");
            double nuevaTemperatura = scanner.nextDouble();
            pacienteAModificar.setTemperatura(nuevaTemperatura);

            System.out.println("Datos del paciente modificado.");
        } else {
            System.out.println("No se modificaron los datos del paciente");
        }
    }
    
    private void mostrarListaPacientesRegistrados() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
            return;
        }

        Collections.sort(pacientes, Comparator.comparing(Pacientes::getApellido));

        System.out.println("Lista de pacientes registrados:");
        System.out.printf("%-5s%-20s%-20s%-15s%n", "ID", "Nombre", "Apellido", "DNI", "Direccion", "Peso", "Temperatura");

        int id = 1;
        for (Pacientes paciente : pacientes) {
            System.out.printf("%-5d%-20s%-20s%-15s%n", id++, paciente.getNombre(), paciente.getApellido(), paciente.getDNI(), paciente.getDireccion(), paciente.getPeso(), paciente.getTemperatura());
        }
    }
    
	    public void mostrarPesoMasRepetido() {
	        if (pacientes.isEmpty()) {
	            System.out.println("No hay pacientes registrados");
	            return;
	        }

	        List<Double> pesos = new ArrayList<>();

	        for (Pacientes paciente : pacientes) {
	            pesos.add(paciente.getPeso());
	        }

	     
	        Collections.sort(pesos);
	        double pesoMasRepetido = 0;
	        int frecuenciaActual = 1;
	        int maxFrecuencia = 1;

	 
	        for (int i = 1; i < pesos.size(); i++) {
	            if (pesos.get(i).equals(pesos.get(i - 1))) {
	                frecuenciaActual++;

	                if (frecuenciaActual > maxFrecuencia) {
	                    maxFrecuencia = frecuenciaActual;
	                    pesoMasRepetido = pesos.get(i);
	                }
	            } else {
	                frecuenciaActual = 1;
	            }
	        }

	        System.out.println("El peso que mas se repite es: " + pesoMasRepetido);
	    }

	    public void mostrarCantidadPacientesConPesoRepetido() {
	        if (pacientes.isEmpty()) {
	        System.out.println("No hay pacientes registrados");
	        return;
	    }

	   
	    List<Double> pesos = new ArrayList<>();

	    
	    for (Pacientes paciente : pacientes) {
	        pesos.add(paciente.getPeso());
	    }

	   
	    Collections.sort(pesos);

	    
	    double pesoMasRepetido = 0;
	    int frecuenciaActual = 1;
	    int maxFrecuencia = 1;

	   
	    for (int i = 1; i < pesos.size(); i++) {
	        if (pesos.get(i).equals(pesos.get(i - 1))) {
	            frecuenciaActual++;

	            if (frecuenciaActual > maxFrecuencia) {
	                maxFrecuencia = frecuenciaActual;
	                pesoMasRepetido = pesos.get(i);
	            }
	        } else {
	            frecuenciaActual = 1;
	        }
	    }
	    
	    int cantidadPacientesConPesoRepetido = 0;
	    for (Pacientes paciente : pacientes) {
	        if (paciente.getPeso() == pesoMasRepetido) {
	            cantidadPacientesConPesoRepetido++;
	        }
	    }

	    System.out.println("Cantidad de pacientes con el peso que mas se repite: " + cantidadPacientesConPesoRepetido);

	    }

	    public void mostrarPesoMayorYMenor() {
	        
	        if (pacientes.isEmpty()) {
	        System.out.println("No hay pacientes registrados");
	        return;
	    }

	    double pesoMayor = pacientes.get(0).getPeso();
	    double pesoMenor = pacientes.get(0).getPeso();

	    
	    for (Pacientes paciente : pacientes) {
	        double pesoActual = paciente.getPeso();
	        
	        if (pesoActual > pesoMayor) {
	            pesoMayor = pesoActual;
	        }

	        if (pesoActual < pesoMenor) {
	            pesoMenor = pesoActual;
	        }
	    }

	    System.out.println("Peso mayor: " + pesoMayor);
	    System.out.println("Peso menor: " + pesoMenor);
	    
	    }

	    public void dividirRangoPesos() {
	        
	       if (pacientes.isEmpty()) {
	        System.out.println("No hay pacientes registrados");
	        return;
	    }

	   
	    double pesoMinimo = pacientes.get(0).getPeso();
	    double pesoMaximo = pacientes.get(0).getPeso();

	    for (Pacientes paciente : pacientes) {
	        double pesoActual = paciente.getPeso();

	        if (pesoActual < pesoMinimo) {
	            pesoMinimo = pesoActual;
	        }

	        if (pesoActual > pesoMaximo) {
	            pesoMaximo = pesoActual;
	        }
	    }

	    
	    int numRangos = 4;
	    double rango = (pesoMaximo - pesoMinimo) / numRangos;

	    
	    int[] conteoRangos = new int[numRangos];

	    
	    for (Pacientes paciente : pacientes) {
	        double pesoActual = paciente.getPeso();

	        for (int i = 0; i < numRangos; i++) {
	            double rangoMinimo = pesoMinimo + i * rango;
	            double rangoMaximo = pesoMinimo + (i + 1) * rango;

	            if (pesoActual >= rangoMinimo && pesoActual < rangoMaximo) {
	                conteoRangos[i]++;
	                break;  
	            }
	        }
	    }

	   
	    for (int i = 0; i < numRangos; i++) {
	        double rangoMinimo = pesoMinimo + i * rango;
	        double rangoMaximo = pesoMinimo + (i + 1) * rango;

	        System.out.println("Rango " + (i + 1) + ": " + conteoRangos[i] + " pacientes (" +
	                "de " + rangoMinimo + " a " + rangoMaximo + " kg)");
	    }
	}

	    public void mostrarListaPacientesOrdenados() {
	        if (pacientes.isEmpty()) {
	            System.out.println("No hay pacientes registrados");
	            return;
	        }

	        Collections.sort(pacientes, Comparator.comparing(Pacientes::getApellido));

	        System.out.println("Lista de pacientes registrados:");
	        System.out.printf("%-5s%-20s%-20s%-15s%n", "ID", "Nombre", "Apellido", "DNI");

	        int id = 1;
	        for (Pacientes paciente : pacientes) {
	            System.out.printf("%-5d%-20s%-20s%-15s%n", id++, paciente.getNombre(), paciente.getApellido(), paciente.getDNI());
	        }
	    }

	    
	    public void indicarDoctorQueAtendioPaciente() {
	        
	        Scanner scanner = new Scanner(System.in);

	    if (pacientes.isEmpty()) {
	        System.out.println("No hay pacientes registrados");
	        return;
	    }

	    System.out.println("Lista de pacientes:");
	    for (int i = 0; i < pacientes.size(); i++) {
	        System.out.println((i + 1) + ". " + pacientes.get(i).getNombre());
	    }

	    System.out.println("Ingrese el numero del paciente:");
	    int numeroPaciente = scanner.nextInt();

	    if (numeroPaciente >= 1 && numeroPaciente <= pacientes.size()) {
	        Pacientes pacienteSeleccionado = pacientes.get(numeroPaciente - 1);

	        System.out.println("Lista de doctores:");
	        for (int i = 0; i < doctores.size(); i++) {
	            System.out.println((i + 1) + ". " + doctores.get(i).getNombre());
	        }

	        System.out.println("Ingrese el numero del doctor que atendi� al paciente:");
	        int numeroDoctor = scanner.nextInt();

	        if (numeroDoctor >= 1 && numeroDoctor <= doctores.size()) {
	            Doctores doctorSeleccionado = doctores.get(numeroDoctor - 1);

	            pacienteSeleccionado.setMedicoAtendido(doctorSeleccionado);

	            System.out.println("Se ha registrado que el doctor " + doctorSeleccionado.getNombre() +
	                    " atendi� al paciente " + pacienteSeleccionado.getNombre() + ".");
	        } else {
	            System.out.println("Numero de doctor incorrecto");
	        }
	    } else {
	        System.out.println("Numero de paciente incorrecto");
	    }

	    }
	        
	    public void buscarDoctoresPorEspecialidad() {
	      
	       Scanner scanner = new Scanner(System.in);

	    
	    System.out.println("Especialidades disponibles:");
	    for (Doctores doctor : doctores) {
	        System.out.println("- " + doctor.getEspecialidad());
	    }

	    
	    System.out.println("Ingrese la especialidad a buscar:");
	    String especialidadBuscada = scanner.nextLine();

	    
	    boolean encontrados = false;
	    System.out.println("Doctores con la especialidad '" + especialidadBuscada + "':");
	    for (Doctores doctor : doctores) {
	        if (doctor.getEspecialidad().equalsIgnoreCase(especialidadBuscada)) {
	            System.out.println("- " + doctor.getNombre());
	            encontrados = true;
	        }
	    }

	    if (!encontrados) {
	        System.out.println("No se encontraron doctores con la especialidad '" + especialidadBuscada + "'.");
	    }
	    }

		public void setDoctores(List<Doctores> doctores) {
			
			
		}

		public void setPacientes(List<Pacientes> pacientes) {
			
			
		}
		public List<Pacientes> getPacientes() {
		    return pacientes;
		}

}
