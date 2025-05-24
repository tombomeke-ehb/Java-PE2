package module4.Oplossingen.medium2;

public class Docenten extends Personeelsleden {
    private String specialisatie;
    private Lokaal lokaal;

    public Docenten(String naam, String achternaam, int leeftijd, String specialisatie, Lokaal lokaal){
        super(naam, achternaam, leeftijd);
        this.specialisatie = specialisatie;
        this.lokaal = lokaal;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public Lokaal getLokaal() {
        return lokaal;
    }

    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }
}
