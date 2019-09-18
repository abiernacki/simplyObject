package wypozyczalniaSamochodwo;

public class Klient {

   private String imie;
   private String nazwisko;

   public Klient(String imie, String nazwisko){
       this.imie = imie;
       this.nazwisko = nazwisko;
   }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }
}
