package main.module4;

import java.time.LocalDate;

public class Persoon {

    private String naam;
    private LocalDate dateOfBirth;

    public Persoon(String naam, LocalDate dateOfBirth) {
        this.naam = naam;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
