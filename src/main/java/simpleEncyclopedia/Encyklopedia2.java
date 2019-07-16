package simpleEncyclopedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Encyklopedia2 {

    private Map<String, List<String>> dane = new HashMap<String, List<String>>();

    public void dodaj(String haslo, List<String> definicja) {

        dane.put(haslo, definicja);

    }

    public List<String> znajdz(String haslo) {

        List<String> definicja = dane.get(haslo);
        if (definicja == null) {
            return new ArrayList<String>();
        }
        return definicja;
    }
}
