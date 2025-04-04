package module1;

public class Medium {
    public static void main(String[] args) {
        //M1: Sterrenpiramide, opnieuw. Oprechte excuses
        //
        //Maak een variabele hoogte, hiervoor gebruik je een klein geheel getal. We gaan aan de hand van hoogte een sterrenpiramide bouwen.
        // Per laag van de piramide komt er een ster bij. Dus bijvoorbeeld als hoogte gelijk is aan 4 zal de afgedrukte piramide er zo uit zien:
        //
        //    *
        //    **
        //    ***
        //    ****
        short hoogte = 4;
        String output = "";
        for(int i = 0; hoogte > i; i++){
            output += "*";
            System.out.println(output);
        }
    }
}
