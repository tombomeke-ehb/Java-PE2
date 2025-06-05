package module4.Oefeningen.Easy2;

public class Zwembad {
    private double straal;
    private double breedtePad;
    private double prijsPad;
    private double prijsOmheining;

    public Zwembad(double straal, double breedtePad) {
        this.straal = straal;
        this.breedtePad = breedtePad;
        this.prijsPad = 45;
        this.prijsOmheining = 80.75;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double getBreedtePad() {
        return breedtePad;
    }

    public void setBreedtePad(double breedtePad) {
        this.breedtePad = breedtePad;
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
        double totaleOpervlak = Math.PI * (straal + breedtePad) * (straal + breedtePad);
        double opervlakPad = totaleOpervlak - zwembadOpervlak;
        return opervlakPad * prijsPad;
    }

    public double calcPrijsOmheining(){
        double omtrekOmheining = 2 * Math.PI * (straal + breedtePad);
        return omtrekOmheining * prijsOmheining;
    }

    public double calcTotalePrijs(){
        return calcPrijsPad() + calcPrijsOmheining();
    }
}
