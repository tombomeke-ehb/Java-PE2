package module2;

import java.time.LocalDate;

public class Hard {
    public static void main(String[] args) {
        /*
        H1: Afsprakenkalender
        Start met het maken van een array waar je 5 datums kan in bijhouden. Vervolgens ga je deze opvullen met fictieve doktersafspraken.
        Voor het eerste element in de lijst neem je de datum vandaag. Elk volgend element is 15 dagen verder.
         */
        LocalDate[] array = new LocalDate[5];
        int days = 15;
        array[0] = LocalDate.now();
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1].plusDays(15);
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
