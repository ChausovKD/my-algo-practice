package kyu7.two_fighters_one_winner;

/*
    Task: Two fighters, one winner (7 kyu)
    URL: https://www.codewars.com/kata/577bd8d4ae2807c64b00045b

    Description: Create a function that returns the name of the winner in a fight between two fighters. Each fighter
    takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having
    health <= 0. Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
    Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the
    Fighter objects. Your function also receives a third argument, a string, with the name of the fighter that attacks
    first.

    Explanation:
    declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
    Lew attacks Harry; Harry now has 3 health.
    Harry attacks Lew; Lew now has 6 health.
    Lew attacks Harry; Harry now has 1 health.
    Harry attacks Lew; Lew now has 2 health.
    Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
*/

class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}


class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1, b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));

        System.out.println(Kata.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Jerry"));

        System.out.println(Kata.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Harald"));
    }
}
