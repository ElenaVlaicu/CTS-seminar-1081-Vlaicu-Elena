package Seminar9.acs.ase.ro.claseFlyweight;

public class Client implements Flyweight{

    //relatie IS A client-flyweight
    //relatie has a client-rezervare

    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        //unim atat info din client cat si cele din rezervare
        System.out.println(this.toString() + " "+ rezervare.toString());

    }
}
