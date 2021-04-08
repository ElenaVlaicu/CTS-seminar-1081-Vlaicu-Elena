package Seminar7.ro.ase.cts.claseProxy;

public class OperatorCrediteProxy implements IOperatorCredite {

    private OperatorCredite operatorCredite;

    public OperatorCrediteProxy(OperatorCredite operatorCredite) {
        super();
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, float suma) {
        if(moneda == Moneda.RON){
            operatorCredite.creareCredit(moneda, suma);
        }
        else System.out.println("Banca ofera credite doar in RON");
    }
}
