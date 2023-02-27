package org.example;
import java.util.Scanner;  // Import the Scanner class
import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class cviko2 {

    public static void getZnamenie (LocalDate dateOfBirth) {
        String[] zodiacNames = {
                "Aries", "Taurus", "Gemini",
                "Cancer", "Leo", "Virgo",
                "Libra", "Scorpio", "Sagittarius",
                "Capricorn", "Aquarius", "Pisces"
        };
        int[] FirstMonth = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2};
        int[] LastMonth = {4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3};
        int[] FirstDay = {21, 20, 21, 21, 23, 23, 23, 23, 22, 21, 21, 19};
        int[] LastDay = {19, 20, 20, 22, 22, 22, 22, 21, 21, 20, 18, 20};

        for (int i = 0; i < FirstDay.length; i++) {
            if (dateOfBirth.isAfter((LocalDate.of(0, FirstMonth[i], FirstDay[i]))) && (dateOfBirth.isBefore(LocalDate.of(0, LastMonth[i], LastDay[i])))) {
                System.out.println("Your zodiac is " + zodiacNames[i] + "!");
            }
        }
    }
    public static void main (String[] args) {

        // uloha 1. - ZODIAC SIGNS

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String[] poleMenu = {"Zodiac","User valued pole","Pole init.fill","Sort","Determinant"};
        System.out.println("MENU:");
        for (int i = 0; i < poleMenu.length; i++) {
            System.out.println(i+" "+poleMenu[i]);
        }

        int userChoice = myObj.nextInt();

        switch(userChoice) {
            case 1:
                while(true) {
                    System.out.print("enter month of birth:");
                    int monthOfBirth = myObj.nextInt();

                    System.out.print("enter day of birth:");
                    int dayOfBirth = myObj.nextInt();
                    myObj.nextLine();

                    LocalDate dateOfBirth = LocalDate.of(0, monthOfBirth, dayOfBirth);

                    getZnamenie(dateOfBirth);

                    System.out.println("Wanna continue?[yes/no]:");
                    String userAnswer = myObj.nextLine();

                    if (userAnswer.equalsIgnoreCase("no")) {
                        break;
                    }
                }
                break;
            case 2: {
                int pole[] = new int[5];
                for (int i = 0; i<pole.length; i++) {
                    System.out.println("enter value to index "+i+":");
                    pole[i] = myObj.nextInt();
                }
                System.out.println("printing out all values...");
                for (int j : pole) {    // !
                    System.out.println(j);
                }


            }
            break;

            case 3: {
                // pole init random values
                int[] randomPole = new int[10];
                for (int i = 0; i<randomPole.length; i++) {
                    int randomNumber =  ThreadLocalRandom.current().nextInt(-50, 50 + 1);
                    randomPole[i] = randomNumber;
                }

                for (int i = 0; i<randomPole.length; i++) {
                    System.out.println(i+". = "+randomPole[i]);
                }
                System.out.println();
                Arrays.sort(randomPole);
                Arrays.stream(randomPole).forEach(System.out::println);

            }
            break;

            case 4: {   // determinant mam pici
                int[] pole 3][3];

            }
            break;

            default:
                throw new IllegalStateException("Unexpected value: " + userChoice);
        }
    System.out.println("Ending program...");


    }
}
