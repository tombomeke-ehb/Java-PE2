package module6.Les2.personen;

import java.util.Comparator;

public class StudentAlfabetischOpAchternaam implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAchternaam().compareTo(o2.getAchternaam());
    }
}
