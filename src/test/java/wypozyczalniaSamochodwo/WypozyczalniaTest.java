package wypozyczalniaSamochodwo;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WypozyczalniaTest {


    @Test
    public void znajdzKlientaImieTest() throws ParseException {

        //given
        List<Klient> klients = new ArrayList<>();
        Klient klient = new Klient("Stefan", "Ząbek");
        klients.add(klient);
        //when
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        Klient klient1 = wypozyczalnia.znajdzKlienta("Stefan");

        //then
        assertEquals(klient.getImie(), klient1.getImie());
    }

    @Test
    public void znajdzKlientaNazwiskoTest() throws ParseException {

        //given
        List<Klient> klients = new ArrayList<>();
        Klient klient = new Klient("Stefan", "Ząbek");
        klients.add(klient);

        //when
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        Klient klient1 = wypozyczalnia.znajdzKlienta("Ząbek");

        //then
        assertEquals(klient.getNazwisko(), klient1.getNazwisko());
    }

    @Test
    public void znajdzSamochodTest() throws ParseException {

        //given
        List<Samochod> samochody = new ArrayList<>();
        Samochod samochod = new Samochod("Opel", "Vectra", "LU932EN");
        samochody.add(samochod);

        //when
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        Samochod samochod1 = wypozyczalnia.znajdzSamochod("LU932EN");

        //then
        assertEquals(samochod1.getNrRejestracyjny(), samochod.getNrRejestracyjny());
    }

    @Test
    public void dodajRezerwacjeTest() throws ParseException {

        //given
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        List<Rezerwacja> rezerwacje = new ArrayList();
        Samochod samochod = new Samochod("Opel", "Vectra", "LU932EN");
        Klient klient = new Klient("Stefan", "Ząbek");
        Rezerwacja rezerwacja = new Rezerwacja(format.parse("2019-08-15"), format.parse("2019-08-19"), samochod, klient);
        rezerwacje.add(rezerwacja);

        //when
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        wypozyczalnia.dodajRezerwacje(rezerwacja);

        //then
        assertTrue(rezerwacje.contains(rezerwacja));
    }

    @Test
    public void dodajWypozyczenieTest() throws ParseException {

        //given
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        List<Wypozyczenie> wypozyczenia = new ArrayList();
        Samochod samochod = new Samochod("Opel", "Vectra", "LU932EN");
        Klient klient = new Klient("Stefan", "Ząbek");
        Wypozyczenie wypozyczenie = new Wypozyczenie(format.parse("2019-08-15"), format.parse("2019-08-19"), samochod, klient);
        wypozyczenia.add(wypozyczenie);

        //when
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        wypozyczalnia.dodajWypozyczenie(wypozyczenie);

        //then
        assertTrue(wypozyczenia.contains(wypozyczenie));
    }

    @Test
    public void sprawdzTestInCorrect() throws ParseException {

        //given
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Samochod samochod = new Samochod("Opel", "Vectra", "LU932EN");
        Klient klient = new Klient("Stefan", "Ząbek");
        List<Wypozyczenie> wypozyczenia = new ArrayList();
        Wypozyczenie wypozyczenie = new Wypozyczenie(format.parse("2019-09-15"),format.parse("2019-09-16"),samochod,klient);
        wypozyczalnia.dodajWypozyczenie(wypozyczenie);

        //when
        boolean spr = wypozyczalnia.sprawdz(samochod,format.parse("2019-09-15"),format.parse("2019-09-16"));

        //then
        assertFalse(spr);
    }
    @Test
    public void sprawdzTestCorrect() throws ParseException {

        //given
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Samochod samochod = new Samochod("Opel", "Vectra", "LU932EN");

        //when
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        boolean spr = wypozyczalnia.sprawdz(samochod,format.parse("2019-09-15"),format.parse("2019-09-16"));

        //then
        assertTrue(spr);
    }

}