package Seminar5.FactoryMethod.clase;

public class FactoryBrancardier implements IFactory{
    @Override
    public PersonalSpital getPersonal(String name) {
        return new Brancardier(name);
    }
}
