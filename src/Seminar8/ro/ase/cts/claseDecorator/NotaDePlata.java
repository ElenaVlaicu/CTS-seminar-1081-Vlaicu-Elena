package Seminar8.ro.ase.cts.claseDecorator;

public class NotaDePlata implements INota{

    private int sumaDePlata;

    public NotaDePlata(int sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }


    @Override
    public void printeaza() {
        System.out.println("S-a printat nota de plata cu suma "+ sumaDePlata);
    }
}
