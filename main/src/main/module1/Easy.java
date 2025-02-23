package main.module1;

public class Easy {
    public static void main(String[] args) {
        //E1: loops en selecties
        //
        //Schrijf code waarmee je alle even getallen tussen 36 en 60 kan afdrukken. Maak hiervoor gebruik van een for loop.
        //
        //Als je vorige oplossing werkt probeer je dit opnieuw met een while loop
        for(int getal = 36; getal<=60; getal++){
            if(getal % 2 == 0){
                System.out.println(getal);
            }
        }
    }
}