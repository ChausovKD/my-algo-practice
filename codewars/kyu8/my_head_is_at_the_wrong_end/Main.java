package kyu8.my_head_is_at_the_wrong_end;

/*
    Task: My head is at the wrong end! (8 kyu)
    URL: https://www.codewars.com/kata/56f699cd9400f5b7d8000b55

    Description: You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone
    and switched their heads and tails around! Save the animals by switching them back. You will be given an array which
    will have three values (tail, body, head). It is your job to re-arrange the array so that the animal is the right
    way round (head, body, tail). Same goes for all the other arrays/lists that you will get in the tests: you have to
    change the element positions with the same exact logics.

    Input: {"head", "body", "tail"}
    Output: {"tail", "body", "head"}

    Input: {"top", "middle", "bottom"}
    Output: {"bottom", "middle", "top"}
*/

import java.util.Arrays;

public class Main {

    public static String[] fixTheMeerkat(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fixTheMeerkat(new String[] {"head", "body", "tail"})));
        System.out.println(Arrays.toString(fixTheMeerkat(new String[] {"heads", "body", "tails"})));
        System.out.println(Arrays.toString(fixTheMeerkat(new String[] {"top", "middle", "bottom"})));
    }
}
