package Seminar7.ro.ase.cts.program;

import Seminar7.ro.ase.cts.claseFacade.FacadeVerificatorPersoane;
import Seminar7.ro.ase.cts.claseFacade.Persoana;

public class ProgramFacade {

    public static void main(String[] args) {
        Persoana persoana = new Persoana("Maria", "1234567891123");
        if(FacadeVerificatorPersoane.esteEligibil(persoana)){
            System.out.println("Persoana este elibila pt credit");
        }
        else System.out.println("Persoana nu este elibila pt credit");
    }
}
