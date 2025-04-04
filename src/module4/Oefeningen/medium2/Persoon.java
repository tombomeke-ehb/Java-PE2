package module4.Oefeningen.medium2;

public class Persoon {
    private String naam;
    private String achternaam;
    private int leeftijd;

    public Persoon(String naam, String achternaam, int leeftijd) {
        this.naam = naam;
        this.achternaam = achternaam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
