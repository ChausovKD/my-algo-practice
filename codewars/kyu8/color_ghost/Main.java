package kyu8.color_ghost;

/*
    Task: Color Ghost (8 kyu)
    URL: https://www.codewars.com/kata/53f1015fa9fe02cbda00111a

    Description: Create a class Ghost. Ghost objects are instantiated without any arguments. Ghost objects are given a
    random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

    Ghost ghost = new Ghost();
    ghost.getColor(); //=> random: "white" or "yellow" or "purple" or "red"
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main ghost = new Main();
        System.out.println(ghost.getColor());
    }

    private final String[] COLORS = {"white", "red", "purple", "yellow"};
    private final String color;

    public Main() {
        Random random = new Random();
        color = COLORS[random.nextInt(COLORS.length)];
    }

    public String getColor() {
        return this.color;
    }
}
