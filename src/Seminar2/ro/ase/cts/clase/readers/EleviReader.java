package Seminar2.ro.ase.cts.clase.readers;

import Seminar2.ro.ase.cts.clase.Angajat;
import Seminar2.ro.ase.cts.clase.Aplicant;
import Seminar2.ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends IReader {

    public EleviReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.filePath));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.citesteAplicant(input, elev);
            int clasa = input.nextInt();
            String tutore = input.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        input.close();
        return elevi;
    }

}
