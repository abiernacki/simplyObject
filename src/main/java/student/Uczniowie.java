package student;

import java.util.ArrayList;
import java.util.List;

public class Uczniowie {

    private List<Uczen> listaUczniow = new ArrayList<Uczen>();

    public void dodaj(Uczen uczen){

        listaUczniow.add(uczen);
    }

    public String adres(String imie, String nazwisko){

        for (Uczen uczen: listaUczniow){
            if (uczen.getImie().equals(imie) && uczen.getNazwisko().equals(nazwisko)){
                return uczen.getAdres();
            }
        }
        return "";
    }
}
