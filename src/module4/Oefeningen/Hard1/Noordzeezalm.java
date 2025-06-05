package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Noordzeezalm extends Vis implements Zwem{

    public Noordzeezalm(LocalDate geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Blub");
    }

    @Override
    public void zwem() {

    }
}
