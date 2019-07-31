package funkcje;

public class Funkcja_Kw {

    private double a;
    private double b;
    private double c;

    public Funkcja_Kw(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double wartosc(double x) {
        return a * x * x + b * x + c;
    }

    public boolean zero() {
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            return true;
        }
        return false;
    }
}
