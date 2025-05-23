package module3.Oefeningen;

/*
E1: Een eenvoudige klasse

Maak een klasse Cirkel die als gegevens de straal van de cirkel en de kleur bevat.
Zorg voor een aantal constructoren zodat je een Cirkel kan aanmaken zonder parameters,
met slechts één argument (straal, kleur) of met beide parameters (straal en kleur). Tenzij anders ingegeven is de straal 0 en de kleur wit.
Maak (uiteraard) ook getters en setters. Zorg tenslotte voor de volgende extra methoden:

    print() om de cirkel (straal en kleur) af te printen.
    geefOmtrek() : 2 * pi * r , met r als straal
    geefOppervlakte() : pi * r * r

Voor de waarde van pi kan je Math.PI gebruiken.
 */

public class Cirkel {
    private double straal;
    private String kleur;

    public Cirkel() {
        this.straal = 0;
        this.kleur = "wit";
    }

    public Cirkel(double straal) {
        this.straal = straal;
    }

    public Cirkel(String kleur) {
        this.kleur = kleur;
    }

    public Cirkel(double straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void print(){
        System.out.println(straal + kleur);
    }

    public double geefOmtrek(){
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte(){
        return Math.PI * straal * straal;
    }
}
