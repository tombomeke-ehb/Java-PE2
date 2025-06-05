package module4.Oefeningen.Medium2;

public class Bediende extends Personeelslid{
    public Bediende(Lokaal lokaal) {
        super(lokaal);
    }

    public Bediende(String voornaam, String achternaam, Lokaal lokaal) {
        super(voornaam, achternaam, lokaal);
    }

    void wijzigLokaal(Personeelslid personeelslid, Lokaal nieuwlokaal){
        personeelslid.setLokaal(nieuwlokaal);
    }
}
