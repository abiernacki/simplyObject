package cd;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

    private List<Cd> listaPlyt = new ArrayList<Cd>();

    public Biblioteka() {
    }

    public void dodaj(Cd cd) {

        listaPlyt.add(cd);
    }

    public void usun(Cd cd) {

        listaPlyt.remove(cd);
    }

    public Cd wyszuakaj(String kryteria) {

        for (Cd cd : listaPlyt) {
            for (Utwor utwor : cd.getListaUtworow()) {
                if (utwor.getNazwaUtworu().contains(kryteria)) {
                    return cd;
                }
                if (utwor.getWykonawca().contains(kryteria)) {
                    return cd;
                }
            }
            if (cd.getNazwa().contains(kryteria)) {
                return cd;
            }
        }

        return null;
    }

    public void zapisz() {

        try {
            PrintWriter zapis = new PrintWriter("baza.txt");
            for (Cd cd: listaPlyt) {
                zapis.print(cd.getNazwa());
                zapis.println();
                for (Utwor utwor : cd.getListaUtworow()) {
                    zapis.print("    ");
                    zapis.print(utwor.getNazwaUtworu());
                    zapis.print(" - ");
                    zapis.print(utwor.getWykonawca());
                    zapis.print(" - ");
                    zapis.print(utwor.getDlugosc());
                    zapis.println();
                }
            }
            zapis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
