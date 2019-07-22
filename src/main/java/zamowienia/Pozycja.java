package zamowienia;

public class Pozycja {

    private String nazwaTowaru;
    private int iloscTowaru;
    private double cena;


    public Pozycja(String nazwaTowaru, int iloscTowaru, double cena){
        this.nazwaTowaru = nazwaTowaru;
        this.iloscTowaru = iloscTowaru;
        this.cena = cena;
    }

    public double wartoscPozycji(){
        return iloscTowaru*cena;
    }

    public String toString(){
        return nazwaTowaru + " " + iloscTowaru + " " + cena + " " + wartoscPozycji();
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public void setIloscTowaru(int iloscTowaru){
        this.iloscTowaru = iloscTowaru;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscTowaru() {
        return iloscTowaru;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

}
