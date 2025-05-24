package module2.Oefeningen;

/*
E2: test strings

Maak twee Strings aan, in de eerste plaats je “the quick brown fox” en in de tweede “Jumps over the lazy dog”. Voeg beide strings samen tot een nieuwe string.

Vervang in de vorige String het woord “fox” door “cat”. Zoek hiervoor op welke functie je kan gebruiken.
 */

public class Easy2 {
    public static void main(String[] args) {
        String string1 = "the quick brown fox ";
        String string2 = "Jumps over the lazy dog";

        String newstring = string1.replace("fox", "cat");

        System.out.println(newstring.concat(string2));
    }
}
