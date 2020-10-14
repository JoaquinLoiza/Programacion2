package seleccionDeFutbol;

import java.util.ArrayList;

public class SeleccionDeFutbol {

	ArrayList<Persona> personas;

	public SeleccionDeFutbol() {
		this.personas = new ArrayList<Persona>();
	}

	public void agregarPersona(Persona p) {
		this.personas.add(p);
	}
	
	public Persona buscarPersona(int pasaporte) {
		for(Persona persona : this.personas) {
			if (persona.getnPasaporte() == pasaporte) {
				return persona;
			}
		}
		return null;
	}
	
	public boolean estadisponible(int pasaporte) {
		Persona integrante = buscarPersona(pasaporte);
		
		if(integrante != null) {
			return integrante.estaDisponible();
		}		
		return false; //Si la persona no existe o si no esta disponible, devuelve false - Correguir
	}
}
