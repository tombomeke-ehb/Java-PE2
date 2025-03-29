package module4.Oefeningen.medium2;

public class Student extends Persoon{
    private int studentennummer;
    private String specialisatie;


    public Student(String naam, String achternaam, int leeftijd, int studentennummer, String specialisatie){
        super(naam, achternaam, leeftijd);
        this.studentennummer = studentennummer;
        this.specialisatie = specialisatie;
    }

    public void wijzigStudentToe(Student.getNaam()){
        for (int i = 0; i < array.length; i++) {
            Student.getNaam() = array[i];
        }
    }
}
