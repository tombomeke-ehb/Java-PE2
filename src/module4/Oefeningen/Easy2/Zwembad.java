package module4.Oefeningen.Easy2;

/*
E2: Niet verzuipen

We maken een klasse Zwembad om een offerte te kunnen opstellen voor de bouw van zwembaden. Een zwembad zal bestaan uit een cirkelvormig reservoir water, een pad er rond en een omheining rond het pad. Je kan het jezelf gemakkelijker maken door gebruik te maken van de klasse Cirkel uit de oefeningen voor Classes, dit helpt voor de berekeningen. Om dit voor te stellen hebben we enkele gegevens nodig:

    de straal van het zwembad zelf
    de breedte van het pad
    de prijs voor het pad, we gaan er van uit dat dit een prijs per vierkante meter is, bv. 45 €/m²
    de prijs voor de omheining, we gaan er van uit dat dit een prijs is per meter, bv. 80.75 €/m

Binnen deze klasse schrijf je functies uit om het volgende te berekenen:

    De prijs van het pad
    De prijs van de omheining
    De totale prijs hiervoor
 */

public class Zwembad {
    private double straal;
    private double breedte;
    private double prijsPad;
    private double prijsOmheining;

    public Zwembad(double straal, double breedte) {
        this.straal = straal;
        this.breedte = breedte;
        this.prijsPad = 45;
        this.prijsOmheining = 80.75;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getPrijsPad() {
        return prijsPad;
    }

    public void setPrijsPad(double prijsPad) {
        this.prijsPad = prijsPad;
    }

    public double getPrijsOmheining() {
        return prijsOmheining;
    }

    public void setPrijsOmheining(double prijsOmheining) {
        this.prijsOmheining = prijsOmheining;
    }


    public double calcPrijsPad(){
        double zwembadOpervlak = Math.PI * straal * straal;
        double totaleOpervlak = Math.PI * (straal + breedte) * (straal + breedte);
        double opervlakPad = totaleOpervlak - zwembadOpervlak;
        return opervlakPad * prijsPad;
    }

    public double calcPrijsOmheining(){
        double omtrekOmheining = (2 * Math.PI) * straal + breedte;
        return omtrekOmheining * prijsOmheining;
    }

    public double calcTotalePrijs(){
        return calcPrijsPad() + calcPrijsOmheining();
    }

    @Override
    public String toString(){
        return "De straal van het zwembad is " + straal + " de breedte van het pad is " + breedte + " de prijs voor het pad is " + calcPrijsPad() + " de prijs voor de omheining is " + calcPrijsOmheining() + " De totaal prijs voor dit alles is dus " + calcTotalePrijs();
    }
}
