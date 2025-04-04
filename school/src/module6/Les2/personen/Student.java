package module6.Les2.personen;

import java.time.LocalDate;

public class Student implements Comparable<Student>{

    private LocalDate geboorteDatum;
    private String voornaam;
    private String achternaam;
    private int studentennr;

    public Student(){

    }

    public Student(LocalDate geboorteDatum, String voornaam, String achternaam, int studentennr) {
        this.geboorteDatum = geboorteDatum;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.studentennr = studentennr;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getStudentennr() {
        return studentennr;
    }

    public void setStudentennr(int studentennr) {
        this.studentennr = studentennr;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.studentennr - otherStudent.studentennr;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", studentennr=" + studentennr +
                '}';
    }
}
