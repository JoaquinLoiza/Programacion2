package sistemadealquiler;

import java.time.LocalDate;

public class Auto extends Producto {
	private String marca;
	private int kms;
	private String patente;
	private String motor; 
	
	public Auto(String marca, int kms, String patente, String motor, LocalDate fechalimite) {
		super(fechalimite);
		this.marca = marca;
		this.kms = kms;
		this.motor = motor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKms() {
		return kms;
	}
	
	public void setKms(int kms) {
		this.kms = kms;
	}

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	@Override
	public boolean sePuedeAlquilar(Cliente c) {
		if(!c.getAlquiloAuto()) {
			c.setAlquiloAuto(this);
			return true;
		}
		return false;
	}
	
//
//	@Override
//	public boolean equals(Object obj) {
//		try {
//			Auto a = (Auto) obj;
//			//if(this.marca == a.marca && this.patente == a.patente) {
//			if(this.marca.equals(a.marca) && this.patente == a.patente) {
//			
//				return true;
//			}
//			else {
//				return false;
//			}
//		} catch (Exception e){
//			return false;
//		}
//	}
	
	

}
