package Seminar10.acs.ase.ro.State.clase;

public class StareRezervata implements Stare{
    @Override
    public void modificaStare(Masa masa) {

        if(masa.getTipStare() instanceof StareLibera){
            System.out.println("S-a rezervat masa");
            masa.setTipStare(this);
        }
        else{
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}
