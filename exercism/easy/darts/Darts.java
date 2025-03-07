package easy.darts;

// Link: https://exercism.org/tracks/java/exercises/darts

public class Darts {

    private static final int RADIUS_OUTER_CIRCLE = 10;
    private static final int RADIUS_MIDDLE_CIRCLE = 5;
    private static final int RADIUS_INNER_CIRCLE = 1;

    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart); // distance (hypotenuse size)
        if (distance <= RADIUS_INNER_CIRCLE) {
            return 10;
        }
        else if (distance <= RADIUS_MIDDLE_CIRCLE) {
            return 5;
        }
        else if (distance <= RADIUS_OUTER_CIRCLE) {
            return 1;
        }
        return 0;
    }
}
