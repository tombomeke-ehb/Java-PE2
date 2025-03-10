package module4.Vormen;

public class Vierkant extends Vorm{
    private double zijde;

    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    public Vierkant(String kleur, double zijde) {
        super(kleur);
        this.zijde = zijde;
    }

    @Override
    public String toString() {
        return "Vierkant{" +
                "zijde=" + zijde +
                "} " + super.toString();
    }

    @Override
    public double berekenOppervlakte() {
        return zijde * zijde;
    }
}
