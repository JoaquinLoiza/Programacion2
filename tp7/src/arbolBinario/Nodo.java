package arbolBinario;

public class Nodo extends NodoRaiz {

	private Nodo nodoPadre;

	public Nodo(int valor) {
		super(valor);
		this.nodoPadre = null;
	}

	public Nodo getNodoPadre() {
		return nodoPadre;
	}
	
}
