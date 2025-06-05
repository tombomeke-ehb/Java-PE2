package module5.Medium;

public class Main {
    public static void main(String[] args) {
        Kaart[][] kaarten = new Kaart[4][13];

        Kleur[] kleuren = Kleur.values();
        Waarde[] waarden = Waarde.values();

        for(int i = 0; i < kleuren.length; i++){
            for(int j = 0; j < waarden.length; i++){
                kaarten[i][j] = new Kaart(waarden[j], kleuren[i]);
            }
        }
    }
}