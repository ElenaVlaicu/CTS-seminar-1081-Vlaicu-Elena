package Seminar9.acs.ase.ro.claseCommand;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    //relatie de has a - operatorul contine o comanda

    private List<Comanda> listaComenzi;

    //fac constructor ca sa ii aloc spatiu
    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    //adaugam la coada (LA FINAL)
    public void invoca(Comanda comanda){
        this.listaComenzi.add(comanda);
    }

    //executam PRIMA comanda
    public void executaComanda(){
        listaComenzi.get(0).executa();
        listaComenzi.remove(0);
    }

}
