package trójkąt;

import org.junit.Test;
import trójkąt.Trojkat;

import static org.junit.Assert.assertEquals;

public class TrojkatTest {

    @Test
    public void testPole() {

        // given
        double wysokosc = 5;
        double podstawa = 10;

        // when
        Trojkat trojkat = new Trojkat(podstawa, wysokosc);
        double result = trojkat.pole();

        // then
        assertEquals(Double.valueOf(25), Double.valueOf(result));
    }

}