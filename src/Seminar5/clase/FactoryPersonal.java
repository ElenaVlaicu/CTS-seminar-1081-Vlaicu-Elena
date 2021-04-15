package Seminar5.clase;

public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal tip, String name){
        switch (tip) {
            case Asistent:
                return new Asistent(name);
            case Brancardier:
                return new Brancardier(name);
            case Medic:
                return new Medic(name);
            default:
                throw new IllegalArgumentException();
        }
    }
}
