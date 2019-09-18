package wypozyczalniaSamochodwo;

import java.util.ArrayList;
import java.util.List;

public class Samochod {

    private String marka;
    private String model;
    private String nrRejestracyjny;
    private List<Serwis> czynnosciSerwisowe = new ArrayList();


    public Samochod(String marka, String model, String nrRejestracyjny){
        this.marka = marka;
        this.model = model;
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public void dodajSerwis(Serwis serwis){

        czynnosciSerwisowe.add(serwis);
    }

    public List<Serwis> getCzynnosciSerwisowe() {
        return czynnosciSerwisowe;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }
}
