package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public abstract class Dier {

    private LocalDate geboorteDatum;

    public Dier(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public abstract void maakGeluid();
}
