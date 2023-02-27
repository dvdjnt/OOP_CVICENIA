package org.example;


public class cviko3 {
    public static class Student {
        int id;
        String meno;
        String priezvisko;
        int vek;

        // constructor
         Student(int id, String meno, String priezvisko, int vek){
            this.id = id;
            this.meno = meno;
            this.priezvisko = priezvisko;
            this. vek = vek;
        }

        void Vypis(){
            System.out.println(this.id+", "+this.meno+" "+this.priezvisko+", "+this.vek+" rokov");
        }
    }
    public static void main (String[] args) {
        System.out.println("nehehehe");
        Student jozo = new Student(111683,"Jozko","Vajda",41);
        jozo.Vypis();
    }


}
