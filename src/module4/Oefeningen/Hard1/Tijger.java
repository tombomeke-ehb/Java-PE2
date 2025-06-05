package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Tijger extends Zoogdier implements Zwem{

    public Tijger(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Grrrrrrrr");
    }

    @Override
    public void zwem() {

    }
}
