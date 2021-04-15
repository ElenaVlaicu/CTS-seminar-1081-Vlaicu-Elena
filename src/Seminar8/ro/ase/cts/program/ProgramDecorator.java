package Seminar8.ro.ase.cts.program;

import Seminar8.ro.ase.cts.claseDecorator.DecoratorAbstract;
import Seminar8.ro.ase.cts.claseDecorator.DecoratorCuLMA;
import Seminar8.ro.ase.cts.claseDecorator.DecoratorCuPasteFericit;
import Seminar8.ro.ase.cts.claseDecorator.NotaDePlata;

public class ProgramDecorator {

    public static void main(String[] args) {

        NotaDePlata notaInitiala = new NotaDePlata(100);
        notaInitiala.printeaza();

        DecoratorAbstract decoratorLMA = new DecoratorCuLMA(notaInitiala);
        decoratorLMA.printeazaFelicitare();
        System.out.println();
        decoratorLMA.printeaza();

        DecoratorCuPasteFericit decoratorCuPasteFericit = new DecoratorCuPasteFericit(notaInitiala);
        //nu o sa mai decoreze cu lma, o sa decoreze cu paste feircit?
        decoratorCuPasteFericit.printeaza();

        NotaDePlata nota2 = new NotaDePlata(55);
        DecoratorAbstract decoratorLMA2 = new DecoratorCuLMA(nota2);
        DecoratorAbstract decoratorPaste2 = new DecoratorCuPasteFericit(decoratorLMA2);//are in el si paste fericit si lma si nota

        decoratorPaste2.printeaza();

    }
}
