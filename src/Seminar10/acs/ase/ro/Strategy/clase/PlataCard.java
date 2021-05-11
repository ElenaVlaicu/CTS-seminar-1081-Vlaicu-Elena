package Seminar10.acs.ase.ro.Strategy.clase;

public class PlataCard implements IPlata{
    @Override
    public void plata(int suma) {
        System.out.println("Clientul a platit" +suma+"cu cardul");
    }
}
