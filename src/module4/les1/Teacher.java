package module4.les1;

import java.time.LocalDate;

public class Teacher extends Persoon {

    private int teacherNR;

    public Teacher(String naam, LocalDate dateOfBirth, int teacherNR) {
        super(naam, dateOfBirth);
        this.teacherNR = teacherNR;
    }
}
