package module4.Oefeningen.Medium2;

public class Personeelslid extends Persoon{
    private Lokaal lokaal;

    public Personeelslid(Lokaal lokaal) {
        this.lokaal = lokaal;
    }

    public Personeelslid(String voornaam, String achternaam, Lokaal lokaal) {
        super(voornaam, achternaam);
        this.lokaal = lokaal;
    }

    public Lokaal getLokaal() {
        return lokaal;
    }

    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }
}
