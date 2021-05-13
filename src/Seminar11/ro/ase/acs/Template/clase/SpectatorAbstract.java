package Seminar11.ro.ase.acs.Template.clase;

public abstract class SpectatorAbstract {

    public  abstract void asezareLaCoada();
    public  abstract  void prezentareBilet();
    public  abstract void realizareControlCorporal();
    public  abstract void ocupareLoc();

    //e finala!!
    public final void intrareInStadion(){
        asezareLaCoada();
        prezentareBilet();
        realizareControlCorporal();
        ocupareLoc();
    }

}
