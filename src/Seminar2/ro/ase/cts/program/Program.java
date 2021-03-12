package Seminar2.ro.ase.cts.program;

import Seminar2.ro.ase.cts.clase.Angajat;
import Seminar2.ro.ase.cts.clase.Aplicant;
import Seminar2.ro.ase.cts.clase.Proiect;
import Seminar2.ro.ase.cts.clase.readers.AngajatiReader;
import Seminar2.ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(IReader readAplicant) throws FileNotFoundException {
		return  readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		System.out.println("Suma finantata pentru angajat este ");
		System.out.println("Suma finantata pentru elev este ");
		System.out.println("Suma finantata pentru student este ");
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect = new Proiect(81) ;
			for(Aplicant aplicant:listaAplicanti){
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
