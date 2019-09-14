package cd;

import java.util.ArrayList;
import java.util.List;

public class Cd {

    private String nazwa;
    private List<Utwor> listaUtworow = new ArrayList<Utwor>();

    public Cd(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajUtwor(Utwor utwor) {

        listaUtworow.add(utwor);
    }

    public void usunUtwor(Utwor utwor) {

        listaUtworow.remove(utwor);
    }

    public double dlugoscPlyty() {

        double suma = 0;

        for (Utwor utwor : listaUtworow) {

            suma += utwor.getDlugosc();
        }

        return suma;

    }

    public String getNazwa() {
        return nazwa;
    }

    public List<Utwor> getListaUtworow() {
        return listaUtworow;
    }
}
