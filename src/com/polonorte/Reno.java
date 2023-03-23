package com.polonorte;

/**
 * Class Reno.
 * Representa un Reno y las acciones que hace
 * 
 * @author sofia
 * @version 1.0
 * 
 */
public class Reno {

	/**
	 * Constantes de un Reno
	 */
    private String nombre;
    private int velocidad;

    private int numCuernos;
    private int numCollares;
    
    private String apodo;
   
    //Esto es un comentario de prueba
    
    public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	/**
	 * Método que representa el vuelo de un Reno
	 * @param direccion la direccion en la que un Reno vuela
	 * @return una frase la frase del chillido que se produce el Reno en el vuelo
	 * 
	 */
	public String volar(String direccion){
        System.out.println("Reno.volar");

        return "mmmmmiiiiii chus chus peeeeerrrr";
    }

  
    public void correr(String direccion){
        //TODO terminar
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}

	public int getNumCollares() {
		return numCollares;
	}

	public void setNumCollares(int numCollares) {
		this.numCollares = numCollares;
	}

    //comentario

}
