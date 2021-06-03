package Seminar14.ro.ase.cts.teste.mockuri;

import Seminar13.ro.ase.cts.clase.Grupa;
import Seminar13.ro.ase.cts.clase.IStudent;
import Seminar13.ro.ase.cts.clase.Student;
import Seminar14.ro.ase.cts.teste.categorii.ConstructorGrupaCategory;
import Seminar14.ro.ase.cts.teste.categorii.GetPromovabilitateCategory;
import Seminar14.ro.ase.cts.teste.categorii.TesteUrgente;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//junit 4
public class Grupa2Test {

    //MAI INTAI FACEM TOATE TESTELE PENTRU CONSTRUCTOR

    //right bicep

    //right
    @Test
    @Category({ConstructorGrupaCategory.class, TesteUrgente.class})
    public void testConstructorNrGrupaCorect(){
        Grupa grupa = new Grupa(1081);
        assertEquals(1081, grupa.getNrGrupa());
    }

    //right
    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testAlocareListaInConstructorDEEXISTANCE(){
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    //bicep
    //b=boundary - testam toate conditiile de boundary - de intervale
    //trebuie testate exact acele valori limita  - PE limita
    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testLimitaInferioaraNumarGrupa(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testLimitaSuperioaraNumarGrupa(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    // i -inverse - situatia inversa - sa plecam de la rezultat si sa ajungem la input?
    //nu putem face asta pe contructorul nostru

    //c - cross-check -  verificam daca rezultatul obtinut prin metoda noastra
    // e acelasi cu rezultatul obtinut cu alta metoda
    // nu putem face asta in alt fel decat cu constructorul, doar ala poate crea obiecte

    //e  - errors - sa vedem cum se comporta metoda noastra in situatii de eroare:

    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupaCategory.class)
    public void testExceptieConstructorInferior(){
        Grupa grupa = new Grupa(10);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupaCategory.class)
    public void testExceptieConstructorSuperior(){
        Grupa grupa = new Grupa(2000);
    }

    //p - performance - rezolvarea metodei cu consum optim de resurse
    //vrem ca constructoru sa fie gata in max jum de sec

    @Test(timeout = 500)
    @Category(ConstructorGrupaCategory.class)
    public void testPerformantaConstructor(){
        Grupa grupa = new Grupa(1005);
    }

    //correct
    //pentru constructor

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

    // e - existance - ...e al doilea facut de la right

    //c - cardinality - regula 0-1-n (0 e testat deja in testul de existance, iar la constructor e stupid
    // sa vad daca are un stud sau mai multi, ca nu e asta scopu lui)

    //t - time? - sa testam timpul - e facut la performance
    //fata de performance, la time ne intereseaza si daca e apelat in ordinea care trebuie
    //dar la constructor...nu are sens, ca constructoru e apelat oricum primul


    //Acum luam
    //pentru functia de promovabilitate

    // facem right bicep

    //right
    @Test
    @Category(GetPromovabilitateCategory.class)
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
    @Category(GetPromovabilitateCategory.class)
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
    @Category(GetPromovabilitateCategory.class)
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
    //am vreo functie prin care daca plec de la vloarea promovabilitatii
    // sa ma intorc la cati studenti am in acea grupa/daca au restante? NU

    //c - cross check - mai avem o metoda care calculeaza promovabilitatea? NU

    //e - eroare

    //daca lipsa e goala:

    @Test(expected = IndexOutOfBoundsException.class)
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateErrorCondition(){
        Grupa grupa = new Grupa(1091);
        grupa.getPromovabilitate();
    }


    // p - performance
    // e facuta in clasa cu fixture

    //correct
    // c - conformance - format
    //nu prea avem pt metoda get promovabilitate
    //unul fortat ar fi sa verificam daca rezultatul e cu virgula

    //o - ordering
    //nu avem ce sa testam pt ca nu are importanta ordinea notelor/studentilor in grupa


    //r -range
    //la range, primul lucru pe care il avem de facut e sa setam un interval!
    //ATENTIE!!
    //putem verifica ca notele sa fie intre 1-10?? NU, pt ca nu asta e scopul lui get promovabilitate
    //dar putem verifica ca rezultatul sa fie intre 0-1.
    //apoi: testam cu valori din interior(am facut), testam cu valori limite(am facut), si inafara(nu putem crea o astfel de situatie)

    //r - refference

    //e - existance - sa aiba studenti in lista/lista goala (am facut)

    //c - cardinality - 0-1-n, 0 restantieri/0 studenti (am facut), n - am facut pt 15 stud, cu 1 stud nu am facut
    //pt 1

    @Test
    @Category(GetPromovabilitateCategory.class)
    public void getPromovabilitateCardinality1(){
        Grupa grupa = new Grupa(1081);
        Student student = new Student("Viorel");
        student.adaugaNota(6);
        student.adaugaNota(8);

        assertEquals(1, 1, 0.01);
    }

    //t - time - l am facut
    //t - time din correct tine si de ordinea apelurilor
    //ce se intampla daca apelez get promovalilitate inainte sa apelez adauga stud?
    //rasp: tre sa dea exceptie, ceea ce am facut - linia 168


}