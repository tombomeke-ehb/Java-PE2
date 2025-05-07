package module7.DeelVanOefening;

import java.time.LocalDate;
import java.util.HashMap;

public class Klant {

    private HashMap<Boek, LocalDate> winkelmandje = new HashMap<>();

    public void verijwderUitMandje(Boek b) throws BoekNietInMandjeException {

        if (winkelmandje.containsKey(b)) {
            throw new BoekNietInMandjeException();
        } else {
            winkelmandje.remove(b);
        }
    }
}