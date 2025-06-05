package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Pinguin extends Vogel implements Zwem, Vlieg{

    public Pinguin(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Kwaaaark");
    }

    @Override
    public void vlieg() {

    }

    @Override
    public void zwem() {

    }
}
