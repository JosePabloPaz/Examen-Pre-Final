package Problema2;

public class TrianguloEquilatero extends Triangulo{
	/**
	 * @return Area de un Triangulo Equilatero
	 */
	public double area() {
		return l1 * altura /2;
	}
	/**
	 * @return Perimetro de un Triangulo Isoceles
	 */
	public double perimetro() {
		return 3 * l1;
	}
}
