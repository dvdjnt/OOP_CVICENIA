package org.example;
import java.util.Scanner;  // Import the Scanner class

public class cviko1 {
    static int porovnanie(int prve, int druhe) {    // porovnanie class
        if (prve==druhe) {
            System.out.println("cisla su rovnake");
            return 0;
        } else if (prve<druhe) {
            System.out.println("prve<druhe");
            return -1;
        } else {
            System.out.println("prve>druhe");
            return 1;
        }
    }
    public static void main (String[] args) {

        System.out.println("Hello World");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int answer = 0;
        do {
            System.out.print("zadaj prve cislo:");
            int a = myObj.nextInt();  // Read user input

            System.out.print("zadaj druhe cislo:");
            int b = myObj.nextInt();  // Read user input

            int vysledok = porovnanie(a, b);
            System.out.println("vysledok= " + vysledok);

            System.out.print("pokracovat?[yes=1; no=0]:");
            answer = myObj.nextInt();  // Read user input
        } while (answer == 1);
    }
}
