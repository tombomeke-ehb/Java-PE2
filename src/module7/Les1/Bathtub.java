package module7.Les1;

public class Bathtub {

    private String naam;

    public Bathtub(String naam) {
        this.naam = naam;
    }

    private int temperature;

    private boolean checkOperational(){
        return true;
    }

    public int heat(int temp, int liter) throws DomoticaDeviceNotOperational, TemperatureTooHighException, TemperatureTooLowException {

        if(checkOperational())
        {
            throw new DomoticaDeviceNotOperational(this);
        }

        if(temperature>40){
            throw new TemperatureTooHighException();
        }else if(temperature<-40){
            throw new TemperatureTooLowException();
        }
        temperature += temp;
        return temperature;
    }

    public String getNaam() {
        return naam;
    }
}

/*
private int temperature;

    private boolean checkOperational(){
        return true;
    }

    public int heat(int temp, int liter){

        if(checkOperational())
        {
            try{
                throw new DomoticaDeviceNotOperational();
            } catch (DomoticaDeviceNotOperational e) {
                System.out.println("Doe iets");
            }
        }
        temperature += temp;
        return temperature;
    }
 */