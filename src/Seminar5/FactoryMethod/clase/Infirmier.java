package Seminar5.FactoryMethod.clase;

public class Infirmier extends PersonalSpital {
    public Infirmier(String name) {
        super(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Infirmier{").append(super.getName());
        sb.append('}');
        return sb.toString();
    }
}
