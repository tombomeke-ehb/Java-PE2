package module5.Medium;

public class Kaart {
    private Waarde waarde;
    private Kleur kleur;

    public Kaart(Waarde waarde, Kleur kleur) {
        this.waarde = waarde;
        this.kleur = kleur;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    public void setWaarde(Waarde waarde) {
        this.waarde = waarde;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }

}
