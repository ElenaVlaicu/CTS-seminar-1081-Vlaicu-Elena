package Seminar2.ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;

	public Elev() {
		super();
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public float getSumaFinantata() {
		return sumaFinantata;
	}

	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	@Override
	public String toString() {
		return "Elev: "+ super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	
}
