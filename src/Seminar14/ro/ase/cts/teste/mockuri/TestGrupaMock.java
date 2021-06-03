package Seminar14.ro.ase.cts.teste.mockuri;

import Seminar13.ro.ase.cts.clase.Grupa;
import Seminar13.ro.ase.cts.clase.IStudent;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestGrupaMock {
    @Test
    public void testAdaugaStudent(){
        IStudent student = new DummyStudent();
        Grupa grupa = new Grupa(1091);
        grupa.adaugaStudent(student);
        assertEquals("Adaugare student", 1, grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitate(){
        IStudent student = new StubStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateFakeStudent(){
        Grupa grupa = new Grupa(1081);

        for(int i=0; i<8; i++){
            FakeStudent fake = new FakeStudent();
            fake.setAreRestante(false);
            grupa.adaugaStudent(fake);
        }

        for(int i=0; i<2; i++){
            FakeStudent fake = new FakeStudent();
            fake.setAreRestante(true);
            grupa.adaugaStudent(fake);
        }

        assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
    }
}
