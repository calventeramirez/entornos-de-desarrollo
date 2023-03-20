package com.entornos.calvente.poligono.figuras;

import java.util.Random;

/**
 * Representa un Circulo. Contine los constructores para crear un circulo dado
 * el radio y para crear un circulo con un radio aleatorio entre 1 y 10. Contine
 * metodos para calcular area y el perimetro.
 *
 * @author Pablo Calvente
 *
 * @version 1.0
 *
 */
public class Circulo {
	private int radio;

	/**
	 * Crea un circulo con radio aleatorio. El radio sera un valor entre 1 y 10
	 * (entero)
	 * 
	 * @see java.util.Random
	 */
	public Circulo() {
		Random alea = new Random();
		radio = alea.nextInt(10) + 1;
	}

	/**
	 * Crea un ciruclo con un radio pasado por parametro.
	 * 
	 * @param radio radio del circulo
	 */
	public Circulo(int radio) {
		this.radio = radio;
	}

	/**
	 * Devuelve el area del circulo
	 * 
	 * @return el area del circulo
	 */
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	/**
	 * Devuelve el perimetro del circulo
	 * 
	 * @return el perimetro del circulo
	 */
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	/**
	 * Devuelve el valor del radio (Entero)
	 * 
	 * @return Valor del radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * Cambia el valor de la variable del radio
	 * 
	 * @param radio radio con el que se va a cambiar internamente el valor
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * Devuelve la representacion del objeto
	 * 
	 * @return La representacion del objeto
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}
