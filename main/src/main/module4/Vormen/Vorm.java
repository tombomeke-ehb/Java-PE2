package main.module4.Vormen;

public abstract class Vorm{

    //properties, welke informatie houden we bij?
    private String kleur;

    //functions, wat moet ik kunnen uitvoeren
    public Vorm(){
        this.kleur = "Zwart";
    }

    public Vorm(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return "Vorm kleur: " + kleur;
    }

    public abstract double berekenOppervlakte();
}
