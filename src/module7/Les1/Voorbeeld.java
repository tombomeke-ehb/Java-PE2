package module7.Les1;

import java.sql.Connection;
import java.sql.SQLException;

public class Voorbeeld {

    public static void geefException() throws TemperatureTooHighException{
        throw new TemperatureTooHighException();
    }

    public static void callGeefException(){
        try {
            geefException();
        } catch (TemperatureTooHighException e) {
            System.out.println("IETS");
        }
    }


    public static void doeiets(String iets) {
        iets.toUpperCase();
    }

    public static int geefResultaat(int g1, int g2) {
        int result;
        try {
            result = g1 / g2;
        } catch (ArithmeticException e) {
            return -1;
        }
        return result;
    }

    public static void main(String[] args) { /*throws SQLException {
       /* Object o = new Hond();
        try {
            Stoel s = (Stoel) o;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }*/
        /*
        try{
            System.out.println(5/0);
        } catch (ArithmeticException e){
            System.out.println("0");
        }*/
    /*
        System.out.println(geefResultaat(5, 0));

        Connection c = null;

        try {
            c.prepareStatement("select * from users");
            System.out.println("dpe nog iets");
            System.out.println("doe nog iets 2");
        } catch (SQLException e) {
            throw e;
        } finally {
            c.close();
        }

        return;
    }
    */
            geefException();


    }
}
