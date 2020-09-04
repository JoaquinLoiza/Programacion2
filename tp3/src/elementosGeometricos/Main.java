package elementosGeometricos;

public class Main {

	public static void main(String[] args) {
		
		PuntoGeometrico puntoGeo = new PuntoGeometrico(8, 5);
		PuntoGeometrico puntoGeo2 = new PuntoGeometrico(5, 6);
		
		puntoGeo.setX(8);
		puntoGeo.setY(2);
		puntoGeo.desplazarPuntoGeometrico(2, -1);
		
		System.out.println("Valor en x: "+puntoGeo.getX());
		System.out.println("Valor en y: "+puntoGeo.getY());
		System.out.println("Distancia euclidea: "+puntoGeo.calcularDistanciaEuclidea(puntoGeo2));

	}

}
