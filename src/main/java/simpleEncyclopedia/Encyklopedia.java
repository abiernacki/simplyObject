package simpleEncyclopedia;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Encyklopedia {

    private Map<String, String> dane = new HashMap<String, String>();

    public void dodaj(String haslo, String definicja) {

        dane.put(haslo, definicja);

    }

    public String znajdz(String haslo) {

        String definicja = dane.get(haslo);
        if (definicja == null) {
            return "";
        }
        return definicja;
    }

    public void zakres(List<String> hasla) {

        Collections.sort(hasla);
        for (String iterator : hasla) {
            String definicja = dane.get(iterator);
            System.out.print("Hasło - " + iterator + ": ");
            System.out.println(definicja);
        }
    }
}
