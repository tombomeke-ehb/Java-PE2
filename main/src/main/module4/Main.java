package main.module4;

import main.module4.Vormen.Trapezium;
import main.module4.Vormen.Vierkant;
import main.module4.Vormen.Vorm;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher firstTeacher = new Teacher("David Van Steertegem", LocalDate.parse("1986-06-29"), 1);

        Student firstStudent = new Student("David Lastigaart", LocalDate.now(), 1);

        System.out.println(firstStudent);

        Trapezium trapje = new Trapezium(2, 3, 1.5);
        System.out.println(trapje.berekenOppervlakte());
        System.out.println(trapje);

        Vierkant vierkant = new Vierkant(5);
        System.out.println(vierkant.berekenOppervlakte());
        System.out.println(vierkant);
    }
}
