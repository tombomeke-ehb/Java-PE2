package module7.Oefeningen.Easy1;

public class main {
    public static void main(String[] args) {
        Boek b1 = new Kookboek("De Italiaanse keuken", 12345);
        Boek b2 = new Kookboek("De Italiaanse keuken", 12345);
        Boek b3 = new Kookboek("De Italiaanse keuken", 99999);
        Boek b4 = new Biografie("De Italiaanse keuken", 12345); // andere type

        System.out.println(b1.equals(b2));
    }
}
