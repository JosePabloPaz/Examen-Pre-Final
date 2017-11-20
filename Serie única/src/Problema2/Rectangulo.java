package Problema2;

public class Rectangulo extends Cuadrilatero{
	/**
	 * @return Area de un Rectangulo
	 */
	public double area() {
		return ancho * altura;
	}
	/**
	 * @return Perimetro de un Rectangulo
	 */
	public double perimetro() {
		return 2 * ancho + 2 * altura;
	}
}
