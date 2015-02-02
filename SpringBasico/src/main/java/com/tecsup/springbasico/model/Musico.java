package com.tecsup.springbasico.model;

import java.util.List;

public class Musico {

	private String nombre;
	private int cancionesConocidas;
	private Instrumento instrumento;
	private List<Instrumento> instrumentos;
	private List<Instrumento> instrumentos02;

	public Musico() {

	}
	
	public Musico(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	
/*
	public Musico(int cancionesConocidas, Instrumento instrumento) {
		this.cancionesConocidas = cancionesConocidas;
		this.instrumento = instrumento;
	}

	public Musico(int cancionesConocidas) {
		this.cancionesConocidas = cancionesConocidas;
	}
	*/

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCancionesConocidas() {
		return cancionesConocidas;
	}

	public void setCancionesConocidas(int cancionesConocidas) {
		this.cancionesConocidas = cancionesConocidas;
	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

	public void queSoy() {
		System.out.println("Soy un Musico");
	}

	public List<Instrumento> getInstrumentos02() {
		return instrumentos02;
	}

	public void setInstrumentos02(List<Instrumento> instrumentos02) {
		this.instrumentos02 = instrumentos02;
	}
	
	

}
