package kyu6.bouncing_balls;

/*
    Task: Bouncing Balls (6 kyu)
    URL: https://www.codewars.com/kata/5544c7a5cb454edb3c000047

    Description: A child is playing with a ball on the nth floor of a tall building. The height of this floor above
    ground level, h, is known. He drops the ball out of the window. The ball bounces (for example), to two-thirds of its
    height (a bounce of 0.66). His mother looks out of a window 1.5 meters from the ground. How many times will the
    mother see the ball pass in front of her window (including when it's falling and bouncing)?
    Three conditions must be met for a valid experiment:
        - Float parameter "h" in meters must be greater than 0
        - Float parameter "bounce" must be greater than 0 and less than 1
        - Float parameter "window" must be less than h.
    If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
    The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.

    h = 3, bounce = 0.66, window = 1.5, result is 3
    h = 3, bounce = 1, window = 1.5, result is -1

    (Condition 2) not fulfilled.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
    }

    public static int bouncingBall(double h, double bounce, double window) {
        int count = -1;
        if (h > 0 && (bounce > 0 && bounce < 1) && window < h) {
            while (h > window) {
                h *= bounce;
                count += 2;
            }
        }
        return count;
    }
}
