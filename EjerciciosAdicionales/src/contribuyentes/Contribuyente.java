package contribuyentes;

public class Contribuyente {
	private String nombre;
	private int cuit;
	private double monto; 
	
	public Contribuyente(String nombre, int cuit, double monto) {
		this.nombre = nombre;
		this.cuit = cuit; 
		this.monto = monto; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
}
