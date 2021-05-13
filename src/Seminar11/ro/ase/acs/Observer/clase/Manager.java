package Seminar11.ro.ase.acs.Observer.clase;

public class Manager extends ManagerSalaDeSport{

    public void anuntaMeci(String tipSport){
        super.notificaObservator("Va avea loc un meci de "+ tipSport);

    };
}
