package sistemadealquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Negocio {
	private ArrayList<Cliente> clientes;
	
	public Negocio() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	private void agregarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void alquilarProducto(Cliente c, Producto p) {
		if(p.sePuedeAlquilar(c)) {
			this.agregarCliente(c); 
			System.out.println("se alquilo!");
		}
	}
	
	private String clientesConProductosVencidos(){
		String lista = "";
		for(Cliente c : this.clientes) {
			if(c.seMeVencioAlgo())
				lista += "\n"+c.getNombre();
		}
		return lista;
	}

	public static void main(String[] args) {
		Negocio n = new Negocio();
		Cliente j = new Cliente("Joaquin");
		Cliente r = new Cliente("Romi");	
		Producto a = new Auto("ford", 21321, "Pat1", "", LocalDate.of(2020, 2, 1));
		Producto b = new Auto("sdfs", 21321, "32423", "", LocalDate.of(2020, 2, 1));
		
		Producto p = new Pelicula("Nombre", 2, LocalDate.of(2020, 6, 1));
		
		n.alquilarProducto(j, p);
		n.alquilarProducto(r, a);
		n.alquilarProducto(j, b);
		
		
		System.out.println(n.clientesConProductosVencidos());	
	}
}
