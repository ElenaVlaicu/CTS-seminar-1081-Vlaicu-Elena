package Seminar6.ro.ase.cts.clase;

public class RezervareBuilder implements AbstractBuilder{

    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(0, false, false, false, false, "notFound");
    }

    public RezervareBuilder(int codRezervare) {
        this.rezervare = new Rezervare(codRezervare, false, false, false, false, "notFound");
    }

    public RezervareBuilder setCodRezervare(int codRezervare){
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public RezervareBuilder setAreMancare(boolean areMancare){
        this.rezervare.setAreMancare(areMancare);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }

    public RezervareBuilder setAreBautura (boolean areBautura){
        this.rezervare.setAreBautura(areBautura);
        return this;
    }

    public RezervareBuilder setAreScaunErgonimic(boolean areScaunErgonimic){
        this.rezervare.setAreScaunErgonomic(areScaunErgonimic);
        return this;
    }

    public RezervareBuilder setGen(String gen){
        this.rezervare.setGenMuzica(gen);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
