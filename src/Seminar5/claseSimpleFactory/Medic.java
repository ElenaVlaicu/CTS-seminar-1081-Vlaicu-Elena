package Seminar5.claseSimpleFactory;

public class Medic extends PersonalSpital{

    public Medic(String name) {
        super(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{ ").append(super.getName());
        sb.append('}');
        return sb.toString();
    }
}
