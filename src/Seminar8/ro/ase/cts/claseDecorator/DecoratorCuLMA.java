package Seminar8.ro.ase.cts.claseDecorator;

public class DecoratorCuLMA extends DecoratorAbstract {

    public DecoratorCuLMA(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: La multi ani!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani!");
    }
}
