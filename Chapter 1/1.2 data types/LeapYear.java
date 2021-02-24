/******************************************************************************
 *  Compilation:  javac LeapYear.java
 *  Execution:    java LeapYear n
 *
 *  Prints true if n corresponds to a leap year, and false otherwise.
 *  Assumes n >= 1582, corresponding to a year in the Gregorian calendar.
 *
 *  % java LeapYear 2004
 *  true
 *
 *  % java LeapYear 1900
 *  false
 *
 *  % java LeapYear 2000
 *  true
 *
 ******************************************************************************/


public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        // Check if the year is divisible by 4
        isLeapYear = (year % 4 == 0);

        // Check if it is not divisible by 100 and also divisible by 4
        isLeapYear = isLeapYear && (year % 100 != 0);

        // Check if it is as described before unless it is divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        // Conditional to tell us if the year is a leap year or not
        if (isLeapYear && (year != 2020)) {
            System.out.println(year + " is a leap year");
        } else if (year == 2020) {
            System.out.println("Oh God it's " + year + ". Get in the bunker!");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
