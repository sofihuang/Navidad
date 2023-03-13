package com.polonorte;

import java.time.LocalDate;
import java.time.Month;

/**
 * Clase Santa Claus.
 * Representa al padre de la navidad, Santa Claus.
 * 
 * 
 * @author Baltasar
 * @version 1.2
 *
 */

//Esta clase describe a un santa claus y la creó Baltasar. Se considera que es la versión 1.2 del programa
public class SantaClaus {

	// Los kilos de peso de SantaClaus
	private int kilosPeso;

	// Si está trabajando ya o no
	private boolean trabajando;

	private String caracterActual;

	   /**
	    * Hace que Santa Claus deje de trabajar y cambia su carácter a amigable
	    */
	
	public SantaClaus() {
		this.trabajando = false;
		this.caracterActual = Utils.CARACTER_AMIGABLE;
	}

	// (Este método se ha introducido desde la versión 1.1)
	
	   /**
	    * Santa Claus saluda en base al carácter que tenga
	    * @param carácter actual de Santa Claus
	    * @return saludo String acorde a carácter
	    * @since 1.1
	    */
	public String generarSaludoSegunCaracter(String caracter) {

		String saludo;
		switch (caracter) {
		case Utils.CARACTER_AMIGABLE:
			saludo = "hohoho, ¡feliz navidad pequeños y adorables niños!";
			break;
		case Utils.CARACTER_CABREADO:
			saludo = "¡todos los años pidiendo juguetes! ¡Me tenéis harto!";
			break;
		case Utils.CARACTER_FURIOSO:
			saludo = "ODIO LA NAVIDAAAAADD!! DEJAD DE ESCRIBIRME!";
			break;
		default:
			saludo = "hoho? otra vez?";

		}
		return saludo;
	}

	// (Este método se ha introducido desde la versión 1.2)
	// Incluir con javadoc que se lanza la DatosInvalidosException (mirar ->
	// https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#@exception)
	
	   /**
	    * Comprueba la fecha para ver si Santa Claus trabaja
	    * @since 1.2
	    * @param fecha
	    * @throws DatosInvalidosException si fecha null
	    * @return true si mes Diciembre; false en caso contrario
	    */
	public boolean comprobarTrabajo(LocalDate fecha) throws DatosInvalidosException {

		if (fecha == null) {
			throw new DatosInvalidosException("La fecha no puede ser nula");
		}

		if (fecha.getMonth().equals(Month.DECEMBER) && fecha.getDayOfMonth() == 25) {
			this.trabajando = true;
		} else {
			this.trabajando = false;
		}

		return this.trabajando;
	}

	// Este metodo está desde la versión 0.5. se tiene que considerar obsoleto, y
	// referenciar al metodo
	// generarSaludoSegunCaracter
	
	   /**
	    * Santa Claus saluda
	    * @return el saludo típico de Santa Claus en String
	    * @deprecated usar {@link #generarSaludoSegunCaracter(String)}
	    */
	public String saludar() {
		return "hohoho";
	}

	/**
	 * @return the kilosPeso
	 */
	public int getKilosPeso() {
		return kilosPeso;
	}

	/**
	 * @param kilosPeso the kilosPeso to set
	 */
	public void setKilosPeso(int kilosPeso) {
		this.kilosPeso = kilosPeso;
	}

	/**
	 * @return the trabajando
	 */
	public boolean isTrabajando() {
		return trabajando;
	}

	/**
	 * @param trabajando the trabajando to set
	 */
	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}

	/**
	 * @return the caracterActual
	 */
	public String getCaracterActual() {
		return caracterActual;
	}

	/**
	 * @param caracterActual the caracterActual to set
	 */
	public void setCaracterActual(String caracterActual) {
		this.caracterActual = caracterActual;
	}

	/* Getters y setters. No hace falta Javadoc en este caso */

}
