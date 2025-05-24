package module3.Oefeningen;

/*
H1: Klasse Auto

Maak een klasse Auto. Een auto heeft een kilometerteller, een brandstoftank met een inhoud in liter en een verbruik (aantal liter per 100km).
Gebruik voor deze gegevens een double als datatype.

Voorzie minstens twee constructors, één die toelaat aan alle gegevens een beginwaarde te geven en één die werkt met een aantal default waarden
(nieuwe auto, lege tank). Je hoeft geen bijkomende controles uit te voeren.
Je mag er van uitgaan dat de gebruiker altijd realistische waarden gebruikt.

Voorzie een methode om de tank bij te vullen (altijd tot ze vol is). Voorzie een methode om een gegeven aantal km te rijden.
In dit geval telt de kilometerteller altijd vooruit (ook alsje een negatief getal ingeeft). Er wordt steeds brandstof verbruikt.
Hou er rekening mee dat er mogelijk te weinig brandstof kan zijn om de volledige afstand te rijden. In dat geval wordt er gereden tot de tank leeg is.
Eens klaar geeft de methode het aantal gereden km als returnwaarde.

Voorzie ook een methode om alle relevante gegevens van een Auto object af te drukken.
 */

public class Auto {
    private double kilometerteller;
    private double brandstoftank;
    private double verbruik;

    public Auto() {
        this.brandstoftank = 0;
    }

    public Auto(double verbruik) {
        this.verbruik = verbruik;
        this.brandstoftank = 0;
    }

    public Auto(double brandstoftank, double verbruik, double kilometerteller) {
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
        this.kilometerteller = kilometerteller;
    }

    public double getKilometerteller() {
        return kilometerteller;
    }

    public void setKilometerteller(double kilometerteller) {
        this.kilometerteller = kilometerteller;
    }

    public double getBrandstoftank() {
        return brandstoftank;
    }

    public void setBrandstoftank(double brandstoftank) {
        this.brandstoftank = brandstoftank;
    }

    public double getVerbruik() {
        return verbruik;
    }

    public void setVerbruik(double verbruik) {
        this.verbruik = verbruik;
    }

    public void vulTank(){
        this.brandstoftank = 100;
    }
    public double rij(double aantalkm){
        if (aantalkm <= 0){
            aantalkm *= -1;
        }

        double mogelijkeafstand = (brandstoftank / verbruik) * 100;
        if (aantalkm >= mogelijkeafstand){
            aantalkm = mogelijkeafstand;
            brandstoftank -= (aantalkm / 100) * verbruik;
            kilometerteller += aantalkm;
        } else{
            brandstoftank -= (aantalkm / 100) * verbruik;
            kilometerteller += aantalkm;
        }
        return aantalkm;
    }

    public void gegevensAuto(){
        System.out.println("Deze auto heeft een verbruik van: " + verbruik + " heeft momenteel een brandstoftank van: " + brandstoftank +
                " heeft een kilometerteller van: " + kilometerteller);
    }
}