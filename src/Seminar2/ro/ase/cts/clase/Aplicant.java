package Seminar2.ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumiriProiecte;


	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}


	public void afisareRaspunsProiect(Proiect proiect) {
		boolean esteAcceptat = punctaj > proiect.getPragAcceptare();
		StringBuilder stringBuilder = new StringBuilder("Aplicantul ").append(nume);
		stringBuilder.append(esteAcceptat? " a fost acceptat": " a fost respins");
		System.out.println(stringBuilder.toString());
	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Aplicant{");
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(nr_proiecte);
		sb.append(", denumiriProiecte=").append(Arrays.toString(denumiriProiecte));
		sb.append('}');
		return sb.toString();
	}
}
