package Problema2;

import java.io.IOException;

public class FabricaFiguras {

	public void crearPoligono() {
		int figura = 0, l = 0;
		while(figura != 6) {
			System.out.println("Ingrese la figura que quiera crear");
			System.out.println("1 para Triangulo");
			System.out.println("2 para Cuadrilatero");
			System.out.println("3 para Pentagono");
			System.out.println("4 para Hexagono");
			System.out.println("5 para Octagono");
			System.out.println("6 para salir");
			try {
				figura = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			switch(figura) {
			case 1:
				System.out.println("Ingrese el triangulo quiera crear");
				System.out.println("1 para Triangulo Equilatero");
				System.out.println("2 para Triangulo Isoceles");
				try {
					figura = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				switch(figura) {
				case 1:
					TrianguloEquilatero t = new TrianguloEquilatero();
					System.out.println("Ingrese el valor del lado");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					t.setL1(l);
					System.out.println("Ingrese el valor de la altura");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					t.setAltura(l);
					System.out.println("Area = " + t.area());
					System.out.println("Perimetro = " + t.perimetro());
					break;
				case 2:
					TrianguloIsoceles ti = new TrianguloIsoceles();
					System.out.println("Ingrese el valor de los lados iguales");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ti.setL1(l);
					System.out.println("Ingrese el valor del lado diferente");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ti.setL3(l);
					System.out.println("Ingrese el valor de la altura");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ti.setAltura(l);
					System.out.println("Area = " + ti.area());
					System.out.println("Perimetro = " + ti.perimetro());
				}
				break;
			case 2:
				System.out.println("Ingrese el cuadrilatero quiera crear");
				System.out.println("1 para Cuadrado");
				System.out.println("2 para Rectangulo");
				try {
					figura = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				switch (figura) {
				case 1:
					Cuadrado c = new Cuadrado();
					System.out.println("Ingrese el valor del lado");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					c.setAncho(l);
					System.out.println("Area = " + c.area());
					System.out.println("Perimetro = " + c.perimetro());
					break;
				case 2:
					Rectangulo r = new Rectangulo();
					System.out.println("Ingrese el valor del ancho");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					r.setAncho(l);
					System.out.println("Ingrese el valor de la altura");
					try {
						l = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					r.setAltura(l);
					System.out.println("Area = " + r.area());
					System.out.println("Perimetro = " + r.perimetro());
					break;
				}
				break;
			case 3:
				Pentagono p = new Pentagono();
				System.out.println("Ingrese el valor del lado 1");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setL1(l);
				System.out.println("Ingrese el valor del lado 2");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setL2(l);
				System.out.println("Ingrese el valor del lado 3");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setL3(l);
				System.out.println("Ingrese el valor del lado 4");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setL4(l);
				System.out.println("Ingrese el valor del lado 5");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setL5(l);
				System.out.println("Ingrese el valor de la altura 1");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setH1(l);
				System.out.println("Ingrese el valor de la altura 2");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setH2(l);
				System.out.println("Ingrese el valor de la altura 3");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setH3(l);
				System.out.println("Ingrese el valor de la altura 4");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setH4(l);
				System.out.println("Ingrese el valor de la altura 5");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.setH5(l);
				System.out.println("Area = " + p.area());
				System.out.println("Perimetro = " + p.perimetro());
				break;
			case 4:
				Hexagono h = new Hexagono();
				System.out.println("Ingrese el valor del lado 1");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setL1(l);
				System.out.println("Ingrese el valor del lado 2");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setL2(l);
				System.out.println("Ingrese el valor del lado 3");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setL3(l);
				System.out.println("Ingrese el valor del lado 4");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setL4(l);
				System.out.println("Ingrese el valor del lado 5");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setL5(l);
				System.out.println("Ingrese el valor del lado 6");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setL6(l);
				System.out.println("Ingrese el valor de la altura 1");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setH1(l);
				System.out.println("Ingrese el valor de la altura 2");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setH2(l);
				System.out.println("Ingrese el valor de la altura 3");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setH3(l);
				System.out.println("Ingrese el valor de la altura 4");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setH4(l);
				System.out.println("Ingrese el valor de la altura 5");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setH5(l);
				System.out.println("Ingrese el valor de la altura 6");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				h.setH6(l);
				System.out.println("Area = " + h.area());
				System.out.println("Perimetro = " + h.perimetro());
				break;
			case 5:
				Octagono o = new Octagono();
				System.out.println("Ingrese el valor del lado 1");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL1(l);
				System.out.println("Ingrese el valor del lado 2");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL2(l);
				System.out.println("Ingrese el valor del lado 3");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL3(l);
				System.out.println("Ingrese el valor del lado 4");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL4(l);
				System.out.println("Ingrese el valor del lado 5");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL5(l);
				System.out.println("Ingrese el valor del lado 6");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL6(l);
				System.out.println("Ingrese el valor del lado 7");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL7(l);
				System.out.println("Ingrese el valor del lado 8");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setL8(l);
				System.out.println("Ingrese el valor de la altura 1");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH1(l);
				System.out.println("Ingrese el valor de la altura 2");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH2(l);
				System.out.println("Ingrese el valor de la altura 3");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH3(l);
				System.out.println("Ingrese el valor de la altura 4");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH4(l);
				System.out.println("Ingrese el valor de la altura 5");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH5(l);
				System.out.println("Ingrese el valor de la altura 6");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH6(l);
				System.out.println("Ingrese el valor de la altura 7");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH7(l);
				System.out.println("Ingrese el valor de la altura 8");
				try {
					l = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.setH8(l);
				System.out.println("Area = " + o.area());
				System.out.println("Perimetro = " + o.perimetro());
				break;
			}
		}
	}
}
