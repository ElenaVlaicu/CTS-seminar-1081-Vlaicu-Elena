package Seminar2.ro.ase.cts.clase.readers;
//daca metoda apartine unei clase, e apelata prin intermediul unui obiect, are this
//functia nu are pointerul this

import Seminar2.ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class IReader {

    protected String filePath;

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;

    public void citesteAplicant(Scanner input, Aplicant aplicant){
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nrProiecte = input.nextInt();
        String[] vectDenumiri = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            vectDenumiri[i] = input.next();
        aplicant.setNume(nume);
        aplicant.setNr_proiecte(nrProiecte);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setDenumiriProiecte(vectDenumiri);
    }
}
