package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Kikker extends Amfibie implements Zwem{

    public Kikker(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Kwak Kwak");
    }

    @Override
    public void zwem() {

    }
}
