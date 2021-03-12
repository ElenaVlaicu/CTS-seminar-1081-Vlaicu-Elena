package Seminar2.ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata = 10;

	public Angajat() {
		super();
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public float getSumaFinantata() {
		return sumaFinantata;
	}

	@Override
	public String toString() {
		return "Angajat: "+ super.toString() +"Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
}
