package module4.les2;

public class Main {
    public static void main(String[] args) {
        Object o = new Boiler("B1", 300, 30);

        if(o instanceof Apparaat b){
            System.out.println(b.getNaam());
        }
    }
}
