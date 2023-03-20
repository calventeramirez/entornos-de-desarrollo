package com.entornos.calvente.poligono.figuras;

import java.util.Random;

/**
 * Representa un rectangulo. Contine los metodos para calcular el area y el
 * perimetro.
 *
 * @author Pablo Calvente
 *
 * @version 1.0
 *
 */
public class Rectangulo {

    int altura, anchura;

    /**
     * Crea un rectangulo con la altura y la anchura especificadas
     *
     * @param al La altura del rectangulo
     * @param an La anchura del rectangulo
     *
     */
    public Rectangulo(int al, int an) {
        altura = al;
        anchura = an;
    }
    
    /**
     * Crea un rectangulo con la altura y la anchura aleatoria. Ambos seran
     * numeros aleatorios entre 1 y 10.
     * 
     * @see java.util.Random
     */
    public Rectangulo() {
    	Random alea = new Random();
    	altura = alea.nextInt(10)+1;
    	anchura = alea.nextInt(10)+1;
    }

    /**
     * Devuelve el perimetro del rectangulo, es decir, la suma de todos los
     * lados
     *
     * @return el perimetro del rectangulo
     */
    public int perimetro() {
        return 2 * altura + 2 * anchura;
    }

    /**
     * Devuelve el area del rectangulo
     *
     * @return el area del rectangulo
     */
    public double area() {
        return (anchura * altura);
    }

    /**
     * Devuelve la altura del rectangulo
     *
     * @return la altura del rectangulo
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Devuelve la anchura del rectangulo
     *
     * @return la anchura del rectangulo
     */
    public int getAnchura() {
        return anchura;
    }

    /**
     * Guarda la altura del rectangulo en su variable
     *
     * @param altura la altura la cual se va a pasar
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Guarda la anchura del rectangulo en su variable
     *
     * @param anchura la anchura la cual se va a pasar
     */
    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    /**
     * Devuelve la representación del rectangulo
     *
     * @return la representación del objeto
     */
    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", anchura=" + anchura + '}';
    }

}
