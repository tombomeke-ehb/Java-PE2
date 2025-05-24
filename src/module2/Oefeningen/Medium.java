package module2.Oefeningen;

/*

M1: Door de hele lijst

Maak een array aan waar je vijf verschillende gehele getallen in plaatst. Schrijf vervolgens code uit om de gemiddelde waarde van deze getallen te berekenen.
 */

public class Medium {
    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] = 5;
        array[1] = 8;
        array[2] = 1;
        array[3] = 6;
        array[4] = 7;


        double som = 0;
        for (int i = 0; i < array.length; i++){
            som += array[i];
        }
        System.out.println(som/array.length);
    }
}
