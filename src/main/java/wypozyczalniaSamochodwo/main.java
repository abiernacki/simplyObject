package wypozyczalniaSamochodwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Scanner scanner = new Scanner(System.in);

        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();

        System.out.println("Podaj nazwe klienta:");

        String nazwa = scanner.nextLine();

        Klient klient = wypozyczalnia.znajdzKlienta(nazwa);

        if (klient == null){
            System.out.println("Nie znalezionno klienta");
            return;
        }

        System.out.println("Podaj numer rejestracyjny samochodu");

        String numerR = scanner.nextLine();

        Samochod samochod = wypozyczalnia.znajdzSamochod(numerR);

        if (samochod == null){
            System.out.println("Nie znaleziono samochodu");
            return;
        }

        System.out.println("Podaj date od kiedy chcesz zarezerwowac");

        String dataOd = scanner.nextLine();

        Date od = format.parse(dataOd);

        System.out.println("Podaj date do kiedy chcesz zarezerwowac");

        String dataDo = scanner.nextLine();

        Date doo = format.parse(dataDo);

        if (wypozyczalnia.sprawdz(samochod, od, doo)) {
            System.out.println("Czy chcesz zarezerwowac (Z), czy wypozyczyc (W)?");

            char typ = scanner.nextLine().charAt(0);

            switch (typ) {
                case 'Z':
                    Rezerwacja rezerwacja = new Rezerwacja(od, doo, samochod, klient);
                    wypozyczalnia.dodajRezerwacje(rezerwacja);
                    System.out.println("ZAREZERWOWANO!!!");
                    break;
                case 'W':
                    Wypozyczenie wypozyczenie = new Wypozyczenie(od, doo, samochod, klient);
                    wypozyczalnia.dodajWypozyczenie(wypozyczenie);
                    System.out.println("WYPOZYCZONO!!!");
                    break;
            }

        } else {
            System.out.println("Wypozyczenie lub rezerwacja samochodu jest niemozliwa");
        }
    }
}
