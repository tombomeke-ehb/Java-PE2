package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Eend extends Vogel implements Zwem, Vlieg{

    public Eend(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Kwek Kwek");
    }

    @Override
    public void vlieg() {

    }

    @Override
    public void zwem() {

    }
}
