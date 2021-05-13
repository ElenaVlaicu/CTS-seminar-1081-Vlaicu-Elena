package Seminar10.acs.ase.ro.ChainOfResp.clase;

public abstract class Notificator {

    private Notificator succesor;

    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    public Notificator getSuccesor() {
        return succesor;
    }

    public abstract void trimiteNotificare(Client client, String text);

}
