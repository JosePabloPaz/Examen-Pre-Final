package Problema1;
/**
 * 
 * @author Jose Pablo Paz
 *
 */
public class CifradoCesar {
	 
	/**
	 * cifradoCesar
	 * @param Frase que se desea cifrar y distancia que se correran las letras
	 * @return String con la frase cifrada
	 */
	    public String cifrarCesar(String texto, int distancia) {
	        StringBuilder cifrado = new StringBuilder();
	        distancia = distancia % 26;
	        for (int i = 0; i < texto.length(); i++) {
	            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
	                if ((texto.charAt(i) + distancia) > 'z') {
	                    cifrado.append((char) (texto.charAt(i) + distancia - 26));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) + distancia));
	                }
	            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
	                if ((texto.charAt(i) + distancia) > 'Z') {
	                    cifrado.append((char) (texto.charAt(i) + distancia - 26));
	                } else {
	                    cifrado.append((char) (texto.charAt(i) + distancia));
	                }
	            }
	        }
	        return cifrado.toString();
	    }
	    
	    /**
		 * cifrarCesar
		 * @param Frase que se desea cifrar, alfabeto que se desea usar, distancia que se correran las letras
		 * @return String con la frase cifrada
		 */
	    public String cifrarCesar(String frase, String alfabeto, int distancia) {
	    	StringBuilder cifrado = new StringBuilder();
	        distancia = distancia % alfabeto.length();
	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) >= alfabeto.charAt(0) && frase.charAt(i) <= alfabeto.charAt(alfabeto.length()-1)) {
	                if ((frase.charAt(i) + distancia) > 'z') {
	                    cifrado.append((char) (frase.charAt(i) + distancia - alfabeto.length()));
	                } else {
	                    cifrado.append((char) (frase.charAt(i) + distancia));
	                }
	            } else if (frase.charAt(i) >= alfabeto.charAt(0) && frase.charAt(i) <= alfabeto.charAt(alfabeto.length()-1)) {
	                if ((frase.charAt(i) + distancia) > 'Z') {
	                    cifrado.append((char) (frase.charAt(i) + distancia - alfabeto.length()));
	                } else {
	                    cifrado.append((char) (frase.charAt(i) + distancia));
	                }
	            }
	        }
	        return cifrado.toString();
	    }
}
