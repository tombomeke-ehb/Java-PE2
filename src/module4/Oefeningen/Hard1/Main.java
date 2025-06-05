package module4.Oefeningen.Hard1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dier[] kooi = new Dier[10];
        Dier[] vijver = new Dier[10];
        int kooiIndex = 0;
        int vijverIndex = 0;

        Dier eend = new Eend(LocalDate.now());
        Dier tijger = new Tijger(LocalDate.now());
        Dier pinguin = new Pinguin(LocalDate.now());
        Dier slang = new Slang(LocalDate.now());
        Dier kikker = new Kikker(LocalDate.now());
        Dier vleermuis = new Vleermuis(LocalDate.now());

        Dier[] alleDieren = { eend, tijger, pinguin, slang, kikker, vleermuis};

        System.out.println("Kooi:");
        for (Dier dier : alleDieren){
            if (dier instanceof Vlieg && kooiIndex < kooi.length){
                kooi[kooiIndex++] = dier;
                dier.maakGeluid();
            }
        }

        System.out.println("");
        System.out.println("");


        System.out.println("Vijver");
        for (Dier dier : alleDieren){
            if (dier instanceof Zwem && vijverIndex < vijver.length){
                vijver[vijverIndex++] = dier;
                dier.maakGeluid();
            }
        }
    }
}
