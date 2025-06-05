package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Vleermuis extends Zoogdier implements Vlieg{

    public Vleermuis(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Piep Piep");
    }

    @Override
    public void vlieg() {

    }
}
