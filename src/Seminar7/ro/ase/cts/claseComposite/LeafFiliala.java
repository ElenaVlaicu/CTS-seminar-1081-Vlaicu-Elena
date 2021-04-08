package Seminar7.ro.ase.cts.claseComposite;

public class LeafFiliala implements ISediu{
    //nodul frunza este filiala
    private String numeFiliala;

    public LeafFiliala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Filiala "+ numeFiliala);
    }

    @Override
    public void adaugaNod(ISediu sediu) throws Exception {
        //aruncam exceptii ca nu e implementata
        throw new Exception("Nu este implementata functia");
    }

    @Override
    public void stergeNod(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementata functia");
    }

    @Override
    public ISediu getNod(int position)throws Exception  {
        throw new Exception("Nu este implementata functia");
    }
}
