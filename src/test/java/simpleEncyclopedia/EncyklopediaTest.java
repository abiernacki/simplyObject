package simpleEncyclopedia;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class EncyklopediaTest {

    @Test
    public void testDodaj() {

        // given
        String haslo = "polimorfizm";
        String definicja = "polimorfizm to .....";

        // then
        Encyklopedia encyklopedia = new Encyklopedia();
        encyklopedia.dodaj(haslo, definicja);

        // when
        String pobranaDefinincja = encyklopedia.znajdz(haslo);
        assertEquals(definicja, pobranaDefinincja);
    }

    @Test
    public void testZakres(){

        // given
        String haslo1 = "polimorfizm";
        String haslo2 = "klasa";
        String haslo3 = "bulka";
        String haslo4 = "kot";
        String haslo5 = "pies";

        String definicja1 = "polimorfizm to ...";
        String definicja2 = "klasa to ...";
        String definicja3 = "bulka to ...";
        String definicja4 = "kot to ...";
        String definicja5 = "pies to ...";

        // when
        Encyklopedia encyklopedia = new Encyklopedia();
        encyklopedia.dodaj(haslo1,definicja1);
        encyklopedia.dodaj(haslo2,definicja2);
        encyklopedia.dodaj(haslo3,definicja3);
        encyklopedia.dodaj(haslo4,definicja4);
        encyklopedia.dodaj(haslo5,definicja5);

        List<String> haslaDoWyszukania = new ArrayList<String>();
        haslaDoWyszukania.add(haslo1);
        haslaDoWyszukania.add(haslo3);
        haslaDoWyszukania.add(haslo5);

        encyklopedia.zakres(haslaDoWyszukania);
    }

}