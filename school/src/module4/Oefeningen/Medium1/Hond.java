package module4.Oefeningen.Medium1;

public class Hond extends Huisdier{
    private double stamboeknummer;

    public Hond(double gewicht, int leeftijd, String naam, double stamboeknummer) {
        super(gewicht, leeftijd, naam);
        this.stamboeknummer = stamboeknummer;
    }

    public double getStamboeknummer() {
        return stamboeknummer;
    }

    public void setStamboeknummer(double stamboeknummer) {
        this.stamboeknummer = stamboeknummer;
    }

    @Override
    public String toString() {
        return "Deze hond heet: " + getNaam() + ", weegt: " + getGewight() + ", is " + getLeeftijd() + " jaar oud en zijn stamboeknummer is " + stamboeknummer;
    }
}