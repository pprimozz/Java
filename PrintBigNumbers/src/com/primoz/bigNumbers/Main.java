package com.primoz.bigNumbers;

import java.util.*;

/**
 * This program displays digits in big characters.
 */
public class Main {
    static final int HEIGHT = 3;
    static final int WIDTH = 7;
    // CHARMAP contains the encoding for each digit
    static final int[][] CHARMAP = {
        {1,1,1,1,1,1,0},
        {1,1,0,0,0,0,0},
        {1,0,1,1,0,1,1},
        {1,1,1,0,0,1,1},
        {1,1,0,0,1,0,1},
        {0,1,1,0,1,1,1},
        {0,1,1,1,1,1,1},
        {1,1,0,0,0,1,0},
        {1,1,1,1,1,1,1},
        {1,1,1,0,1,1,1},
    };

    public static void main(String [] args) {

        char again = 'y';

        printIntro();
        while (again == 'y' || again == 'Y') {
            String s = getString();
            printString(s);
            again = goAgain();
        }
    }

    /**
     * Prints a short introduction to the program
     */
    static void printIntro() {
        System.out.println("This program displays a number in large digits.");
    }

    /**
     * Retrieves the digits from the user as a String
     */
    static String getString() {

        String response;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        response = in.nextLine();
        System.out.println();
        response = truncateString(response);
        return response;
    }

    /**
     * Truncates the String to 8 digits if necessary
     */
    static String truncateString(String s) {

        if (s.length() > 8) {
            s = s.substring(0,8);
        }
        return s;
    }

    /**
     * Prints the number in large digits
     */
    static void printString(String s) {

        String a = getLine(s, "top");
        String b = getLegs(s, "top");
        String c = getLine(s, "mid");
        String d = getLegs(s, "bot");
        String e = getLine(s, "bot");

        System.out.println(a);
        for (int i = 0; i < HEIGHT; i++) {
            System.out.println(b);
            }
        System.out.println(c);
        for (int i = 0; i < HEIGHT; i++) {
            System.out.println(d);
            }
        System.out.println(e);
        System.out.println();
    }

    /**
     * Builds the top, middle and bottom horizontal lines
     */
    static String getLine(String s, String w) {

        int n; // Where to look in a digit's CHARMAP array (top, mid, or bot)
        char digitI; // The i-th digit from the input String
        char c; // The character to be printed to output (- or space)

        String r = " "; // Begin the line

        // Pick which entry in CHARMAP for each digit
        if (w.equals("top")) {
            n = 5;
        } else if (w.equals("bot")) {
            n = 2;
        } else {
            n = 6;
        }

        // Build the line
        for (int i = 0; i < s.length(); i++) {

            digitI = s.charAt(i);

            if (digitI >= '0' && 
                    digitI <= '9' && 
                    CHARMAP[Character.getNumericValue(digitI)][n] == 1) {
                c = '-';
            } else {
                c = ' ';
            }

            for (int j = 0; j < WIDTH; j++) {
                r = r + c;
            }
            r = r + "      ";
        }

        return r; // The finished line
    }

   /**
    * Builds the upper and lower legs
    */
   static String getLegs(String s, String w) {

        int n1; // Where to look in a digit's charmap array for the two legs
        int n2;
        char digitI; // The i-th digit in the input String
        char c1; // The character to be printed to output ('|' or space)
        char c2;

        String r = ""; // Begin the line

        // Pick the digit's entry in the CHARMAP array
        if (w.equals("top")) {
            n1 = 4;
            n2 = 0;
        } else {
            n1 = 3;
            n2 = 1;
        }

        // Build the line
        for (int i = 0; i < s.length(); i++) {

            digitI = s.charAt(i);

            // The left leg
            if (digitI >= '0' &&
                    digitI <= '9' &&
                    CHARMAP[Character.getNumericValue(digitI)][n1] == 1) {
                c1 = '|';
            } else {
                c1 = ' ';
            }

            // The right leg
            if (digitI >= '0' &&
                    digitI <= '9' &&
                    CHARMAP[Character.getNumericValue(digitI)][n2] == 1) {
                c2 = '|';
            } else {
                c2 = ' ';
            }

            r = r + c1;
            for (int j = 0; j < WIDTH; j++) {
                r = r + " ";
            }
            r = r + c2;
            r = r + "    ";
        }

        return r; // The finished line
    }

    /**
    * Asks the user whether to run program again
    */
    static char goAgain() {   

        char response;

        Scanner in = new Scanner(System.in);
        System.out.print("--> Again? [y/n] ");
        response = in.next().charAt(0);
        System.out.println();
        return response;
    }
}