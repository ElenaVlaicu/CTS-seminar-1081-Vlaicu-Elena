package Seminar2.ro.ase.cts.clase.readers;

import Seminar2.ro.ase.cts.clase.Angajat;
import Seminar2.ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends IReader{

    public AngajatiReader(String filePath) {
        super(filePath);
    }

    public  List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.filePath));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.citesteAplicant(input, angajat);
            int salariu = input.nextInt();
            String ocupatie = input.next();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        input.close();
        return angajati;
    }

}
