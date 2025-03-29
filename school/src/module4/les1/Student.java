package module4.les1;

import java.time.LocalDate;

public class Student extends Persoon {

    private int studentNR;

    public Student(String naam, LocalDate dateOfBirth, int studentNR) {
        super(naam, dateOfBirth);
        this.studentNR = studentNR;
    }

    public int getStudentNR() {
        return studentNR;
    }

    @Override
    public String toString() {
        return getNaam() + " Geboren op: " + getDateOfBirth() + " student Nummer " + getStudentNR();
    }
}