package kyu8.remove_the_time;

/*
    Task: Remove the time (8 kyu)
    URL: https://www.codewars.com/kata/56b0ff16d4aa33e5bb00008e3

    Description: You're re-designing a blog, and the blog's posts have the Weekday Month Day, time format for showing
    the date and time when a post was made, e.g., Friday, May 2, 7pm. You're running out of screen real estate, and on
    some pages you want to display a shorter format, Weekday Month Day that omits the time. Write a function that takes
    the website date/time in its original string format and returns the shortened format.

    Input: "Friday May 2, 9am"
    Output: "Friday May 2"

    Input: "Tuesday January 29, 10pm"
    Output: "Tuesday January 29"
*/

public class Main {

    public static String shortenToDate(String longDate) {
        return longDate.split(",")[0];
    }

    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 9am"));
        System.out.println(shortenToDate("Tuesday January 29, 10pm"));
    }
}
