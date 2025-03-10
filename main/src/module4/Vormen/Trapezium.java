package module4.Vormen;

public class Trapezium extends Vorm{

    private double kleineBasis, groteBasis, hoogte;

    public Trapezium(double kleineBasis, double groteBasis, double hoogte) {
        this.kleineBasis = kleineBasis;
        this.groteBasis = groteBasis;
        this.hoogte = hoogte;
    }

    public Trapezium(String kleur, double kleineBasis, double groteBasis, double hoogte) {
        super(kleur);
        this.kleineBasis = kleineBasis;
        this.groteBasis = groteBasis;
        this.hoogte = hoogte;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "kleineBasis=" + kleineBasis +
                ", groteBasis=" + groteBasis +
                ", hoogte=" + hoogte +
                "} " + super.toString();
    }

    @Override
    public double berekenOppervlakte(){
        return (kleineBasis + groteBasis)/ 2 * hoogte;
    }
}
