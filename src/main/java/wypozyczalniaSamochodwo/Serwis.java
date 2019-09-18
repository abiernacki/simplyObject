package wypozyczalniaSamochodwo;

import java.util.Date;

public class Serwis {

    private Date od;
    private Date doo;
    private String opis;

    public Serwis(Date od, Date doo, String opis) {
        this.doo = doo;
        this.od = od;
        this.opis = opis;
    }

    public Date getOd() {
        return od;
    }

    public Date getDoo() {
        return doo;
    }
}
