package Seminar6.ro.ase.cts.Adapter.clase;

public class Bilet {
    private float pret;

    public Bilet(float pret) {
        this.pret = pret;
    }

    public void vanzare(){
        System.out.println("S-a vanzut biletul: "+ this.pret);
    }

    public void rezervare(){
        System.out.println("S-a rezervat biletul: "+ this.pret);
    }


}
