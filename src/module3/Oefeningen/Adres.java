package module3.Oefeningen;

/*
M1: Een iets minder eenvoudige klasse"

Maak een klasse Adres. Een object van de klasse kan de adresgegevens van een persoon bijhouden. Een adres bevat minstens de volgende gegevens:

    straatnaam
    huisnummer (enkel cijfers)
    bus
    postcode (exact 4 cijfers)
    woonplaats

Denk zelf na over de meest geschikte types om bv. tekst of getallen bij te houden.
Zorg er voor dat je zeker een constructor hebt waar je alles aan kan meegeven. Zorg ook voor getters en setters.
Voeg ook nog een functie toe waarmee je alle gegevens in de console kan afdrukken.
Als uitdaging voorzie je ook nog een controle bij het invoeren van een postcode, dit moet uit exact 4 cijfers bestaan en anders vervang je de invoer door 9999.
 */

public class Adres {
    private String straatnaam;
    private int huisnummer;
    private int bus;
    private int postcode;
    private String woonplaats;

    public Adres(String straatnaam, int huisnummer, int bus, int postcode, String woonplaats) {
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.bus = bus;
        this.woonplaats = woonplaats;
        if(postcode >= 1000 && postcode <= 9999){
            this.postcode = postcode;
        } else{
            this.postcode = 9999;
        }
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void showAdres(){
        System.out.println("Adres: " + straatnaam + " " + huisnummer + " " + bus + " " + woonplaats + " " + postcode);
    }

    public static void main(String[] args) {
        Adres adres1 = new Adres("Konkelstraat", 96, 1200, 1200, "Sint-Lambrechts-Woluwe");

        adres1.showAdres();
    }
}
