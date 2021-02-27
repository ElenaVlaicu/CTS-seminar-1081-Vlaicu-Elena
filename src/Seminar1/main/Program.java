package Seminar1.main;

import Seminar1.clase.Giraffe;
import Seminar1.clase.Zebra;
import Seminar1.clase.Zoo;

public class Program {

    public static void main(String [] args) {
        Zoo zoo = new Zoo();
        Giraffe g = new Giraffe("ff");
        Giraffe g1 = new Giraffe("fff");

        zoo.addAnimal(g);
        zoo.addAnimal(g1);

        Zebra z = new Zebra("z");
        Zebra z1 = new Zebra("z2");

        zoo.addAnimal(z);
        zoo.addAnimal(z1);

        zoo.feedAllAnimals();
    }
}
