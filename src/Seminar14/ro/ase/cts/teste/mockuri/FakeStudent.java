package Seminar14.ro.ase.cts.teste.mockuri;

import Seminar13.ro.ase.cts.clase.IStudent;

import java.util.ArrayList;
import java.util.List;

public class FakeStudent implements IStudent {

    //fake il pot folosi pt f multe teste
    //nu mai stau sa dau note, ii dau direct media
    //si pot sa ii si setez eu din test o vlaoare care ma intereseaza

    //dezavantaj: ocupa memorie, tre sa fac multe chestii
    //se fol in mult mai multe situatii decat stub

    private float medie;
    private String nume;
    private List<Integer> listaNote;
    private int nota;
    private boolean areRestante;

    public FakeStudent() {
        this.listaNote = new ArrayList<>();
    }

    //OBLIGATORIU trebuie sa avem setteri

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public void setListaNote(List<Integer> listaNote) {
        this.listaNote = listaNote;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAreRestante(boolean areRestante) {
        this.areRestante = areRestante;
    }


    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public List<Integer> getNote() {
        return this.listaNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return this.medie;
    }

    @Override
    public int getNota(int index) {
        return this.nota;
    }

    @Override
    public boolean areRestante() {
        return this.areRestante;
    }
}
