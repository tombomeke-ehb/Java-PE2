package module4.les2;

public class Apparaat {
    private String naam;
    private int verbruik;

    public Apparaat(String naam, int verbruik) {
        this.naam = naam;
        this.verbruik = verbruik;
    }

    public int getVerbruik() {
        return verbruik;
    }

    public void setVerbruik(int verbruik) {
        this.verbruik = verbruik;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
