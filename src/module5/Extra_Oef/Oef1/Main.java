package module5.Extra_Oef.Oef1;

public class Main {
    public static void main(String[] args) {
        for(Verkeerslicht verkeerslichten : Verkeerslicht.values()){
            System.out.println(verkeerslichten.getActie());
        }
    }
}
