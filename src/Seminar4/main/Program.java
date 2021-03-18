package Seminar4.main;

import Seminar1.clase.Giraffe;
import Seminar1.clase.Zebra;
import Seminar1.clase.Zoo;
import Seminar4.clase.Presedinte;
import Seminar4.clase.PresedinteLazy;
import Seminar4.clase.Televizor;

public class Program {

    public static void main(String [] args) {

        /*-----------SINGLETONE-------------*/

        /*---------------EAGER INITIALIZATION-------------------*/
        Presedinte presedinte = Presedinte.getInstance();
        Presedinte presedinte1 = Presedinte.genInstance();

        System.out.println(presedinte.toString());
        System.out.println(presedinte1.toString());

        //Testam singletone: aratam ca oricate instante incerc eu sa creez, de fapt e doar una
        presedinte.setNume("Basescu");
        presedinte1.setMandat(3);

        System.out.println(presedinte.toString());
        System.out.println(presedinte1.toString()); //apare acelasi lucru - basescu 3 - deci ne dam seama ca e o singura instanta

        /*---------------LAZY INITIALIZATION-------------------*/
        //cea mai folosit tip de singletone
        //problema cu ea e ca daca sunt mai multe threaduri, daca acceseaza aceeasi resursa aloca mai multa zona de memorie pt ca alocam constructoru de 2 ori
        //apelam constructoru de mai multe ori => incalcam principiul singletone care zice ca trebuie apelat o data
        // ca sa rezolvam punem la getInstance sycnronized ca sa blocheze functia pt celelalte threaduri decat cel care apeleaza acum constructoru

        System.out.println("...........LAZY.........");

        PresedinteLazy presedinteLazy = PresedinteLazy.getInstance("lazy", 40, 40);
        PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("lazy1", 39, 3);

        System.out.println(presedinteLazy.toString());
        System.out.println(presedinteLazy1.toString());

        System.out.println("...........TELEVIZOR.........");

        Televizor televizor = Televizor.getInstance("Philips", 200, 5000);
        Televizor televizor1 = Televizor.getInstance("Samsung", 100, 1542.45f);

        System.out.println(televizor.toString());
        System.out.println(televizor1.toString());

        televizor.setMarca("Daewoo");
        televizor1.setNrCanale(20);

        System.out.println(televizor.toString());
        System.out.println(televizor1.toString());


    }
}
