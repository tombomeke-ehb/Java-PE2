package module4.Oplossingen.medium2;

public class Bedienden extends Personeelsleden {
    private Lokaal lokaal;

    public Bedienden(String naam, String achternaam, int leeftijd, Lokaal lokaal) {
        super(naam, achternaam, leeftijd);
        this.lokaal = lokaal;
    }

    public Lokaal getLokaal() {
        return lokaal;
    }

    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }
}
