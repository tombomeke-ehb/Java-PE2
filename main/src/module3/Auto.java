package module3;

public class Auto {
    private static double teller = 0;
    private double brandstoftank;
    private double verbruik;

    public Auto(){
        this.brandstoftank = 0;
    }

    public Auto(double brandstoftank, double verbruik) {
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
    }

    public Auto(double verbruik) {
        this.verbruik = verbruik;
        this.brandstoftank = 0;
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

    public static double getTeller() {
        return teller;
    }

    public void vullTank(){
        this.brandstoftank = 100;
    }

    public void rij(double afstand){
        if (afstand < 0){
            afstand = afstand * (-1);
        }
        double geredenAfstand;
        double mogelijkeAfstand = (brandstoftank / verbruik) * 100;
    }
}