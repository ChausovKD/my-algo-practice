package easy.dAndd_character;

// Link: https://exercism.org/tracks/java/exercises/dnd-character

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    List<Integer> rollDice() {
        return IntStream.range(0, 4)
                .mapToObj(i -> new Random().nextInt(6) + 1)
                .collect(Collectors.toList());
    }

    int ability(List<Integer> scores) {
        return scores.stream().mapToInt(Integer::intValue).sum() - scores.stream().mapToInt(Integer::intValue).min()
                .orElse(0);
    }

    int modifier(int input) {
        return (int) (Math.floor((input - 10) / 2.0));
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
