package main.module1;

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        //H1: meer logica
        //
        //Vraag twee getallen aan de gebruiker. Zoek de grootste gemene deler van deze twee getallen en druk deze af in je console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int getal1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number");
        int getal2 = Integer.parseInt(scanner.nextLine());

        int smallGetal = (getal1 < getal2)? getal1 : getal2;

        for (int i = smallGetal; i >= 1; i--) {
            if (getal1 % i == 0 && getal2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}