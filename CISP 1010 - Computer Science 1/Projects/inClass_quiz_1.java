 /**
 * -------------------------------------------------
 * File name: inClass_quiz_1.java
 * Project name: First in class quiz
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 9-10-2018
 * -------------------------------------------------
 * 
 */

public class inClass_quiz_1
{
    public static void main(String[] args) 
    {
        // Runner runs 14km in 45 mins and 30 seconds. Average miles per hour

        //TODO how many km did the runner run in 1 minute
        double kmInMin = 14 / 45.5;

        //TODO convert the km ran in a minute to miles ran in a minute
        double mileMin = kmInMin / 1.6;

        //TODO multiply the mileMin by 60 to get the hour timespan
        double mileHour = mileMin * 60;
        System.out.println("The runners averge mile an hour is " + mileHour + " mph.");

    }
    
}