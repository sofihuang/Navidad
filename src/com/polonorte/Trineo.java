package com.polonorte;

import java.util.List;

/**
 * Class Trineo.
 * Representa caracteristica de un trineo y inclución de Reno y repartir relagos
 * 
 * @author sofia
 * @version 1.0
 * 
 */
public class Trineo {

	/**
	 * Constantes de Trineo
	 */
	private int numAsientos;
	private int peso;
	private int volumenRegalos;
	private List<String> bolsaRegalos;

	public static void main(String[] args) {

		System.out.println("Clase Trineo.main");
		Reno rudolf = new Reno();
		rudolf.volar("vamos!");
	}

	private List<Reno> renos;

	/**
	 * Método para añadir regalos en el bolso
	 * @param regalo es un tipo de regalo 
	 * @return añadir un regalo en la bolsa de regalo
	 */
	public boolean meterRegalo(String regalo) {
		return this.bolsaRegalos.add(regalo);
	}

	/**
	 * Método para incluir Reno
	 * @param uno Reno para incluir
	 * @return incluir un Reno en renos
	 */
	public boolean incluirReno(Reno uno) {
		return this.renos.add(uno);

	}

	/**
	 * Método para mostrar que se ha sido bueno o no
	 * 
	 * @param nombre el nombre quien quieres ver que ha comportado bien o no
	 * @param numeroPeleas veces que uno ha peleado
	 * @param vecesGracias veces que uno ha dado la gracia
	 * @param vecesPorFavor veces que uno ha dicho por favor
	 * @return haSidoBueno true significa que ha sido bueno , false significa que no ha sido bueno
	 * 
	 * 
	 */
	public boolean mereceRegalo(String nombre, int numeroPeleas, int vecesGracias, int vecesPorFavor) {

		boolean haSidoBueno = false;

		if (numeroPeleas == 0) {
			haSidoBueno = true;
		} else if (numeroPeleas > 0 && vecesGracias > 10 && vecesPorFavor > 8) {
			haSidoBueno = true;
		} else {
			haSidoBueno = false;
		}

		return haSidoBueno;
	}

}
