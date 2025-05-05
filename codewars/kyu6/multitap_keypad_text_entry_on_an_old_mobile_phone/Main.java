package kyu6.multitap_keypad_text_entry_on_an_old_mobile_phone;

/*
    Task: Multi-tap Keypad Text Entry on an Old Mobile Phone (6 kyu)
    URL: https://www.codewars.com/kata/54a2e93b22d236498400134b

    Description: Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS messages on
    candybar-shaped feature phones with 3x4 numeric keypads.
                                ------- ------- -------
                                |     | | ABC | | DEF |
                                |  1  | |  2  | |  3  |
                                ------- ------- -------
                                ------- ------- -------
                                | GHI | | JKL | | MNO |
                                |  4  | |  5  | |  6  |
                                ------- ------- -------
                                ------- ------- -------
                                |PQRS | | TUV | | WXYZ|
                                |  7  | |  8  | |  9  |
                                ------- ------- -------
                                ------- ------- -------
                                |  *  | |space| |  #  |
                                |     | |  0  | |     |
                                ------- ------- -------
    Prior to the development of T9 systems (predictive text entry), the method to type words was called "multi-tap" and
    involved pressing a button repeatedly to cycle through all its possible values, in order. For example:
    - Pressing the button 7 repeatedly will cycle through the letters P -> Q -> R -> S -> 7 -> P -> ....
    - Pressing the button 0 is cycling through SPACE -> 0 -> SPACE -> 0 -> ....
    - Buttons with a single symbol on it just type this symbol.
    A character is "locked in" and inserted into the message once the user presses a different key or pauses for a short
    period of time (thus, no extra button presses are required beyond what is needed for each letter individually). For
    example:
    - To type a letter "R" you would press the 7 key three times (as the screen display for the current character cycles
    through P->Q->R->S->7).
    - To type in a digit 3, you would press the button 3 four times.
    - To type in the message "ABC", you would press the button 2 once, wait a second, then press the button 2 twice to
    enter the letter B, then pause for another second, and press the button 2 three times, to enter the letter C. You
    would have to press the button 2 six times in total.

    In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to actually do 47 button presses. No
    wonder they abbreviated...

    For this assignment, write code that can calculate the amount of button presses required for any phrase, with the
    following requirements:
    - Punctuation can be ignored for this exercise.
    - Likewise, the phone doesn't distinguish between upper and lowercase characters (but you should allow your module
    to accept input in either form, for convenience).
    - Tested phrases contain letters (A-Z and a-z), digits (0-9), and special characters # and *.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static int presses1(String phrase) { // O(l), l - "phrase" string length
//        final String[] KEYBOARD_SYMBOLS = {"1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "*",
//              " 0", "#"};

        final String KEYBOARD_SYMBOLS = "1____abc2_def3_ghi4_jkl5_mno6_pqrs7tuv8_wxyz9*____ 0___#";
        int counter = 0;
        for (char symbol : phrase.toLowerCase().toCharArray()) {
            counter += (KEYBOARD_SYMBOLS.indexOf(symbol) + 1) % 5; // O(l), l - "phrase" string length
        }
        return counter;
    }

    static private final List<String> KEYBOARD_SYMBOLS = Arrays.asList("1", "abc2", "def3", "ghi4", "jkl5", "mno6",
            "pqrs7", "tuv8", "wxyz9", "*", " 0", "#");
    static private final Map<Character,Integer> KEYBOARD_SYMBOLS_MAP = new HashMap<>();
    static private int DEFAULT_COUNT = 0;
    static {
        for (String button : KEYBOARD_SYMBOLS) {
            for (int i = 0; i < button.length(); i++)
                KEYBOARD_SYMBOLS_MAP.put(button.charAt(i), i + 1);
        }
    }

    public static int presses2(String phrase) { // O(l), l - "phrase" string length
        int counter = 0;
        for (int i = 0; i < phrase.length(); i++) // O(l), l - "phrase" string length
            counter += KEYBOARD_SYMBOLS_MAP.getOrDefault(Character.toLowerCase(phrase.charAt(i)), DEFAULT_COUNT); // O(1)
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(presses1("Hello"));
        System.out.println(presses1("c"));
        System.out.println(presses1(" "));
        System.out.println(presses1("a"));
        System.out.println(presses1("d"));
        System.out.println(presses1("WHERE DO U WANT 2 MEET L8R"));

        System.out.println(presses2("Hello"));
        System.out.println(presses2("c"));
        System.out.println(presses2(" "));
        System.out.println(presses2("a"));
        System.out.println(presses2("d"));
        System.out.println(presses2("WHERE DO U WANT 2 MEET L8R"));
    }
}
