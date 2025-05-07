package module7.Les1;

public class DomoticaDeviceNotOperational extends Exception{

    private Bathtub bath = null;

    public DomoticaDeviceNotOperational(Bathtub bath) {
        super("Dit Domotica Device is niet operationeel " + bath.getNaam());
        this.bath = bath;
    }

    public String getNameDevice() {
        return bath.getNaam();
    }
}
