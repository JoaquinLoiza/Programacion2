package contribuyentes;

public class Programador extends Contribuyente{
	
	private double montoFacturado;
	private final static double PORCENTAJE_MONTO = 20;
	private final static double PORCENTAJE_MONTO_FAC = 2;
	
	public Programador(String nombre, int cuit, double monto, double montoFacturado) {
		super(nombre, cuit, monto);
		this.montoFacturado = montoFacturado;
	}

	public double getMontoFacturado() {
		return montoFacturado;
	}

	public void setMontoFacturado(double montoFacturado) {
		this.montoFacturado = montoFacturado;
	}
	
	public double montoProgramador() {
		return (this.montoFacturado * PORCENTAJE_MONTO) / 100 ;
	}
	
	public double montoFacturado() {
		return (this.montoFacturado * PORCENTAJE_MONTO_FAC) / 100 ;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Cuit: " + getCuit() + ", Monto de programador: " + montoProgramador()+ ", Monto de facturacion: " + montoFacturado();
	}
}
