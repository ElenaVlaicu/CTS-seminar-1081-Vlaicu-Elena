package Seminar13.ro.ase.cts.teste;

import Seminar13.ro.ase.cts.clase.Grupa;
import Seminar13.ro.ase.cts.clase.IStudent;
import Seminar13.ro.ase.cts.clase.Student;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class GrupaTest {

    //right bicep

    //right
    @Test
    public void testConstructorNrGrupaCorect(){
        Grupa grupa = new Grupa(1081);
        assertEquals(1081, grupa.getNrGrupa());
    }

    //right
    @Test
    public void testAlocareListaInConstructor(){
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    //bicep
    //b=boundary - testam toate conditiile de boundary - de intervale
    //trebuie testate exact acele valori limita  - PE limita
    @Test
    public void testLimitaInferioaraNumarGrupa(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testLimitaSuperioaraNumarGrupa(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    //i...nu cred ca avem?

    //c - cross-check -  verificam daca rezultatul obtinut prin metoda noastra e acelasi cu rezultatul obtinut cu alta metoda

    //ar fi mers in junit 4 dar sunt in 5
    /*
    @Test(expected = IllegalArgumentException.class)
    public void testExceptieConstructorInferior(){
        Grupa grupa = new Grupa(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptieConstructorSuperior{
        Grupa grupa = new Grupa(2000);
    }

     */

    //p - performance - rezolvarea metodei cu consum optim de resurse
    //vrem ca constructoru sa fie gata in max jum de sec

    /*
    @Test(timeout = 500)
    public void testPerformantaConstructor(){
        Grupa grupa = new Grupa(1005);
    }

     */

    //facut pt junit5
    @Test()
    public void testPerformantaConstructor(){
        assertTimeout(Duration.ofMillis(500), ()->{Grupa grupa = new Grupa(1005);});
    }

    //correct

    //c - conformance/format - vreun input/output care sa respecte un anumit standard
    //noi nu avem acum
    //o - order link? ordering? - nu avem ceva in ordine - de obicei sunt pt metode care lucreaza cu liste

    //r - range - tre sa stabilesti intervale pt input sau/si pt ouput si sa te folosesti de ele
    //noi trecand deja prin right bicep, le am cam facut, gen pt nr grupa
    //range zice sa faci teste cu valori DIN INAUNTRUL INTERVALULUI - pe care noi l am facut la testul right
    //range zice sa verifici cu calorile limita - am facut la boundary
    //range zice sa verifici si inafara acestor limite - am facut la testul de exceptie
    //=> la range tre sa faci 5 teste

    //r - reference - referinte externe
    //nu avem aici

    // e - existance - ...

    //c - cardinality - ...

    //t - time? - sa testam timpul


    //pentru functia de promovabilitate facem right bicep

    //right
    @Test
    public void testGetPromovabilitateRight(){
        Grupa grupa = new Grupa(1081);
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

        assertEquals(0.66f, grupa.getPromovabilitate(), 0.1f);
    }

    //boundary

    //rezultatul tre sa fie intre 0-1
    @Test
    public void testPromovabilitateInferior(){
        Grupa grupa = new Grupa(1001);
        for(int i=0; i<5; i++){
            IStudent student = new Student();
            student.adaugaNota(7);
            student.adaugaNota(4);
            grupa.adaugaStudent(student);
        }
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testPromovabilitateSuperioara(){
        Grupa grupa = new Grupa(1081);
        for(int i=0; i<5; i++){
            IStudent student = new Student();
            student.adaugaNota(7);
            student.adaugaNota(9);
            grupa.adaugaStudent(student);
        }
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    //i - inverse relationship
    //am vreo functie prin care daca plec de la vloarea promovabilitatii sa ma intorc la cati studenti am etc? NU

    //c - cross check -

    //e
    /*
    @Test(expected = IndexOutOfBoundsException)
    public void testGetPromovabilitateErrorCondition(){
        Grupa grupa = new Grupa(1091);
        grupa.getPromovabilitate();
    }

     */

    // p - performance

    /*
    @Test(timeout = 500)
    public void testGetPromovabilitatePerformanta(){
        Grupa grupa = new Grupa(1081);
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

     */


}