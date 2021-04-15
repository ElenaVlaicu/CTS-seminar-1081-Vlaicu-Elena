package Seminar8.ro.ase.cts.claseDecorator;

public abstract class DecoratorAbstract implements INota{

    private INota nota;

    public DecoratorAbstract(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza(){
        nota.printeaza();
    }

    public abstract void printeazaFelicitare();
}
