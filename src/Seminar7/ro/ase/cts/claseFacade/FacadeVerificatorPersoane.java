package Seminar7.ro.ase.cts.claseFacade;

public class FacadeVerificatorPersoane {
    //facade face ce zicea in enunt ca tre sa faca operatorul, toate verificarile astea, doar ca, pt a ascunde complexitatea
    //el face doar functia asta:

    public static boolean esteEligibil(Persoana persoana){
        //verificare varsta persoana de catre operator
        if(persoana.getVarsta()>=18){
            if(!Politie.esteUrmarit(persoana)){
                if(!BirouDeCredite.areCredite(persoana)){
                    return true;
                }
            }
        }
        return false;
    }
}
