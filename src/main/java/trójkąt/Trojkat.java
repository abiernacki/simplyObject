package trójkąt;

import java.util.Scanner;

public class Trojkat {

    private double wysokosc;
    private double podstawa;

    public Trojkat(){
    }

    public Trojkat(double podstawa, double wysokosc){
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    public void wypisz() {
        System.out.println("Wysokość trójkąta: " + getWysokosc());
        System.out.println("Podstawa trójkąta: " + getPodstawa());
    }

    public void wczytaj() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość trójkąta: ");
        wysokosc = scanner.nextInt();
        System.out.println("Podaj podstawę trójkąta: ");
        podstawa = scanner.nextInt();
    }

    public double pole() {
        return 0.5 * getPodstawa() * getWysokosc();
    }

    public double getPodstawa() {
        return podstawa;
    }

    public double getWysokosc() {
        return wysokosc;
    }
}
