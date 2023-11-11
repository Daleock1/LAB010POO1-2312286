package GestionDeDatosPacientes;

public class Paciente {

	String Dni;
	String nombre;
	String direccion;
	double peso;
	double temperatura;
	public Paciente(String dni, String nombre, String direccion, double peso, double temperatura) {
		super();
		Dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.peso = peso;
		this.temperatura = temperatura;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	@Override
	public String toString() {
		return "Paciente [Dni=" + Dni + ", nombre=" + nombre + ", direccion=" + direccion + ", peso=" + peso
				+ ", temperatura=" + temperatura + "]";
	}

	
}
