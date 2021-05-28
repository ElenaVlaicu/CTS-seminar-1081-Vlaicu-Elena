package Seminar12.ro.ase.cts.teste;

import Seminar12.ro.ase.cts.clase.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testConstructorCuUnParametru(){
        String nume = "Costica";
        Student student = new Student(nume);

        //primul parametru: expected, al doilea param: ce ne returneaza de fapt
        assertEquals(nume, student.getNume());
        assertNotNull(student.getNote());
    }

    @Test
    public void testConstructorFaraParametrii(){
        Student student = new Student();

        assertNotNull(student.getNote());
        assertNotNull(student.getNume());
    }

    @Test
    public void testSeAdaugaNotaInLIsta(){
        Student student = new Student();
        int nota = 4;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testAdaugaNotaDimensiune(){
        Student student = new Student();
        student.adaugaNota(6);
        student.adaugaNota(8);
        assertEquals(2, student.getNote().size());
    }

    @Test
    public void testCalculeazaMedie(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);
        //delta - marja de eroare - in cazu de fata intre 6.4 si 6.6
        assertEquals(6.5f, student.calculeazaMedie(), 0.1);
    }

    //regula 0, 1, n:

    @Test
    public void testMedieNicioNota(){
        Student student = new Student();
        assertEquals(0, student.calculeazaMedie(), 0.1);
    }

    @Test
    public void testMedieONota(){
        Student student = new Student();
        student.adaugaNota(5);
        assertEquals(student.getNota(0), student.calculeazaMedie(), 0.1);
    }

    @Test
    public void testAreRestante(){
        Student student = new Student();
        student.adaugaNota(9);
        student.adaugaNota(6);
        student.adaugaNota(4);
        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante(){
        Student student = new Student();
        student.adaugaNota(9);
        student.adaugaNota(6);
        assertFalse(student.areRestante());
    }

    @Test
    public void testGetNotaExceptie(){
        Student student = new Student();
        student.adaugaNota(4);
        student.adaugaNota(7);

        try{
            student.getNota(5);
        } catch(IndexOutOfBoundsException e){

        }
    }

    /*
    @Test(expected = IndexOutOfBoundsException.class)
        public void testGetNotaExceptieV4(){
            Student student = new Student();
            student.adaugaNota(5);
            student.adaugaNota(6);
        }


     */
    @Test
    public void testGetNotaExceptieV5() {
        Student student = new Student();
        student.adaugaNota(7);
        student.adaugaNota(5);

        assertThrows(IndexOutOfBoundsException.class, () -> {student.getNota(5);});
    }

}