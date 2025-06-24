package module7.Oefeningen.Easy1;

public class Boek {
    private final int isbn;
    private String titel;

    public Boek(String titel, int isbn) {
        this.titel = titel;
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Boek)) return false;
        Boek ander = (Boek) obj;
        return this.isbn == ander.isbn && this.titel.equals(ander.titel);
    }
}
