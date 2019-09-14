package cd;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BibliotekaTest {

    @Test
    public void testCreate(){

        //given
        Biblioteka biblioteka = new Biblioteka();
        Cd cd = new Cd("Nowa nazwa");
        Utwor utwor = new Utwor("Nazwa 1","Wykonawca 1", 2.02);

        //when
        cd.dodajUtwor(utwor);
        biblioteka.dodaj(cd);

        //then

        Cd cd1 = biblioteka.wyszuakaj("Nowa nazwa");
        assertNotNull(cd1);
        Cd cd2 =biblioteka.wyszuakaj("Nazwa 1");
        assertNotNull(cd2);
        Cd cd3 = biblioteka.wyszuakaj("Wykonawca 1");
        assertNotNull(cd3);
        Cd cd4 = biblioteka.wyszuakaj("dfg");
        assertNull(cd4);
    }

    @Test
    public void testZapis(){

        //given
        Biblioteka biblioteka = new Biblioteka();
        Cd cd1 = new Cd("Nowa nazwa 1");
        Cd cd2 = new Cd("Nowa nazwa 2");

        Utwor utwor1 = new Utwor("Nazwa 1","Wykonawca 1", 2.02);
        Utwor utwor2 = new Utwor("Nazwa 2","Wykonawca 2", 3.02);
        Utwor utwor3 = new Utwor("Nazwa 3","Wykonawca 3", 5.07);

        //when
        cd1.dodajUtwor(utwor1);
        cd1.dodajUtwor(utwor2);
        cd1.dodajUtwor(utwor3);
        cd2.dodajUtwor(utwor3);
        biblioteka.dodaj(cd1);
        biblioteka.dodaj(cd2);

        //then
        biblioteka.zapisz();
    }

}