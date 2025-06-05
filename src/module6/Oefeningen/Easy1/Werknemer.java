package module6.Oefeningen.Easy1;

import java.util.TreeSet;

public class Werknemer{
    private String naam;
    private TreeSet<String> skills;

    public Werknemer(String naam) {
        this.naam = naam;
        this.skills = new TreeSet<>();
    }

    public boolean voegSkillToe(String skill){
        return skills.add(skill);
    }

    public boolean verwijderSkill(String skill){
        return skills.remove(skill);
    }
}
