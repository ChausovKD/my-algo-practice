package easy.space_age;

// Link: https://exercism.org/tracks/java/exercises/space-age

import java.util.HashMap;
import java.util.Map;

class SpaceAge {

    private static final Map<String, Double> PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS;
    private static final int ONE_EARTH_YEAR_IN_SECONDS = 31557600;

    static {
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS = new HashMap<>(8);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Mercury", 0.2408467);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Venus", 0.61519726);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Earth", 1.0);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Mars", 1.8808158);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Jupiter", 11.862615);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Saturn", 29.447498);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Uranus", 84.016846);
        PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.put("Neptune", 164.79132);
    }

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds / ONE_EARTH_YEAR_IN_SECONDS;
    }

    double onMercury() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Mercury");
    }

    double onVenus() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Venus");
    }

    double onMars() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Mars");
    }

    double onJupiter() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Jupiter");
    }

    double onSaturn() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Saturn");
    }

    double onUranus() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Uranus");
    }

    double onNeptune() {
        return onEarth() / PLANET_TO_ORBITAL_PERIOD_IN_EARTH_YEARS.get("Neptune");
    }
}
