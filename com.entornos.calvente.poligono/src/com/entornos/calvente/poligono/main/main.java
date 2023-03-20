package com.entornos.calvente.poligono.main;

import com.entornos.calvente.poligono.figuras.Circulo;
import com.entornos.calvente.poligono.figuras.Rectangulo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(5, 10);
		Rectangulo r2 = new Rectangulo();

		Circulo[] arrayCirculos = new Circulo[5];

		for (int i = 0; i < arrayCirculos.length; i++) {
			arrayCirculos[i] = new Circulo();
		}
	}

}
 