package Seminar7.ro.ase.cts.claseComposite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAgentie implements ISediu {

    private List<ISediu> listaSedii;
    //putem avea aici mai multe chestii ex:numele agentiei...

    public CompositeAgentie() {
        super();
        this.listaSedii = new ArrayList<ISediu>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o agentie");
        for(ISediu sediu: listaSedii){
            sediu.afiseazaDescriere();
        }
    }

    @Override
    public void adaugaNod(ISediu sediu) {
        listaSedii.add(sediu);
    }

    @Override
    public void stergeNod(ISediu sediu) {
        listaSedii.remove(sediu);
    }

    @Override
    public ISediu getNod(int position) {
        return listaSedii.get(position);
    }
}
