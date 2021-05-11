package Seminar10.acs.ase.ro.State.clase;

public class StareOcupata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getTipStare() instanceof StareOcupata && masa.getTipStare() instanceof StareRezervata){
            System.out.println("Masa nu poate fi ocupata");
        }
        else{
            if(masa.getTipStare() instanceof StareLibera){
                System.out.println("Masa a fost ocupata");
                masa.setTipStare(this);
            }
        }
    }
}
