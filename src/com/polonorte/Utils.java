package com.polonorte;

import java.time.LocalDate;
import java.util.Random;

//Esta clase contiene métodos útiles, es la version 1.2 y la creó Melchor
public class Utils {

	// Las constantes relacionadas con el caracter de SantaClaus o de un reno
	public static final String CARACTER_AMIGABLE = "AMIGABLE";
	public static final String CARACTER_CABREADO = "CABREADO";
	public static final String CARACTER_FURIOSO = "FURIOSO";
	private static Random generador = new Random();

	// Genera un elemento de fecha aleatorio en el mes de diciembre del presente año
	// Presente desde la version 1.1
	public static LocalDate generarDiaAleatorioDiciembre() {
		
		int numEntre22Y25 = generador.nextInt(4)+22;
		return LocalDate.of(LocalDate.now().getYear(), 12, numEntre22Y25);
	}

	public static String generarCaracterAleatorio() {

		
		int numeroAleatorio = generador.nextInt(150);
		String caracter;
		switch (numeroAleatorio % 3) {
		case 0:
			caracter = CARACTER_AMIGABLE;
			break;
		case 1:
			caracter = CARACTER_CABREADO;
			break;
		case 2:
		default:
			caracter = CARACTER_FURIOSO;
		}

		return caracter;
	}

}
