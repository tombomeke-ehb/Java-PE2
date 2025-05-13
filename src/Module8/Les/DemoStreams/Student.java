package Module8.Les.DemoStreams;

import java.io.Serializable;

public class Student implements Serializable {

    private int studentennr;
    private String voornaam;
    private String familienaam;
    private Adress adress;

    public Student(){}

    public Student(int studentennr, String voornaam, String familienaam) {
        this.studentennr = studentennr;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public Student(int studentennr, String voornaam, String familienaam, Adress adress) {
        this.studentennr = studentennr;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.adress = adress;
    }

    public int getStudentennr() {
        return studentennr;
    }

    public void setStudentennr(int studentennr) {
        this.studentennr = studentennr;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentennr=" + studentennr +
                ", voornaam='" + voornaam + '\'' +
                ", familienaam='" + familienaam + '\'' +
                ", adress=" + adress +
                '}';
    }
}
