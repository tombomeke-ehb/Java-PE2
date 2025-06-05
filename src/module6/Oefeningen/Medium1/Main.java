package module6.Oefeningen.Medium1;

import java.util.TreeMap;

public class Main {

    private static Wagen zoekWagen(TreeMap<String, Wagen> wagens, String nummerplaat) {
        return wagens.get(nummerplaat);
    }

    public static void main(String[] args) {


        TreeMap<String, Wagen> wagens = new TreeMap<>();

        Wagen wagen1 = new Wagen("ABC12345", 1, "Benzine", 5, false);
        Wagen wagen2 = new Wagen("DBCF4589", 2, "Diesel", 5, false);
        Wagen wagen3 = new Wagen("ABC45123", 3, "Elektrisch", 4, false);

        wagens.put("ABC12345", wagen1);
        wagens.put("DBCF4589", wagen2);
        wagens.put("ABC45123", wagen3);
    }
}
