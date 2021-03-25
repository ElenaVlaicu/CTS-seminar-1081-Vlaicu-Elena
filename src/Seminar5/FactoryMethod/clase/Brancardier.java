package Seminar5.FactoryMethod.clase;

public class Brancardier  extends PersonalSpital {
    public Brancardier(String name) {
        super(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{ ").append(super.getName());
        sb.append('}');
        return sb.toString();
    }
}
