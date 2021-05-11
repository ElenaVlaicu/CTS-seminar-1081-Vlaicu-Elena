package Seminar10.acs.ase.ro.Strategy.clase;

public class PlataCash implements IPlata{
    @Override
    public void plata(int suma) {
        System.out.println("Clientul a platit" + suma+"cash");
    }
}
