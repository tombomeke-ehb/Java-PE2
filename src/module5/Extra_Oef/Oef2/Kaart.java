package module5.Extra_Oef.Oef2;

public class Kaart {
    private Kleur kleur;
    private Waarde waarde;

    public Kaart(Kleur kleur, Waarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    public void setWaarde(Waarde waarde) {
        this.waarde = waarde;
    }
}
