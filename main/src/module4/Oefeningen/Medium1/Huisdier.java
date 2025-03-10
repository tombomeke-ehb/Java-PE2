package module4.Oefeningen.Medium1;

public class Huisdier {

    private double gewight;
    private int leeftijd;
    private String naam;


    public Huisdier(double gewight, int leeftijd, String naam) {
        this.gewight = gewight;
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    public double getGewight() {
        return gewight;
    }

    public void setGewight(double gewight) {
        this.gewight = gewight;
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
}
