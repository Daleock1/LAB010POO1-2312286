package GestionDeDatosPacientes;

public class Medico {

	String nroDeColegiatuira;
	String nombre;
	String especialidad;
	
	public Medico(String nroDeColegiatuira, String nombre, String especialidad) {
		super();
		this.nroDeColegiatuira = nroDeColegiatuira;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public String getNroDeColegiatuira() {
		return nroDeColegiatuira;
	}

	public void setNroDeColegiatuira(String nroDeColegiatuira) {
		this.nroDeColegiatuira = nroDeColegiatuira;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medico [nroDeColegiatuira=" + nroDeColegiatuira + ", nombre=" + nombre + ", especialidad="
				+ especialidad + "]";
	}
	
	
	
}
