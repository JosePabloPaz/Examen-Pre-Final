package Problema2;

public class Cuadrado extends Cuadrilatero{
	/**
	 * @return Area de un Cuadrado
	 */
	public double area() {
		return ancho^2;
	}
	/**
	 * @return Perimetro de un Cuadrado
	 */
	public double perimetro() {
		return 4 * ancho;
	}
}
