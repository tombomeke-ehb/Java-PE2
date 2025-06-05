package module4.Oefeningen.Medium2;

import module3.Oefeningen.Adres;

public class Lokaal {
    private Adres adres;
    private String blok;
    private int verdieping;
    private int lokaalnummer;

    public Lokaal() {
    }

    public Lokaal(Adres adres, String blok, int verdieping, int lokaalnummer) {
        this.adres = adres;
        this.blok = blok;
        this.verdieping = verdieping;
        this.lokaalnummer = lokaalnummer;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
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
