package lista;

import java.util.Arrays;

public class Lista {

    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        this.rozmiar = 0;
        this.liczby = new int[pojemnosc];
    }

    public void dodajElement(int liczba) {

        liczby[rozmiar] = liczba;
        rozmiar++;
    }

    public int znajdz(int liczba) {

        for (int i = 0; i < rozmiar; i++) {
            if (liczby[i] == liczba) {
                return i;
            }
        }
        return -1;
    }

    public void pisz() {
        System.out.println(toString());
    }

    public void usunPierwszy(int liczba) {

        int przesun = 0;
        int[] pom = new int[rozmiar - 1];
        for (int i = 0; i < rozmiar - 1; i++) {
            if (liczby[i] == liczba) {
                przesun = 1;
            }
            pom[i] = liczby[i + przesun];
        }
        liczby = pom;
    }

    public void usunPowtorzenia(int liczba) {

        // TO DO
    }

    @Override
    public String toString() {
        return "Lista:" + "\n" +
                "       Rozmiar: " + getRozmiar() + "\n" +
                "       Pojemność: " + getPojemnosc() + "\n" +
                "       Elemety: " +
                Arrays.toString(liczby);
    }

    public int[] getLiczby() {
        return liczby;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }
}
