package funkcje;

import org.junit.Test;

import static org.junit.Assert.*;

public class Funkcja_KwTest {

    @Test
    public void testWartosc(){

        //given
        double a = 4;
        double b = 5;
        double c = 2;

        //when
        Funkcja_Kw funkcja_kw = new Funkcja_Kw(a,b,c);
        double result = funkcja_kw.wartosc(2);

        //then
        assertEquals(Double.valueOf(28), Double.valueOf(result));
    }
    @Test
    public void testZeroOne(){

        //given
        double a = 2;
        double b = -4;
        double c = 2;

        //when
        Funkcja_Kw funkcja_kw = new Funkcja_Kw(a,b,c);
        boolean result = funkcja_kw.zero();

        //then
        assertTrue(result);
    }
    @Test
    public void testZeroTwo(){

        //given
        double a = -1;
        double b = 3;
        double c = 4;

        //when
        Funkcja_Kw funkcja_kw = new Funkcja_Kw(a,b,c);
        boolean result = funkcja_kw.zero();

        //then
        assertTrue(result);
    }

    @Test
    public void testZeroZero(){

        //given
        double a = 2;
        double b = 5;
        double c = 4;

        //when
        Funkcja_Kw funkcja_kw = new Funkcja_Kw(a,b,c);
        boolean result = funkcja_kw.zero();

        //then
        assertFalse(result);
    }



}