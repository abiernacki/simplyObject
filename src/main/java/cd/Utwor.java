package cd;

public class Utwor {

    private String nazwaUtworu;
    private String wykonawca;
    private double dlugosc;

    public Utwor(String nazwaUtworu, String wykonawca, double dlugosc){
        this.nazwaUtworu = nazwaUtworu;
        this.wykonawca = wykonawca;
        this.dlugosc = dlugosc;
    }

    public String getNazwaUtworu() {
        return nazwaUtworu;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public double getDlugosc() {
        return dlugosc;
    }
}
