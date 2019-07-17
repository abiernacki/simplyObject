package simpleEncyclopedia;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Encyklopedia2Test {

    @Test
    public void testDodaj() {

        // given
        String haslo = "polimorfizm";
        List<String> definicja = new ArrayList<String>();
        definicja.add("polimorfizm to ...");
        definicja.add("polimorfizm to ***");

        //when
        Encyklopedia2 encyklopedia2 = new Encyklopedia2();
        encyklopedia2.dodaj(haslo, definicja);

        //then
        List<String> oczekiwanaDefininja = encyklopedia2.znajdz(haslo);
        assertEquals(definicja, oczekiwanaDefininja);
    }

}