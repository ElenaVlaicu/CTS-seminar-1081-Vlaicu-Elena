package Seminar10.acs.ase.ro.ChainOfResp.clase;

public class NotificatorSms extends Notificator{


    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getTelefon()!=null){
            System.out.println("S-a trimis mesajul "+ text+" catre "+client.getNume());
        }
        else if(super.getSuccesor()!=null){
                super.getSuccesor().trimiteNotificare(client, text);
            }
    }
}
