package funkcje;

public class Funkcja {

    private double a;
    private double b;

    public Funkcja(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double wartosc(double x) {
        return a * x + b;
    }

}
