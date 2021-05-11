package Seminar10.acs.ase.ro.Strategy.clase;

public class Client {

    private IPlata tipPlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        //ii setam default un tip de plata
        this.tipPlata = new PlataCash();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void executaPlata(int suma){
        System.out.println(nume+" : ");
        this.tipPlata.plata(suma); //aici la compilare nu stim cum va fi plata, cash sau card
        //vom sti la run time
    }


}
