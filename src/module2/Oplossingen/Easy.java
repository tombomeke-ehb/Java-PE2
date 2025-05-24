package module2.Oplossingen;

public class Easy {
    /*
    E1: test arrays

Maak een array aan met 10 plaatsen waar je gehele getallen kan in bijhouden. Op deze array voer je vervolgens enkele bewerkingen uit.

    Vul de array op zodat elke index de waarde 5 bevat
    Pas de tweede waarde aan zodat dit nu 23 bevat
    Probeer op de derde index de waarde 1.5 te plaatsen, lukt dit?
    Schrijf een loop waarmee je elke waarde binnen de array kan afdrukken als “element i = waarde
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = 5;
        }
        array[1] = 23;
        for(int output : array){
            System.out.println(output);
        }
    }
}