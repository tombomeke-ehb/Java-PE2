package Module8.Les.DemoStreams;

import java.io.Serializable;

public class Adress implements Serializable{

    private String streetname;
    private String number;
    private int zip;

    public Adress(){}

    public Adress(String streetname, String number, int zip) {
        this.streetname = streetname;
        this.number = number;
        this.zip = zip;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }



    @Override
    public String toString() {
        return "Adress{" +
                "streetname='" + streetname + '\'' +
                ", number='" + number + '\'' +
                ", zip=" + zip +
                '}';
    }
}
