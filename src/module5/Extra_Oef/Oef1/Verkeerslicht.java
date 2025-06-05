package module5.Extra_Oef.Oef1;

public enum Verkeerslicht {
    ROOD("Stop"), ORANJE("Voorzichtig"), GROEN("Rijden");

    private String actie;

    private Verkeerslicht(String actie){
        this.actie = actie;
    }

    public void setActie(String actie) {
        this.actie = actie;
    }

    public String getActie(){
        return actie;
    }
}
