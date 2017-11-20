package Problema2;

public class Pentagono implements Poligono{
	private int l1, l2, l3, l4, l5, h1, h2, h3,h4,h5;
	/**
	 * @return Area de un Pentagono
	 */
	@Override
	public double area() {
		return (l1 * h1 / 2) + (l2 * h2 / 2) + (l3 * h3 / 2) + (l4 * h4 / 2) + (l5 * h5 / 2);
	}
	/**
	 * @return Perimetro de un Pentagono
	 */
	@Override
	public double perimetro() {
		return l1 + l2 + l3 + l4 + l5;
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
	/**
	 * @return the l4
	 */
	public int getL4() {
		return l4;
	}
	/**
	 * @param l4 the l4 to set
	 */
	public void setL4(int l4) {
		this.l4 = l4;
	}
	/**
	 * @return the l5
	 */
	public int getL5() {
		return l5;
	}
	/**
	 * @param l5 the l5 to set
	 */
	public void setL5(int l5) {
		this.l5 = l5;
	}
	/**
	 * @return the h1
	 */
	public int getH1() {
		return h1;
	}
	/**
	 * @param h1 the h1 to set
	 */
	public void setH1(int h1) {
		this.h1 = h1;
	}
	/**
	 * @return the h2
	 */
	public int getH2() {
		return h2;
	}
	/**
	 * @param h2 the h2 to set
	 */
	public void setH2(int h2) {
		this.h2 = h2;
	}
	/**
	 * @return the h3
	 */
	public int getH3() {
		return h3;
	}
	/**
	 * @param h3 the h3 to set
	 */
	public void setH3(int h3) {
		this.h3 = h3;
	}
	/**
	 * @return the h4
	 */
	public int getH4() {
		return h4;
	}
	/**
	 * @param h4 the h4 to set
	 */
	public void setH4(int h4) {
		this.h4 = h4;
	}
	/**
	 * @return the h5
	 */
	public int getH5() {
		return h5;
	}
	/**
	 * @param h5 the h5 to set
	 */
	public void setH5(int h5) {
		this.h5 = h5;
	}

	
}
