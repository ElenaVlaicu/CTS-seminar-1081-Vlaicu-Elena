package Seminar10.acs.ase.ro.ChainOfResp.clase;

public class Client {

    private String nume;
    private String telefon;
    private String mail;

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getMail() {
        return mail;
    }

    public Client(String nume, String telefon, String mail) {
        this.nume = nume;
        this.telefon = telefon;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
