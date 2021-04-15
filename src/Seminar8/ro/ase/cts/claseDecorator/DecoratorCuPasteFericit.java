package Seminar8.ro.ase.cts.claseDecorator;

public class DecoratorCuPasteFericit extends DecoratorAbstract{
    public DecoratorCuPasteFericit(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: Paste fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste fericit!");
    }
}
