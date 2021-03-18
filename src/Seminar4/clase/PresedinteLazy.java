package Seminar4.clase;

import java.awt.event.WindowStateListener;

public class PresedinteLazy {

    //singletone  - lazy initialization
    private String nume;
    private int varsta;
    private int mandat;

    private static PresedinteLazy instance = null;

    private PresedinteLazy(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    private PresedinteLazy() {
        this.nume = "LazyPutin";
        this.varsta = 68;
        this.mandat = 10;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }

    //la eager initialization nu am posibilitatea sa ii dau eu nume, varsta, mandat ?
    //punem synchronized
    public static synchronized PresedinteLazy getInstance(String nume, int varsta, int mandat) {
        if(instance==null) {
            instance = new PresedinteLazy(nume, varsta, mandat);
        }
        return instance;
    }

    public static void setInstance(PresedinteLazy instance) {
        PresedinteLazy.instance = instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PresedinteLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}
