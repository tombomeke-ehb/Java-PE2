package module3;

public class Adres {
    /*
    M1: Een iets minder eenvoudige klasse"

Maak een klasse Adres. Een object van de klasse kan de adresgegevens van een persoon bijhouden. Een adres bevat minstens de volgende gegevens:

    straatnaam
    huisnummer (enkel cijfers)
    bus
    postcode (exact 4 cijfers)
    woonplaats

Denk zelf na over de meest geschikte types om bv. tekst of getallen bij te houden.
Zorg er voor dat je zeker een constructor hebt waar je alles aan kan meegeven.
Zorg ook voor getters en setters.
Voeg ook nog een functie toe waarmee je alle gegevens in de console kan afdrukken.
Als uitdaging voorzie je ook nog een controle bij het invoeren van een postcode, dit moet uit exact 4 cijfers bestaan en anders vervang je de invoer door 9999.
     */
    private String straatnaam;
    private int huisnummer;
    private String bus;
    private int postcode;
    private String woonplaats;

    public Adres(String straatnaam, int huisnummer, String bus, int postcode, String woonplaats) {
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.bus = bus;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        if(postcode >= 1000 && postcode <= 9999){
            this.postcode = postcode;
        }else{
            this.postcode = 9999;
        }
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public void showAdres() {
        System.out.println("Adres: " + straatnaam + ", " + huisnummer + ", " + bus + ", " + postcode);
    }
}