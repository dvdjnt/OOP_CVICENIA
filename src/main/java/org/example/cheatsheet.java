package org.example;
import java.util.Scanner;  // Import the Scanner class
import java.time.LocalDate; // import the LocalDate class
import java.util.ArrayList; // import the ArrayList class
public class cheatsheet {
    public static void main (String[] args) {
        // 1. tyzden - INPUT A BASICS ---------------------------------------------------------------
        // komentar hele
        long velke = 6000000L;
        float sBodkou = 5.28f;
        double megaVelke = 1.8889d;
        String prdolo = "ne hehehehehe";
        String texticek = "sak povedz ty nenenene";

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        /*
        nextBoolean
        nextByte
        nextDouble
        nextFloat
        nextInt
        nextLine
        nextLong
        nextShort
         */
        System.out.println("Username is: " + userName);  // Output user input

        // vypis pola
        /*
        int [] pole = new int[10];

        for (int i=0; i< pole.length; i++) {
            pole[i] = i;
        }

        for (int i=0; i<pole.length; i++) {
            vypis(pole[i]);
        }
         */

        System.out.println("cizicek ciziek povedz mi");
        System.out.println(texticek + userName + sBodkou + prdolo);
        System.out.println(userName.concat(texticek));

        LocalDate myObj1 = LocalDate.now();
        System.out.println(myObj1);
        /*
        LocalDate
        LocalTime
        LocalDateTime
        DateTimeFormatter
         */

        // arrays
        ArrayList<String> cars = new ArrayList<String>();
        cars.add(userName);
        cars.add(texticek);
        cars.add(prdolo);
        System.out.println("full list: "+cars);
        System.out.println("first element: "+cars.get(0));    // get certain element
        cars.set(0,"zedols nehehehe");  // overwrite certain element
        System.out.println("car size: "+cars.size());   // array size
        cars.remove(2);     // remove element
        System.out.println("full list: "+cars);
        cars.clear();            // clear all elements -> result empty array
        System.out.println("full list: "+cars);

        // for each loop
        ArrayList<String> veci = new ArrayList<String>();
        veci.add("prd");
        veci.add("grg");
        veci.add("mrd");
        veci.add("krk");
        for (String i : veci) {
            System.out.println(i);
        }
    }
    public static void vypis(int a) {
        System.out.println(a);
    }
}
