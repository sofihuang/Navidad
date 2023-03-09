package com.polonorte;

public class SantaClaus {

	private static final String CARACTER_AMIGABLE = "AMIGABLE";
	private static final String CARACTER_CABREADO = "CABREADO";
	private static final String CARACTER_FURIOSO = "FURIOSO";

	// Los kilos de peso de SantaClaus
	private int kilosPeso;

	// Si está trabajando ya o no
	private boolean trabajando;

	private String caracterActual;

	public SantaClaus() {
		this.trabajando = false;
		this.caracterActual = CARACTER_AMIGABLE;
	}

	public String generarSaludoSegunCaracter(String caracter) {

		String saludo;
		switch (caracter) {
		case CARACTER_AMIGABLE: 
			saludo = "hohoho, ¡feliz navidad pequeños y adorables niños!";
			break;
		case CARACTER_CABREADO: 
			saludo = "¡todos los años pidiendo juguetes! ¡Me tenéis harto!";
			break;
		case CARACTER_FURIOSO: 
			saludo = "ODIO LA NAVIDAAAAADD!! DEJAD DE ESCRIBIRME!";
			break;
		default:
			saludo = "hoho? otra vez?";

		}
		return saludo;
	}
	
	//Este se tiene que considerar obsoleto, y referenciar al metodo generarSaludoSegunCaracter
	public String saludar() {
		return "hohoho";
	}

	public int getKilosPeso() {
		return kilosPeso;
	}

	public void setKilosPeso(int kilosPeso) {
		this.kilosPeso = kilosPeso;
	}

	public boolean isTrabajando() {
		return trabajando;
	}

	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}

	public String getCaracterActual() {
		return caracterActual;
	}

	public void setCaracterActual(String caracterActual) {
		this.caracterActual = caracterActual;
	}

}
