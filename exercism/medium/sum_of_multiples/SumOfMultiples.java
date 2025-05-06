package medium.sum_of_multiples;

// Link: https://exercism.org/tracks/java/exercises/sum-of-multiples

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;

public class SumOfMultiples {

    private int level;
    private int[] set;

    SumOfMultiples(int level, int[] set) {
        this.level = level;
        this.set = set;
    }

    int getSum() { // second solution
        return range(0, level)
                .filter(number -> stream(set).anyMatch(factor -> factor > 0 && number % factor == 0))
                .sum();
    }

//    int getSum() { first solution
//        Set<Integer> uniqueMultiples = new HashSet<>();
//        for (int number : set) {
//            if (number != 0) {
//                for (int i = number; i < level; i += number) {
//                    uniqueMultiples.add(i);
//                }
//            }
//        }
//        return uniqueMultiples.stream().reduce(0, Integer::sum);
//    }
}
