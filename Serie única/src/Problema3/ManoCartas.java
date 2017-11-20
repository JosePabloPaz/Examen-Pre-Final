package Problema3;

public class ManoCartas {
	LinkedPositionalList<Cartas> l = new LinkedPositionalList<Cartas>();
	/**
	 * @param Valor del numero de la carta, tipo de carta
	 */
	public void agregarCarta(int valor, String categoria) {
		Cartas c = new Cartas();
		c.setValorCarta(valor);
		c.setTipoCarta(categoria);
		if(l.isEmpty()) {
			l.addFirst(c);
		}else {
			LinkedPositionalList<Cartas> Lprueba = new LinkedPositionalList<Cartas>();
			Lprueba = l;
			while(Lprueba.isEmpty() != true) {
				Cartas a = new Cartas();
				a = (Cartas) Lprueba.first();
				if(a.getValorCarta() == valor) {
					if(a.getTipoCarta() == categoria) {
						System.out.println("Error, carta ya fue agragada");
					}else {
						l.addFirst(c);
					}
				}else {
					l.addFirst(c);
				}
				Position<Cartas> p = l.first();
				Lprueba.remove(p);
			}
		}
	}
	/**
	 * @param Tipo de carta
	 */
	public void jugar(String categoria) {
		boolean cartaJugada = false;
		LinkedPositionalList<Cartas> L = new LinkedPositionalList<Cartas>();
		L = l;
		while(L.isEmpty() != true) {
			Cartas a = new Cartas();
			a = (Cartas) L.first();
			if(a.getTipoCarta() == categoria) {
				Position<Cartas> p = L.first();
				L.remove(p);
				cartaJugada = true;
				break;
			} 
		}
		if(cartaJugada == false) {
			Position<Cartas> p = L.last();
			L.remove(p);
			cartaJugada = true;
		}
	}
}
