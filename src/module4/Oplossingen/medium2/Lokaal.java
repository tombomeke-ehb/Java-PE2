package module4.Oplossingen.medium2;

public class Lokaal {
    private String adres;
    private String gebouw;
    private int verdieping;
    private int lokaalnummer;

    public Lokaal(String adres, String gebouw, int verdieping, int lokaalnummer) {
        this.adres = adres;
        this.gebouw = gebouw;
        this.verdieping = verdieping;
        this.lokaalnummer = lokaalnummer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getGebouw() {
        return gebouw;
    }

    public void setGebouw(String gebouw) {
        this.gebouw = gebouw;
    }

    public int getVerdieping() {
        return verdieping;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }

    public int getLokaalnummer() {
        return lokaalnummer;
    }

    public void setLokaalnummer(int lokaalnummer) {
        this.lokaalnummer = lokaalnummer;
    }
}
