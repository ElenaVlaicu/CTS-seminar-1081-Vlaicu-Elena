package Seminar10.acs.ase.ro.ChainOfResp.clase;

public class NotificatorDirector extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String text) {
            System.out.println("Dl director, nu avem datele clientului "+client.getNume());
    }
}
