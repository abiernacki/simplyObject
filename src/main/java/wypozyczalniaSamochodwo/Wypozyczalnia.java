package wypozyczalniaSamochodwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Wypozyczalnia {

    private List<Klient> klients = new ArrayList<Klient>();
    private List<Samochod> samochody = new ArrayList<Samochod>();
    private List<Wypozyczenie> wypozyczenia = new ArrayList();
    private List<Rezerwacja> rezerwacje = new ArrayList();


    public Wypozyczalnia() throws ParseException {
        Samochod samochod1 = new Samochod("Opel", "Vectra", "LU932EN");
        Samochod samochod2 = new Samochod("Volkswagen", "Passat", "LTM34343");
        Samochod samochod3 = new Samochod("Opel", "Corsa", "LU89121");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date od1 = format.parse("2019-09-20");
        Date do1 = format.parse("2019-09-25");
        samochod1.dodajSerwis(new Serwis(od1, do1, "Przegld techniczny"));

        samochody.add(samochod1);
        samochody.add(samochod2);
        samochody.add(samochod3);

        Klient klient1 = new Klient("Stefan", "Zbek");
        Klient klient2 = new Klient("Adrian", "Biernacki");
        Klient klient3 = new Klient("Karina", "Nowak");

        klients.add(klient1);
        klients.add(klient2);
        klients.add(klient3);
    }

    public Klient znajdzKlienta(String kryteria) {

        for (Klient klient : klients) {
            if (klient.getNazwisko().contains(kryteria)) {
                return klient;
            }
            if (klient.getImie().contains(kryteria)) {
                return klient;
            }

        }

        return null;
    }

    public Samochod znajdzSamochod(String nrRejestracyjny) {

        for (Samochod samochod : samochody) {
            if (samochod.getNrRejestracyjny().equals(nrRejestracyjny)) {
                return samochod;
            }
        }

        return null;
    }

    public void dodajRezerwacje(Rezerwacja rezerwacja) {

        rezerwacje.add(rezerwacja);
    }

    public void dodajWypozyczenie(Wypozyczenie wypozyczenie) {

        wypozyczenia.add(wypozyczenie);
    }

    public boolean sprawdz(Samochod samochod, Date od, Date doo) {

        for (Rezerwacja rezerwacja : rezerwacje) {
            if (rezerwacja.getSamochod().equals(samochod)
                    && sprawdzZakresDat(rezerwacja.getOd(),rezerwacja.getDoo(),od,doo)){
                return false;
            }
        }

        for (Wypozyczenie wypozyczenie : wypozyczenia) {
            if (wypozyczenie.getSamochod().equals(samochod)
                    && sprawdzZakresDat(wypozyczenie.getOd(),wypozyczenie.getDoo(),od,doo)) {
                return false;
            }
        }

        for (Serwis serwis : samochod.getCzynnosciSerwisowe()) {
            if (sprawdzZakresDat(serwis.getOd(),serwis.getDoo(),od,doo)) {
                return false;
            }
        }

        return true;
    }

    public void wyswietl(){

        //todo
    }

    private boolean sprawdzZakresDat(Date od, Date doo, Date odSpr, Date dooSpr) {
        return (odSpr.getTime() <= od.getTime() && dooSpr.getTime() >= od.getTime())
                || (odSpr.getTime() <= doo.getTime() && dooSpr.getTime() >= doo.getTime())
                || (odSpr.getTime() >= od.getTime() && dooSpr.getTime() <= doo.getTime());
    }


}
