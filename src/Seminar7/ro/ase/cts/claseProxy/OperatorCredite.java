package Seminar7.ro.ase.cts.claseProxy;

public class OperatorCredite implements IOperatorCredite{
    @Override
    public void creareCredit(Moneda moneda, float suma) {
        System.out.println("Creditul a fost oferit cu suma de "+ suma + " si moneda " + moneda);
    }
}
