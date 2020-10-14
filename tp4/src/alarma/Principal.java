package alarma;

public class Principal {

	public static void main(String[] args) {
		
		//Alarma alarma = new Alarma();
		
		Alarma alarmaLum = new AlarmaLuminosa();
		
		alarmaLum.setPuertaAbierta(true);
		
		System.out.println(alarmaLum.hayRobo()); 
	}

}
