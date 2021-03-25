package Seminar5.main;

import Seminar5.Protoype.Reteta;

public class Program3Prototype {

    public static void main(String [] args) {
        Reteta reteta = new Reteta("Ibuprofen", 250);
        Reteta reteta1 = (Reteta) reteta.copiaza();
        System.out.println(reteta);
        System.out.println(reteta1);
    }
}
