package zamowienia;

import java.util.Scanner;

public class Zamowienia {

    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maxRozmiar;

    public Zamowienia() {
        maxRozmiar = 10;
        pozycje = new Pozycja[maxRozmiar];
    }

    public Zamowienia(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public void dodajPozycje(Pozycja pozycja) {

        if (ileDodanych < maxRozmiar) {
            int i = 0;
            for (Pozycja iterator : pozycje) {
                if (iterator != null && iterator.getNazwaTowaru().equals(pozycja.getNazwaTowaru()) && iterator.getCena() == pozycja.getCena()) {
                    pozycje[i] = new Pozycja(iterator.getNazwaTowaru(),
                            iterator.getIloscTowaru() + pozycja.getIloscTowaru(), iterator.getCena());
                    return;
                }
                i++;
            }


            pozycje[ileDodanych] = pozycja;
            ileDodanych++;
        } else {
            System.out.println("NIe mogę dodać więcej pozycji bo maxymalny rozmiar tablicy został przekroczony: " + maxRozmiar);
        }
    }

    public double wartoscZamowienia() {

        double sum = 0;
        for (Pozycja iterator : pozycje) {
            if (iterator != null) {
                sum += iterator.wartoscPozycji();
            }
        }
        return sum;
    }

    public String toString() {

        String sum = "";
        for (Pozycja iterator : pozycje) {
            if (iterator != null) {
                sum += iterator.toString() + "\n";
            }
        }
        sum += wartoscZamowienia();

        return sum;
    }

    public void usunPozycje(int index) {
        pozycje[index] = null;
    }

    public void edytujPozycje(int index) {

        Pozycja edytowanaPozycja = pozycje[index];
        if (edytowanaPozycja != null) {
            System.out.println(edytowanaPozycja.toString());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwę towaru");
            String nazwaTowaru = scanner.nextLine();
            System.out.println("Podaj cenę");
            double cena = scanner.nextDouble();
            System.out.println("Podaj ilość towaru");
            int iloscTowaru = scanner.nextInt();

            edytowanaPozycja.setNazwaTowaru(nazwaTowaru);
            edytowanaPozycja.setIloscTowaru(iloscTowaru);
            edytowanaPozycja.setCena(cena);

            pozycje[index] = edytowanaPozycja;
        }
    }
}
