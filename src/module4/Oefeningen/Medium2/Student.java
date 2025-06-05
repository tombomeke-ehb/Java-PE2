package module4.Oefeningen.Medium2;

public class Student extends Persoon{
    private int studentennummer;
    private String specialisatie;

    public Student(int studentennummer, String specialisatie) {
        this.studentennummer = studentennummer;
        this.specialisatie = specialisatie;
    }

    public Student(String voornaam, String achternaam, int studentennummer, String specialisatie) {
        super(voornaam, achternaam);
        this.studentennummer = studentennummer;
        this.specialisatie = specialisatie;
    }

    public int getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(int studentennummer) {
        this.studentennummer = studentennummer;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }
}
