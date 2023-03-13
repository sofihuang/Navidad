package com.polonorte;

import java.util.List;

/**
 * <h1>Clase Trineo</h1>
 * Lleva los regalos
 * @author alumno
 *
 */
public class Trineo {

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

   
    public boolean meterRegalo(String regalo){
        return this.bolsaRegalos.add(regalo);
    }

   /**
    * Incluye un reno en el trineo
    * @param uno El Reno a incluir
    * @see Reno
    * @return true si se ha podido incluir; false en caso contrario
    */
    public boolean incluirReno(Reno uno){
        return this.renos.add(uno);

    }


   
    public boolean mereceRegalo(String nombre, int numeroPeleas, int vecesGracias, int vecesPorFavor) {
    	
	    boolean haSidoBueno = false;
	    
	    if(numeroPeleas == 0) {
	    	haSidoBueno = true;
	    }else if(numeroPeleas > 0 && vecesGracias > 10 && vecesPorFavor > 8) {
	    	haSidoBueno = true;
	    }else {
	    	haSidoBueno = false;
	    }
	    
	    return haSidoBueno;
	}


}
