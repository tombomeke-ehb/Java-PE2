package module4.Oefeningen.Medium2;

import module3.Oefeningen.Adres;

public class Main {
    public static void main(String[] args) {
        // Maak een adres aan
        Adres adres = new Adres("Nijverheidskaai", 170, 1000, 1200, "Brussel");

        // Maak een lokaal aan met het adres, blok, verdieping en lokaalnummer
        Lokaal lokaal1 = new Lokaal(adres, "B", 2, 204);

        // Maak een docent aan
        Docent docent = new Docent("Tom", "Peeters", lokaal1, "Informatica");

        // Maak wat studenten aan
        Student student1 = new Student("Lisa", "Janssens", 1001, "Informatica");
        Student student2 = new Student("Ahmed", "El Idrissi", 1002, "Informatica");
        Student student3 = new Student("Marie", "Dubois", 1003, "Informatica");

        // Voeg studenten toe aan de docent
        docent.voegStudentToe(student1);
        docent.voegStudentToe(student2);
        docent.voegStudentToe(student3);

        // Toon info over de docent en zijn studenten
        System.out.println("Docent: " + docent.getVoornaam() + " " + docent.getAchternaam());
        System.out.println("Specialisatie: " + docent.getSpecialisatie());
        System.out.println("Studenten:");

        // Print de studenten
        for (int i = 0; i < docent.getStudenten().length; i++) {
            Student s = docent.getStudenten()[i];
            if (s != null) {
                System.out.println("- " + s.getVoornaam() + " " + s.getAchternaam() + " (nr: " + s.getStudentennummer() + ")");
            }
        }
    }
}
