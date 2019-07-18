package student;

public class Uczen {

    private String imie;
    private String nazwisko;
    private String adres;
    private String pesel;


    public Uczen(String imie, String nazwisko, String adres, String pesel){
        this.adres = adres;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getAdres(){
        return adres;
    }

    public String getPesel(){
        return pesel;
    }
}
