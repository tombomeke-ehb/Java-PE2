package module6.Les2;

import module6.Les2.personen.Student;
import module6.Les2.personen.StudentAlfabetischOpAchternaam;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> namenLijst = new TreeSet<>();

        namenLijst.add("Joske");
        namenLijst.add("Steven");
        namenLijst.add("Amin");

        //System.out.println(namenLijst);

        TreeSet<Student> studentenLijst = new TreeSet<>();
        studentenLijst.add(new Student(LocalDate.now(), "Steven", "Deloof", 2));
        studentenLijst.add(new Student(LocalDate.now(), "Kevin", "Felix", 1));

        //System.out.println(studentenLijst);

        ArrayList<Student> studentenOmTeSorteren = new ArrayList<>();
        studentenOmTeSorteren.addAll(studentenLijst);
        studentenOmTeSorteren.add(new Student(LocalDate.now(), "Joske", "Vermeulen", 12));
        studentenOmTeSorteren.add(new Student(LocalDate.now(), "Tom", "Dekoning", 8));
        studentenOmTeSorteren.add(new Student(LocalDate.now(), "Luke", "Solo", 45));

        //Standaard Sorteren op studentnr Collections.sort(studentenOmTeSorteren);
        Collections.sort(studentenOmTeSorteren, new StudentAlfabetischOpAchternaam()); //Sorteren op achternaam
        //System.out.println(studentenOmTeSorteren);

        //Landa arrow functie te gebruiken in Java
        Collections.sort(studentenOmTeSorteren, (o1, o2) -> {
            return o1.getAchternaam().compareTo(o2.getAchternaam());
        });

        Collections.shuffle(studentenOmTeSorteren);
        //System.out.println(studentenOmTeSorteren);

        HashMap<String, String> autoVerhuur = new HashMap<>();
        autoVerhuur.put("123ABC", "Toyota");
        autoVerhuur.put("456ABC", "Volvo");
        autoVerhuur.put("789DRC", "Volkswagen");
        autoVerhuur.put("789ABC", "Ford Fiesta");

        //autoVerhuur.remove("123ABC");
        for(String key : autoVerhuur.keySet()) {
            System.out.println(autoVerhuur.get(key));
        }

        for(Map.Entry<String, String> element : autoVerhuur.entrySet()) {
            //System.out.println(element.getKey());
        }

        String ingevoerdeNrPlaat = "AB";
        for(String key : autoVerhuur.keySet()) {
            if(key.contains(ingevoerdeNrPlaat)) {
                //System.out.println("Gevonden " + autoVerhuur.get(key));
                break;
            }
        }

        //System.out.println(autoVerhuur);
    }
}
