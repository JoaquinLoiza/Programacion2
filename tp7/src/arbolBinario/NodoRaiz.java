package arbolBinario;

public class NodoRaiz implements Comparable<NodoRaiz> {
	private int valor;
	private Nodo hijoIzq;
	private Nodo hijoDer;
	
	public NodoRaiz(int valor) {
		this.valor = valor;
		this.hijoIzq = null;
		this.hijoDer = null;
	}

	public int getValor() {
		return valor;
	}

	public Nodo getHijoIzq() {
		return hijoIzq;
	}

	public Nodo getHijoDer() {
		return hijoDer;
	}
	
	public void addHijoIzq(Nodo hijoNuevo) {
		if(this.compareTo(hijoNuevo) == -1) {
			this.hijoIzq = hijoNuevo;
		}
	}
	
	public void addHijoDer(Nodo hijoNuevo) {
		if(this.compareTo(hijoNuevo) == -1) {
			this.hijoDer = hijoNuevo;
		}
	}

	@Override
	public int compareTo(NodoRaiz o) {
		if (o.getValor() < this.getValor())
			return -1;
		else if (o.getValor() > this.getValor())
			return 1;
		else
			return 0;
	}
	
}
