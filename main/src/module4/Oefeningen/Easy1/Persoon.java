package module4.Oefeningen.Easy1;

import module3.Adres;

public class Persoon {
    private String voornaam;
    private String achternaam;
    private String email;
    private Adres adres;
    private static int count;

    public Persoon(){
        count++;
    }

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        count++;
    }

    public Persoon(String voornaam, String achternaam, Adres adres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.adres = adres;
        count++;
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

    public static int getCount(){
        return count;
    }


    @Override
    public String toString() {
        return "Deze persoon heet " + voornaam + " " + achternaam + " " + adres + " Er zijn " + getCount() + " personen aangemaakt";
    }
}

