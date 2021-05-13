package Seminar10.acs.ase.ro.ChainOfResp.clase;

public class NotificareMail extends Notificator{

    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getMail()!=null){
            System.out.println("S-a trimis mail lui "+client.getNume());
        }
        else{
            if(super.getSuccesor()!=null){
                //System.out.println("Nu s-a putut trimite mail");
                super.getSuccesor().trimiteNotificare(client, text);
            }
        }
    }
}
