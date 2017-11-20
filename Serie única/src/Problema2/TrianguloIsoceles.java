package Problema2;

public class TrianguloIsoceles extends Triangulo{
	/**
	 * @return Area de un Triangulo Isoceles
	 */
	public double area() {
		return l3 * altura / 2;
	}
	/**
	 * @return Perimetro de un Triangulo Isoceles
	 */
	public double perimetro() {
		return 2 * l1 + l3;
	}
}
