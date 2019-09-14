package cd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtworTest {


    @Test
    public void testCreate() {

        // given
        Utwor utwor = new Utwor("Utwór 1", "Wykonawca 1", 2.02);

        // when
        double dlugosc = utwor.getDlugosc();
        String wykonawca = utwor.getWykonawca();
        String nazwa = utwor.getNazwaUtworu();

        // then

        assertEquals("Utwór 1",nazwa);
        assertEquals("Wykonawca 1",wykonawca);
        assertEquals(Double.valueOf(2.02),Double.valueOf(dlugosc));
    }

}