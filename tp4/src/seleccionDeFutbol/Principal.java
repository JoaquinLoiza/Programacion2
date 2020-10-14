package seleccionDeFutbol;


import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Persona futbolista = new Futbolista("Juan", "Lopez", 132132, LocalDate.of(1990, 06, 02), true, false, false, "Delantero", true, 60);
		SeleccionDeFutbol argentina = new SeleccionDeFutbol();
		
		argentina.agregarPersona(futbolista);

		System.out.println(futbolista.conocerEstado());
	}

}
