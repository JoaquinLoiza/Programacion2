package elementosGeometricos;

public class Rectangulo {
	
	private PuntoGeometrico puntoA;
	private PuntoGeometrico puntoB;
	private PuntoGeometrico puntoC ;
	private PuntoGeometrico puntoD;

	//Constructor
	
	public Rectangulo(PuntoGeometrico puntoA, PuntoGeometrico puntoB, PuntoGeometrico puntoC, PuntoGeometrico puntoD) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.puntoC = puntoC;
		this.puntoD = puntoD;
	}
	
	//Getters and setters

	public PuntoGeometrico getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(PuntoGeometrico puntoA) {
		this.puntoA = puntoA;
	}

	public PuntoGeometrico getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(PuntoGeometrico puntoB) {
		this.puntoB = puntoB;
	}

	public PuntoGeometrico getPuntoC() {
		return puntoC;
	}

	public void setPuntoC(PuntoGeometrico puntoC) {
		this.puntoC = puntoC;
	}

	public PuntoGeometrico getPuntoD() {
		return puntoD;
	}

	public void setPuntoD(PuntoGeometrico puntoD) {
		this.puntoD = puntoD;
	}
	
	//Metodos
	
	public boolean esRectangulo() {
		
		return ( 
				puntoA.getX() == puntoC.getX() && 
				puntoA.getY() == puntoB.getY() && 
				puntoB.getX() == puntoD.getX() && 
				puntoC.getY() == puntoD.getY() 
				);
	}
	
	public void trasladarRectangulo(int x, int y) {
		puntoA.desplazarPuntoGeometrico(x, y);
		puntoB.desplazarPuntoGeometrico(x, y);
		puntoC.desplazarPuntoGeometrico(x, y);
		puntoD.desplazarPuntoGeometrico(x, y); 
	}
	
	public double calcularArea() {
		double ladoac = puntoA.calcularDistanciaEuclidea(puntoC); 
		double ladocd = puntoC.calcularDistanciaEuclidea(puntoD); 
		return ladoac * ladocd; 
	}
	

	public int esMayor(Rectangulo rectanguloA, Rectangulo rectanguloB) {
		double areaA = rectanguloA.calcularArea(); 
		double areaB = rectanguloB.calcularArea(); 
		
		if (areaA > areaB)
			return 1; 
		else if (areaA == areaB)
			return 0;
		else
			return -1;
	}
	
	public boolean esCuadrado() {
		double ladoac = puntoA.calcularDistanciaEuclidea(puntoC); 
		double ladocd = puntoC.calcularDistanciaEuclidea(puntoD); 
		return ladoac == ladocd; 
	}
	
	public boolean estaAcostado() {
		double ladoac = puntoA.calcularDistanciaEuclidea(puntoC); 
		double ladocd = puntoC.calcularDistanciaEuclidea(puntoD);
		return (ladoac<ladocd);
	}
	
	public double DistanciaLadoSuperior() {
		PuntoGeometrico puntoA = buscarPuntoA_Sup();
		
		
		return 0;
	}
	
	public PuntoGeometrico buscarPuntoA_Sup() {
		
		int YenA = puntoA.getY();
		int YenB = puntoB.getY();
		int YenC = puntoC.getY();
		int YenD = puntoD.getY();
		
		if ( (YenA >= YenB) && (YenA >= YenC) )		
			return puntoA;
		else if ( (YenC >= YenD) && (YenC >= YenA) )
			//return puntoC;	
	}
	
}
