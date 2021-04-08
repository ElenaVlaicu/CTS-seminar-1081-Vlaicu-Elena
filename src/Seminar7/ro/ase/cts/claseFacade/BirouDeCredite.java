package Seminar7.ro.ase.cts.claseFacade;

 class BirouDeCredite {

    public static boolean areCredite(Persoana persoana){ //e functie, daca nu era static era metoda??
        //daca penultima cifra din cnp e para atunci e urmarit
        return Integer.parseInt("" + persoana.getCNP().charAt(11)) % 2 == 0;
    }
}
