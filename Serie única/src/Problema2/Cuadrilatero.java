package Problema2;

public class Cuadrilatero implements Poligono{
	protected int ancho = 0;
	protected int altura = 0;
	/**
	 * @return Area de Cuadrilatero
	 */
	@Override
	public double area() {
		return ancho * altura;
	}
	/**
	 * @return Perimetro de Cuadrilatero
	 */
	@Override
	public double perimetro() {
		return 2*ancho + 2*altura;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	
}
