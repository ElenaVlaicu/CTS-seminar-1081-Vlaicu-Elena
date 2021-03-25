package Seminar5.FactoryMethod.clase;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital getPersonal(String name) {
        return new Asistent(name);
    }
}
