package module2.Oefeningen;

public class Easy1 {
    public static void main(String[] args) {

        int[] lijst = new int[10];

        for(int i = 0; i < lijst.length; i++){
            lijst[i] = 5;
        }

        lijst[1] = 23;

        for(int i = 0; i < lijst.length; i++){
            System.out.println(lijst[i]);
        }
    }
}
