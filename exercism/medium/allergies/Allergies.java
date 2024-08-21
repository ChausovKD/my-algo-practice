package medium.allergies;

// Link: https://exercism.org/tracks/java/exercises/allergies

import java.util.ArrayList;
import java.util.List;

public class Allergies {

    // The first solution is better in that we do not go through all the values of the array with allergens, but start
    // with the maximum from the score value, which may turn out to be much less than the maximum in the list of
    // allergens, in another case

    private int score; // first solution

    Allergies(int score) {
        this.score = score % 256;
    }

    boolean isAllergicTo(Allergen allergen) {
        return (this.score & allergen.getScore()) != 0;
    }

    List<Allergen> getList() {
        List<Allergen> allergensToms = new ArrayList<>();
        Allergen[] allAllergens = Allergen.values();
        for (int i = 0; score > 0; i++) {
            if ((score & 1) == 1) {
                allergensToms.add(allAllergens[i]);
            }
            score >>= 1;
        }
        return allergensToms;
    }

//    private int score; // second solution
//
//    Allergies(int score) {
//        this.score = score % 256;
//    }
//
//    boolean isAllergicTo(Allergen allergen) {
//        return (this.score & allergen.getScore()) != 0;
//    }
//
//    List<Allergen> getList() {
//        List<Allergen> allergensToms = new ArrayList<>();
//        Allergen[] allAllergens = Allergen.values();
//        for (Allergen allAllergen : allAllergens) { //
//            if (isAllergicTo(allAllergen)) {
//                allergensToms.add(allAllergen);
//            }
//        }
//        return allergensToms;
//    }
}
