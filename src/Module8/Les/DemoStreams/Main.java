package Module8.Les.DemoStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student mStudent = new Student(1, "Jef", "Vermeulen");
        Adress mAdress = new Adress("Nijverheidskaar", "170", 1070);
        mStudent.setAdress(mAdress);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.data"))) {

            oos.writeObject(mStudent);

        } catch (IOException e) {
            System.err.println("Probleem met wegschrijven, probeer het opnieuw!");
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.data"))){
            Student ingelezenStudent = (Student) ois.readObject();
            System.out.println(ingelezenStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Probleem met lezen van het bestand");
        }

        String text = "Hello World!";
        /*
        try {
            FileWriter writer =  new FileWriter("file.txt");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */


        /*
        // Try with resources -> auto closable
        try( FileReader reader = new FileReader("file.txt");
             BufferedReader bufferReader = new BufferedReader(reader);) {


            String inhoud = bufferReader.readLine();
            System.out.println(inhoud);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Probleem met bestand");
        }

         */
    }
}
