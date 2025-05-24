package module4.Oplossingen.Medium1;

public class Main {
    public static void main(String[] args) {
        Huisdier dier1 = new Huisdier(10, 14, "Joupy");
        System.out.println(dier1);
        Hond Caline = new Hond(15, 8, "Caline", 580);
        System.out.println(Caline);
        System.out.println(dier1.getNaam());
    }
}
