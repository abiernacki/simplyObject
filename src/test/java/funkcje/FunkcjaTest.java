package funkcje;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunkcjaTest {

    @Test
    public void testWartosc(){

        //given
        double a = 4;
        double b = 5;

        //when
        Funkcja funkcja = new Funkcja(a,b);
        double result = funkcja.wartosc(2);

        //then
        assertEquals(Double.valueOf(13), Double.valueOf(result));
    }

}