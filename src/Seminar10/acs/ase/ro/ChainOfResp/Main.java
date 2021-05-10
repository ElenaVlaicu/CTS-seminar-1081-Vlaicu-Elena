package Seminar10.acs.ase.ro.ChainOfResp;

import Seminar10.acs.ase.ro.ChainOfResp.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Maria", "65432", "sfgg");
        Client client1 = new Client("Viorica", null, "sfgg");
        Client client2 = new Client("Ionut", null, null);

        Notificator notificatorSms = new NotificatorSms();
        Notificator notificatorEmail = new NotificareMail();
        Notificator notificatorDirector = new NotificatorDirector();


        notificatorSms.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorDirector);

        notificatorSms.trimiteNotificare(client1, "mesaj");
        notificatorSms.trimiteNotificare(client, "mesaj");
        notificatorSms.trimiteNotificare(client2, "mesaj");

        notificatorEmail.trimiteNotificare(client1, "mesaaaaaj");

    }
}
