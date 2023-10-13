package org.example;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    static Apple sharedApple;  // class variable - shared within package

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        int howMany;    // 32 bits (4 bytes)
        long howManyStars = 1000000000;
        short howManyPeople = 100;
        byte howManyApples = 20;
        char itsReallyACharacter;

        String longString = "Looooooooooong String!";
        String shortString = "Smol";

        Apple a = new Apple();  // a is local - not share with anyone
        Apple b = new Apple(1, "Crabapple", "Reddish-pink", "Early August");


        System.out.println(a);
        System.out.println(b);

        Apple myApples[] = new Apple[3];
        myApples[0] = new Apple(1, "Crabapple", "Reddish-pink", "Early August");
        myApples[1] = new Apple(.5f, "RottenApple", "Brown", "Early August");
        myApples[2] = new Apple(1.5f, "Crabapple", "Reddish-pink", "Early August");

        // Sort out the rotten ones!
        // for-each
        // New style is all about the apples
        for ( Apple apple: myApples) {
            if( ! apple.variety.equals("RottenApple") ) continue;  // Ignore good apples
            System.out.println(apple);
        }

        // Old style loop is all about the index!
        for ( int i = 0; i<myApples.length; i++){
            if (i == 0) continue;   // Ignore the FIRST apple
            System.out.println(myApples[i]);
        }

        // Operators

        // Logical
        // &&  ||  !

        // Numeric comparisons produce boolean result
        // <  >  == != >= <=

        if (howManyPeople <= howManyStars && howManyPeople <= howManyApples) {

            System.out.println("Everybody gets a star!");
            System.out.println("... and an APPLE!");

        } else if (howManyPeople <= howManyStars && howManyPeople > howManyApples) {
            System.out.println("Everybody gets a star!");
            System.out.println("... but NOT an APPLE!!!");
        } else {
            System.out.println("Not enough stars!  We need more stars!");
        }

        // Arithmetic   + - * / %

        // Increment and decrement
        // ++  --  prefix or postfix

        howMany = 15;
        System.out.println(++howMany);   // 16
        System.out.println(howMany++);   // prints 16, value is now 17

        if (longString.length() < shortString.length()) {
            System.out.println("The world is upside down...");
        }

        // Statements end with a semicolon
        int y;   // declaration statement
        y = 12;  // assignment
        System.out.println(y);  // Method invocation
        // etc....

    }



}

