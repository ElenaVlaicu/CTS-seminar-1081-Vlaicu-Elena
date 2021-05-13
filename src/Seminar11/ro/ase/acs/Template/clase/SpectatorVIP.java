package Seminar11.ro.ase.acs.Template.clase;

public class SpectatorVIP extends SpectatorAbstract{

    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println(nume);
        System.out.println("E vip, nu sta la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(nume);
        System.out.println("A prezentat biletul");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(nume);
        System.out.println("A fost controlat");
    }

    @Override
    public void ocupareLoc() {
        System.out.println(nume);
        System.out.println("A ocupat locul");
    }
}
