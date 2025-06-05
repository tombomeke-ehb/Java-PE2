package module6.Oefeningen.Medium1;

public class Wagen{

    private String nummerplaat;
    private int serienummer;
    private String brandstoftype;
    private int aantalZitplaatsen;
    private boolean verhuurd;

    public Wagen(String nummerplaat, int serienummer, String brandstoftype, int aantalZitplaatsen, boolean verhuurd) {
        this.nummerplaat = nummerplaat;
        this.serienummer = serienummer;
        this.brandstoftype = brandstoftype;
        this.aantalZitplaatsen = aantalZitplaatsen;
        this.verhuurd = verhuurd;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    public int getSerienummer() {
        return serienummer;
    }

    public void setSerienummer(int serienummer) {
        this.serienummer = serienummer;
    }

    public String getBrandstoftype() {
        return brandstoftype;
    }

    public void setBrandstoftype(String brandstoftype) {
        this.brandstoftype = brandstoftype;
    }

    public int getAantalZitplaatsen() {
        return aantalZitplaatsen;
    }

    public void setAantalZitplaatsen(int aantalZitplaatsen) {
        this.aantalZitplaatsen = aantalZitplaatsen;
    }

    public boolean isVerhuurd() {
        return verhuurd;
    }

    public void setVerhuurd(boolean verhuurd) {
        this.verhuurd = verhuurd;
    }

    private void verhuur(){
        if(isVerhuurd() == false){
            setVerhuurd(true);
            System.out.println("Wagen is verhuurd");
        }else {
            System.out.println("Deze wagen is al verhuurd!");
        }
    }
}
