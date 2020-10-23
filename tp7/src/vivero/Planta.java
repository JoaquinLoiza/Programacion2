package vivero;

import java.util.HashSet;

public class Planta {
	private String nombreCientifico;
	private String clasifSup;
	private String familia;
	private String clase;
	private boolean interior;
	private int requerSol;
	private int requerAgua;
	private HashSet<String> nomVulgares;
	
	//Constructor
	
	public Planta(String nombreCientifico, String clasifSup, String familia, String clase, boolean interior, int requerSol, int requerAgua) {
		this.nombreCientifico = nombreCientifico;
		this.clasifSup = clasifSup;
		this.familia = familia;
		this.clase = clase;
		this.interior = interior;
		this.requerSol = requerSol;
		this.requerAgua = requerAgua;
		this.nomVulgares = new HashSet<>();
	}
	
	//Getters

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public String getClasifSup() {
		return clasifSup;
	}

	public String getFamilia() {
		return familia;
	}

	public String getClase() {
		return clase;
	}

	public boolean isInterior() {
		return this.interior;
	}

	public int getRequerSol() {
		return requerSol;
	}

	public int getRequerAgua() {
		return requerAgua;
	}
	
	public HashSet<String> getNomVulgares(){
		HashSet<String> aux = new HashSet<>();
		aux.addAll(this.nomVulgares);
		return aux;
	}

	public void addNombre(String nom) {
		this.nomVulgares.add(nom);
	}

	@Override
	public String toString() {
		return "\n\nNombre cientifico: " + this.nombreCientifico +
				"\nClasificacion Superior: " + this.clasifSup +
				"\nFamilia: " + this.familia +
				"\nClase: " + this.clase +
				"\nDe Interior: " + this.interior +
				"\nRequerimiento De Sol: " + this.requerSol +
				"\nRequerimiento De Agua: " + this.requerAgua;
	}
}


