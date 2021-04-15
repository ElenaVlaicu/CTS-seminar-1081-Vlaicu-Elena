package Seminar5.clase;

public class Asistent extends PersonalSpital{

    public Asistent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{ ").append(super.getName());
        sb.append('}');
        return sb.toString();
    }
}
