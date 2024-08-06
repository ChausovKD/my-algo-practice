package easy.captains_log;

import java.util.Random;

public class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + (1000 + random.nextInt(9000));
    }

    double randomStardate() {
        return 41000.0 + 1000 * random.nextDouble();
    }


    public static void main(String[] args) {
        CaptainsLog captainsLog = new CaptainsLog(new Random());
        System.out.println(captainsLog.randomPlanetClass());
        System.out.println(captainsLog.randomShipRegistryNumber());
        System.out.println(captainsLog.randomStardate());
    }
}
