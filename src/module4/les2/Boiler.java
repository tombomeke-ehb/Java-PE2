package module4.les2;

public class Boiler extends Apparaat {
    private int idealTemp;

    public int getIdealTemp() {
        return idealTemp;
    }

    public void setIdealTemp(int idealTemp) {
        this.idealTemp = idealTemp;
    }

    public Boiler(String naam, int verbruik, int idealTemp) {
        super(naam, verbruik);
        idealTemp = idealTemp;


    }
}
