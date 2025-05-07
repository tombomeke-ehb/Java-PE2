package module7.Les1;

public class Main {

    public static void main(String[] args) {
        Bathtub t = new Bathtub("Bathtub 1");
        try {
            int result = t.heat(500, 20);
            System.out.println("result: " + result);
        } catch (DomoticaDeviceNotOperational | TemperatureTooHighException | TemperatureTooLowException e){
            System.out.println("Er is iets mis gegaan");
        }

    }
}
