package module4.Oefeningen.Medium1;

public class Huisdier {

    private double gewicht;
    private int leeftijd;
    private String naam;


    public Huisdier(double gewight, int leeftijd, String naam) {
        this.gewicht = gewight;
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    public double getGewight() {
        return gewicht;
    }

    public void setGewight(double gewight) {
        this.gewicht = gewight;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Huisdier: " + naam + " is " + leeftijd + " jaar oud en weecht " + gewicht;
    }
}