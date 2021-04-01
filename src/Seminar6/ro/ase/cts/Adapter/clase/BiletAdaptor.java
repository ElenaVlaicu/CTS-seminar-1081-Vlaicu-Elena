package Seminar6.ro.ase.cts.Adapter.clase;

public class BiletAdaptor implements IBiletOnline{

   private Bilet bilet;

    public BiletAdaptor(Bilet bilet) {
        super();
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline(){
        this.bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline(){
        this.bilet.rezervare();
    }
}
