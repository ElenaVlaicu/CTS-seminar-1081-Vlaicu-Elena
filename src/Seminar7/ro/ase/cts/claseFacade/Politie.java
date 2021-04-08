package Seminar7.ro.ase.cts.claseFacade;

 class Politie {

    public static boolean esteUrmarit(Persoana persoana){ //e functie, daca nu era static era metoda??
        //daca ultima cifra din cnp e para atunci e urmarit
        return Integer.parseInt("" + persoana.getCNP().charAt(12)) % 2 == 0;
    }
}
