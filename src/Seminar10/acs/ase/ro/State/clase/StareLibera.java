package Seminar10.acs.ase.ro.State.clase;

public class StareLibera implements Stare{
    @Override
    public void modificaStare(Masa masa) {

        if(masa.getTipStare() instanceof StareLibera){
            System.out.println("Masa este deja libera");
        }
        else {
            masa.setTipStare(this);
            System.out.println("Masa cu nr "+masa.getNrMasa()+" a fost eliberata");
        }
    }
}
