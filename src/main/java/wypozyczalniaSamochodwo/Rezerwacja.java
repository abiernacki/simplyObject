package wypozyczalniaSamochodwo;

import java.util.Date;

public class Rezerwacja {

    private Date od;
    private Date doo;
    private Samochod samochod;
    private Klient klient;

    public Rezerwacja(Date od, Date doo, Samochod samochod, Klient klient){
        this.klient = klient;
        this.samochod = samochod;
        this.od = od;
        this.doo = doo;
    }

    public Date getDoo() {
        return doo;
    }

    public Date getOd() {
        return od;
    }

    public Klient getKlient() {
        return klient;
    }

    public Samochod getSamochod() {
        return samochod;
    }
}
