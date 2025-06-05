package module6.Oefeningen.Easy2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Studenten {
    private String naam;
    private List<String> studentenlijst;

    public Studenten(String naam) {
        this.naam = naam;
        this.studentenlijst = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<String> getStudentenlijst() {
        return studentenlijst;
    }

    public void setStudentenlijst(List<String> studentenlijst) {
        this.studentenlijst = studentenlijst;
    }

    public void shuffleLijst(){
        Collections.shuffle(studentenlijst);
        System.out.println(studentenlijst);
    }
}
