package module4.Oefeningen.Medium2;

public class Docent extends Personeelslid{
    private String specialisatie;
    Student[] studenten = new Student[10];
    private int aantalStudenten = 0;

    public Docent(Lokaal lokaal, String specialisatie) {
        super(lokaal);
        this.specialisatie = specialisatie;
    }

    public Docent(String voornaam, String achternaam, Lokaal lokaal, String specialisatie) {
        super(voornaam, achternaam, lokaal);
        this.specialisatie = specialisatie;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public Student[] getStudenten() {
        return studenten;
    }

    public void setStudenten(Student[] studenten) {
        this.studenten = studenten;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    public void voegStudentToe(Student student){
        if (aantalStudenten < studenten.length){
            studenten[aantalStudenten] = student;
            aantalStudenten++;
        } else {
            System.out.println("Kan geen studenten meer toevoegen");
        }
    }
}