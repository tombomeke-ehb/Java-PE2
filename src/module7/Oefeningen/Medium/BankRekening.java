package module7.Oefeningen.Medium;

public class BankRekening {
    private float bedrag;

    public BankRekening(){
        bedrag = 0;
    }

    public BankRekening(float bedrag) {
        if(bedrag < 0){
            this.bedrag = 0;
        } else{
            this.bedrag = bedrag;
        }
    }

    public float getBedrag() {
        return bedrag;
    }

    private void setBedrag(float bedrag) {
        this.bedrag = bedrag;
    }

    public void stort(double aantal){
        if(aantal > 0){
            bedrag += aantal;
        }else{
            System.err.println("Kan geen negatief bedrag storten");
        }
    }

    public void afhaling(double aantal) throws OntoereikendSaldo {
        if (aantal < 0) {
            System.err.println("Kan geen negatief bedrag afhalen");
        }
        if (bedrag - aantal < -1000) {
            System.err.println("Kan niet meer dan 1000 euro onder nul gaan");
        }
        if (bedrag - aantal < 0) {
            throw new OntoereikendSaldo("Je hebt niet genoeg geld op je rekening staan");
        }
        bedrag -= aantal;
    }
}
