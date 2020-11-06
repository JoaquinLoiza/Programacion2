package controlDeGastos;

public class Caracteristica {
	
	private String nombre;
	private Object valor;
	
	public Caracteristica(String nombre, Object valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public Object getValor() {
		return valor;
	}
	
}
