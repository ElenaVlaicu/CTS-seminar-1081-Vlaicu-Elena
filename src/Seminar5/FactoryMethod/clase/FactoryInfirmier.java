package Seminar5.FactoryMethod.clase;

public class FactoryInfirmier implements IFactory{
    @Override
    public PersonalSpital getPersonal(String name) {
        return new Infirmier(name);
    }
}
