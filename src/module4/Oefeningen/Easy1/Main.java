package module4.Oefeningen.Easy1;

import module3.Oefeningen.Adres;

public class Main {
    public static void main(String[] args) {
        Adres adres = new Adres("Konkelstraat", 96, 1200, 1200, "Sint-Lambrechts-Woluwe");
        Persoon persoon1 = new Persoon("Tom", "Dekoinng", adres);

        System.out.println(persoon1);
    }
}
