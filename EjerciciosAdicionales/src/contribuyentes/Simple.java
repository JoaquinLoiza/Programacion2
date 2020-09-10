package contribuyentes;

public class Simple extends Contribuyente{

	public Simple(String nombre, int cuit, double monto) {
		super(nombre, cuit, monto);
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Cuit: " + getCuit() + ", Monto: " + getMonto();
	}
	
}
