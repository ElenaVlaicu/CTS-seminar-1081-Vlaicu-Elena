package Seminar9.acs.ase.ro.claseCommand;

public class Masa {
    //ea e executantul, pt ca ea e ocupata sau nu

    private int nrMasa;
    private boolean esteOcupata;
    private boolean esteRezervata;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.esteOcupata = false;
        this.esteRezervata = false;
    }

    public void ocupaMasa(){
        if(!this.esteOcupata){
            System.out.println("Masa poate fi ocupata");
            this.esteOcupata =  true;
        }
        else {
            System.out.println("Masa nu poate fi ocupata");
        }
    }

    public void rezervaMasa(){
        if(!this.esteRezervata){
            System.out.println("Masa poate fi rezervata");
            this.esteRezervata =  true;
        }
        else {
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}
