package Problema2;
/**
 * @author Jose Pablo Paz
 */
public class Triangulo implements Poligono{
	protected int base = 0;
	protected int altura = 0;
	protected int l1 =0;
	private int l2 = 0;
	protected int l3 = 0;
	
	/**
	 * @return Area de un Triangulo
	 */
	@Override
	public double area() {
		return  (base * altura / 2);
	}

	/**
	 * @return Perimetro de un Triangulo
	 */
	@Override
	public double perimetro() {
		return l1 + l2 + l3;
	}

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
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

	/**
	 * @return the l1
	 */
	public int getL1() {
		return l1;
	}

	/**
	 * @param l1 the l1 to set
	 */
	public void setL1(int l1) {
		this.l1 = l1;
	}

	/**
	 * @return the l2
	 */
	public int getL2() {
		return l2;
	}

	/**
	 * @param l2 the l2 to set
	 */
	public void setL2(int l2) {
		this.l2 = l2;
	}

	/**
	 * @return the l3
	 */
	public int getL3() {
		return l3;
	}

	/**
	 * @param l3 the l3 to set
	 */
	public void setL3(int l3) {
		this.l3 = l3;
	}
	
	

	
}
