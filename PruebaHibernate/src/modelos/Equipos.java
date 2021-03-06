package modelos;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Equipos implements Serializable {

	private String nombre;
	private String ciudad;
	private String conferencia;
	private String division;
	private Set<Jugadores> jugadores;
	
	public Equipos() {
		
	}
	
	public Equipos(String nombre, String ciudad, String conferencia, String division) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;		
	}
	
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	public Set<Jugadores> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugadores> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	// Fin Getters y Setters
	
	

	@Override
	public String toString() {
		
		return "Nombre: " + nombre + " Conferencia: " + conferencia + " Ciudad: " + ciudad; 
	}
}
