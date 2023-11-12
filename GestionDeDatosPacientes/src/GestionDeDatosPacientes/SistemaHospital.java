import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class SistemaHospital {
    private List<Pacientes> pacientes;
    private List<Doctores> doctores;

    public SistemaHospital() {
        this.setPacientes(new ArrayList<>());
        this.setDoctores(new ArrayList<>());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital2023 hospital = new Hospital2023();

        List<Doctores> listaDoctores = new ArrayList<>();
        listaDoctores.add(new Doctores(12345, "Dr. Firulais", "Cardiología"));
        listaDoctores.add(new Doctores(67890, "Dr. Maanaky", "Neurología"));

        List<Pacientes> listaPacientes = new ArrayList<>();
        listaPacientes.add(new Pacientes("78246874", "Diego", "EL AGUSTINO", 73, 28, "Inca"));
        listaPacientes.add(new Pacientes("88462578", "Josue", "SJL", 1.65, 28, "Gonzales"));

        hospital.setDoctores(listaDoctores);
        hospital.setPacientes(listaPacientes);

        int opcion;

    do {
        System.out.println("1. Registrar paciente");
        System.out.println("2. Eliminar paciente");
        System.out.println("3. Modificar datos del paciente");
        System.out.println("4. Mostrar el peso que mas se repite");
        System.out.println("5. Mostrar la cantidad de pacientes con el peso repetido");
        System.out.println("6. Mostrar el peso mayor y menor");
        System.out.println("7. Mostrar los pesos en rangos");
        System.out.println("8. Mostrar la lista de pacientes ordenados por apellido");
        System.out.println("9. Mostrar el doctor que atendio al paciente");
        System.out.println("10. Buscar Doctores por especialidad");
        System.out.println("11. Salir");
        System.out.println("Ingrese la opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                hospital.registrarPaciente();
                break;
            case 2:
                System.out.println("Lista de pacientes registrados:");
                

                System.out.println("Ingrese la posición del paciente que va a eliminar:");
                int posicionEliminar = scanner.nextInt();
                hospital.eliminarPaciente(posicionEliminar - 1);
                break;

            case 3:
                
                System.out.println("Ingrese la posicion del paciente que va a modificar:");
                int posicionModificar = scanner.nextInt();
                hospital.modificarDatosPaciente(posicionModificar);
                break;
            case 4:
                hospital.mostrarPesoMasRepetido();
                break;
            case 5:
                hospital.mostrarCantidadPacientesConPesoRepetido();
                break;
            case 6:
                hospital.mostrarPesoMayorYMenor();
                break;
            case 7:
                hospital.dividirRangoPesos();
                break;
            case 8:
                hospital.mostrarListaPacientesOrdenados();
                break;
            case 9:
                hospital.indicarDoctorQueAtendioPaciente();
                break;
            case 10:
                hospital.buscarDoctoresPorEspecialidad();
                break;
            case 11:
                System.out.println("Saliendo.");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

    } while (opcion != 0);

  
}

	public List<Doctores> getDoctores() {
		return doctores;
	}

	public void setDoctores(List<Doctores> doctores) {
		this.doctores = doctores;
	}

	public List<Pacientes> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Pacientes> pacientes) {
		this.pacientes = pacientes;
	}

     
        
    }
