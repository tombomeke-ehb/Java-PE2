package module2.Oplossingen;

public class Medium {
    public static void main(String[] args) {
        /*
        M1: Door de hele lijst
        Maak een array aan waar je vijf verschillende gehele getallen in plaatst.
        Schrijf vervolgens code uit om de gemiddelde waarde van deze getallen te berekenen.
         */
        double totaal = 0;
        int[] array = {1, 8, 4, 3, 6};
        for(int i = 0; i < array.length; i++){
            totaal += array[i];
        }
        double gemmiddelde = totaal/array.length;
        System.out.println(gemmiddelde);
    }
}
