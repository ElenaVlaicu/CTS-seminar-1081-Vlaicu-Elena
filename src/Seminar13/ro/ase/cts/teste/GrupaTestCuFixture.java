package Seminar13.ro.ase.cts.teste;

import Seminar13.ro.ase.cts.clase.Grupa;
import Seminar13.ro.ase.cts.clase.IStudent;
import Seminar13.ro.ase.cts.clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupaTestCuFixture {

    private Grupa grupa;

    // p - performance (right bicep pt metoda get promovavilitate)

    //metoda din before (denumita cum vrem noi) va fi apelata inainte de fiecare test
    //e un fixture
    @Before
    public void setup(){

        grupa = new Grupa(1080);

        for(int i=0; i<10; i++){
            IStudent student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        for(int i=0; i<5; i++){
            IStudent student = new Student();
            student.adaugaNota(7);
            student.adaugaNota(4);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    public void testGetPromovabilitatePerformanta(){
        grupa.getPromovabilitate();
    }


}