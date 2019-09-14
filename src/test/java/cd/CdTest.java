package cd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CdTest {

    @Test
    public void testCreate(){

        //given
        Cd cd = new Cd("Nowa nazwa");
        Utwor utwor1 = new Utwor("Utwór 1","Wykonawca 1", 3.01);
        Utwor utwor2 = new Utwor("Utwór 2","Wykonawca 2", 4.03);


        //when
        cd.dodajUtwor(utwor1);
        cd.dodajUtwor(utwor2);

        //then
        double suma = cd.dlugoscPlyty();
        assertEquals(Double.valueOf(7.04),Double.valueOf(suma));
        assertEquals("Nowa nazwa",cd.getNazwa());

        List<Utwor> utwory = cd.getListaUtworow();
        assertTrue(utwory.contains(utwor1));
        assertTrue(utwory.contains(utwor2));

    }

}