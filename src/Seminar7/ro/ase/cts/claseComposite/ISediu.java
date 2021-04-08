package Seminar7.ro.ase.cts.claseComposite;

public interface ISediu {
    //o metoda de descriere
    public void afiseazaDescriere();
    public void adaugaNod(ISediu sediu) throws Exception;
    public void stergeNod(ISediu sediu) throws Exception;
    public ISediu getNod(int position) throws Exception;

}
