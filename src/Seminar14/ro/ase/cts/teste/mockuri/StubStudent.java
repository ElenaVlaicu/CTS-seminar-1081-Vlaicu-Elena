package Seminar14.ro.ase.cts.teste.mockuri;

import Seminar13.ro.ase.cts.clase.IStudent;

import java.util.List;

public class StubStudent implements IStudent {

    //am toate valorile hardcodate

    @Override
    public String getNume() {
        return "Gigel";
    }

    @Override
    public void setNume(String nume) {
    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 450.6f;
    }

    @Override
    public int getNota(int index) {
        return 9;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
