package Seminar14.ro.ase.cts.teste.mockuri;

import Seminar13.ro.ase.cts.clase.IStudent;

import java.util.List;

public class MockStudent implements IStudent {

    @Override
    public String getNume() {
        return null;
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
        return 0;
    }

    @Override
    public int getNota(int index) {
        return 0;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
