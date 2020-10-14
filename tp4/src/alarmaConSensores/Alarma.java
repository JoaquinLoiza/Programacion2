package alarmaConSensores;

import java.util.ArrayList;

//Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma
//se cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de la casa. 
//Cada sensor posee el nombre de la zona que controla. 
//Permitir que se incorporen nuevos sensores. 
//Modificar la alarma para que además de hacer sonar el timbre, imprima por pantalla el nombre de la zona en conflicto (pueden ser más de una).

public class Alarma {
	private ArrayList<Sensor> sensores;
	protected Timbre timbre;
	
	public Alarma() {
		this.sensores = new ArrayList<Sensor>();
		this.timbre = new Timbre();
	}
	
	//Metodos
	
	public void agregarSensor(Sensor sensor) {
		this.sensores.add(sensor);
	}
	
	public boolean comprobar() {
		for (Sensor sensor : this.sensores) {
			if(sensor.getEstado() == true)
				return true;
		}
		return false;
	}
	
	public boolean hayRobo() {
		if(this.comprobar()) {
			this.dispararAlarma();
			return true;
		}else
			return false;
	}
	
	public void dispararAlarma() {
		this.timbre.hacerSonar();
	}

	@Override
	public String toString() {
		return "Hay robo: " + hayRobo() +"|  ";
	}
}
