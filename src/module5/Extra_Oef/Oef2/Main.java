package module5.Extra_Oef.Oef2;

public class Main {
    public static void main(String[] args) {
        Kaart[] kaarten = new Kaart[52];

        Kleur[] kleuren = Kleur.values();
        Waarde[] waarden = Waarde.values();

        int index = 0; // deze moet buiten de lus staan

        for (int i = 0; i < kleuren.length; i++) {
            for (int j = 0; j < waarden.length; j++) {
                kaarten[index] = new Kaart(kleuren[i], waarden[j]);
                index++; // pas nadat je de kaart in de array hebt gestoken
            }
        }

        // Test: alle kaarten printen
        for (Kaart kaart : kaarten) {
            System.out.println(kaart.getWaarde() + " van " + kaart.getKleur());
        }
    }
}
