package wektor;

public class Wektor {

    private double a;
    private double b;
    private double c;

    public Wektor(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void wypisz(){

        System.out.println("Współżędna x: " + a);
        System.out.println("Współżędna y: " + b);
        System.out.println("Współżędna z: " + c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
