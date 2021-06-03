package Seminar13.ro.ase.cts.teste;

import Seminar13.ro.ase.cts.clase.Grupa;
import Seminar13.ro.ase.cts.clase.IStudent;
import Seminar13.ro.ase.cts.clase.Student;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class GrupaTestJunit5 {


    //facut pt junit5

    //timeout
    @Test()
    public void testPerformantaConstructor(){
        assertTimeout(Duration.ofMillis(500), ()->{Grupa grupa = new Grupa(1005);});
    }


}