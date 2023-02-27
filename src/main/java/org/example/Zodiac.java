package org.example;
import java.time.LocalDate;

public class Zodiac {
    String name;
    LocalDate dateFirst;
    LocalDate dateLast;

    void set(String name, LocalDate dateFirst, LocalDate dateLast) {
        this.name = name;
        this.dateFirst = dateFirst;
        this.dateLast = dateLast;
    }
    void get() {
        System.out.printf(this.name+": from "+dateFirst+", to "+dateLast);
    }
}

/*
https://stackoverflow.com/questions/48839053/how-to-use-multiple-classes-in-java-in-one-file
https://www.javatpoint.com/object-and-class-in-java

You can only have one public top-level class per file. So, remove the public from all but one (or all) of the classes.

However, there are some surprising problems that can happen if you have multiple classes in a file. Basically, you can get into trouble by (accidentally or otherwise) defining multiple classes with the same name in the same package.

If you're just a beginner, it might be hard to imagine what I'm going on about. The simple rule to avoid the problems is: one class per file, and call the file the same thing as the class it declares.


 */
