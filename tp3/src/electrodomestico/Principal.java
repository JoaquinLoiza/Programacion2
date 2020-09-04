package electrodomestico;

public class Principal {

	public static void main(String[] args) {
		
		Electrodomestico electrodomestico = new Electrodomestico("Joaquin");
		
		electrodomestico.setConsumo(46);
		
		System.out.println(electrodomestico.esBajoConsumo());

	}

}
