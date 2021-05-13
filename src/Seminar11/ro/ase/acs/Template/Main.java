package Seminar11.ro.ase.acs.Template;

import Seminar11.ro.ase.acs.Template.clase.Spectator;
import Seminar11.ro.ase.acs.Template.clase.SpectatorAbstract;
import Seminar11.ro.ase.acs.Template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {

        SpectatorAbstract spectator = new Spectator("Ion");
        SpectatorAbstract spectatorVip = new SpectatorVIP("Michel");

        spectator.intrareInStadion();
        spectatorVip.intrareInStadion();

    }
}
