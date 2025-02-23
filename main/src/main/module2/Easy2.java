package main.module2;

public class Easy2 {
    public static void main(String[] args) {
        /*
        E2: test strings

        Maak twee Strings aan, in de eerste plaats je “the quick brown fox” en in de tweede “Jumps over the lazy dog”.
        Voeg beide strings samen tot een nieuwe string.
        Vervang in de vorige String het woord “fox” door “cat”. Zoek hiervoor op welke functie je kan gebruiken.
         */
        String string1 = "the quick brown fox ";
        String string2 = "Jumps over the lazy dog";

        System.out.println(string1.concat(string2));
        String newstring = string1.replace("fox", "cat");
        System.out.println(newstring.concat(string2));
    }
}