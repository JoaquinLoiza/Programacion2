package contribuyentes;

public class Comerciante extends Contribuyente{
	
	private double montoFacturado;
	private final static double PORCENTAJE_MONTO = 50;
	private final static double PORCENTAJE_MONTO_FAC = 3.5;
	
	public Comerciante(String nombre, int cuit, double monto, double montoFacturado) {
		super(nombre, cuit, monto);
		this.montoFacturado = montoFacturado; 
	}

	public double getMontoFacturado() {
		return montoFacturado;
	}

	public void setMontoFacturado(double montoFacturado) {
		this.montoFacturado = montoFacturado;
	}
	
	public double montoComerciante() {
		return (this.getMonto() * PORCENTAJE_MONTO) / 100 ;
	}
	
	public double montoFacturado() {
		return (this.montoFacturado * PORCENTAJE_MONTO_FAC) / 100 ;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Cuit: " + getCuit() + ", Monto de comerciante: " + montoComerciante() + ", Monto de facturacion: " + montoFacturado();
	}
	
}
