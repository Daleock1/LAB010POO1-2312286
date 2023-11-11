package GestionDeDatosPacientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	  static List<Paciente> pacientes = new ArrayList<>();
	    static List<Medico> doctores = new ArrayList<>();
	    static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
    	
    	Hospital hospital = new Hospital();
   
        boolean salirMenuPrincipal = false;
        try (Scanner entradaMenu = new Scanner(System.in)) {
			System.out.println("****** BIENVENIDOS AL SISTEMA DE GESTION DE PACIENTES ******");

			do {
			    System.out.println("\n1 - REGISTRAR LOS DATOS DE LOS PACIENTES UNO A UNO");
			    System.out.println("2 - ELIMINAR LOS DATOS DE UN PACIENTE DADO SU POSICION UNA LISTA");
			    System.out.println("3 - MODIFICAR LOS DATOS DE UN PACIENTE DE LA LISTA");
			    System.out.println("4 - MOSTRAR EL PESO QUE MAS SE REPITE EN LA LISTA");
			    System.out.println("5 - MOSTRAR LA CANTIDAD DE PACIENTES QUE TIENEN EL PESO QUE MAS SE REPITE");
			    System.out.println("6 - MOSTRAR EL PESO MAYOR Y MENOR");
			    System.out.println("7 - DIVIDIR EL RANGO DE PESOS POR 4");
			    System.out.println("8 - MOSTRAR LA LISTA DE PACIENTES ORDENADOS POR APELLIDOS");
			    System.out.println("9 - DADO UN PACIENTE INDICAR QUE DOCTOR LO ATENDIO");
			    System.out.println("10 - BUSCAR LOS DOCTORES POR ESPECIALIDAD");
			    System.out.println("11 - Sair\n\n");
			    System.out.println("QUE ACTIVIDAD DESEA EJECUTAR?");

			    int entradaInt = entradaMenu.nextInt();

			    switch (entradaInt) {
			        case 1: {
			        	 hospital.registrarPaciente();
			            break;
			        }
			        case 2: {
			           
			            break;
			        }
			        case 3: {
			           
			            break;
			        }
			        case 4: {

			            break;
			        }
			        case 5: {
			           
			            break;
			        }
			        case 6: {
			           
			            break;
			        }
			        case 7: {
			      
			            break;
			        }
			        case 8: {
			            
			            break;
			        }
			        case 9: {
			       
			            break;
			        }
			        case 10: {
			   
			            break;
			        }
					case 11:
					{
						System.out.println("CERRANDO PROGRAMA");
						System.out.println("Gracias por su visita");
						salirMenuPrincipal = true;
						
						break;
					}
					
			        default: {
			            System.out.println("CARACTER INVALIDO.");
			            break;
			        }
			    }
			} while (salirMenuPrincipal == false);
		}
    }
}

				
			
	


