package module4.Oefeningen.Easy1;

import module3.Oefeningen.Adres;

public class Persoon {
    private String voornaam;
    private String achternaam;
    private String email;
    private Adres adres;
    private static int aantalPersonen;

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        aantalPersonen++;
    }

    public Persoon(String achternaam, String voornaam, Adres adres) {
        this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.adres = adres;
        aantalPersonen++;
    }

    public Persoon(String voornaam, String achternaam, String email, Adres adres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.adres = adres;
        aantalPersonen++;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    public static void setAantalPersonen(int aantalPersonen) {
        Persoon.aantalPersonen = aantalPersonen;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", email='" + email +
                adres.toString();
    }
}
