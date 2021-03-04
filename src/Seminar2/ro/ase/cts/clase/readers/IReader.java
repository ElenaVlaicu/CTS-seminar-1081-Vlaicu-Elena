package Seminar2.ro.ase.cts.clase.readers;
import Seminar2.ro.ase.cts.clase.*;
//daca metoda apartine unei clase, e apelata prin intermediul unui obiect, are this
//functia nu are pointerul this

import Seminar2.ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class IReader {

    protected String filePath;

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
}
