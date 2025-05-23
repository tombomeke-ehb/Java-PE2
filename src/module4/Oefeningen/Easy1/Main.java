package module4.Oefeningen.Easy1;

import module3.Oplossingen.Adres;

public class Main {
    public static void main(String[] args) {
        Adres adres = new Adres("Konkelstraat", 96, "38", 1200, "Sint-Lambrechts-Woluwe");
        Persoon a = new Persoon("Tom", "Dekoning", adres);

        Adres adres2 = new Adres("Konkelstraat", 80, "80", 1200, "Sint-Lambrechts-Woluwe");
        Persoon b = new Persoon("Dev", "Patel", adres2);

        System.out.println(a);
        System.out.println(b);
    }
}
