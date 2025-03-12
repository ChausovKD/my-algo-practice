package easy.raindrops;

import java.util.HashMap;

public class RaindropConverter {

    private static final HashMap<Integer, String> INTEGER_SOUND = new HashMap<>();

    static {
        INTEGER_SOUND.put(3, "Pling");
        INTEGER_SOUND.put(5, "Plang");
        INTEGER_SOUND.put(7, "Plong");
    }

    String convert(int number) { // second solution
        return INTEGER_SOUND.keySet()
                .stream()
                .filter(key -> number % key == 0)
                .map(INTEGER_SOUND::get)
                .reduce((s1, s2) -> s1 + s2)
                .orElse(Integer.toString(number));
    }

//    String convert(int number) { // first solution
//        StringBuilder stringBuilder = new StringBuilder();
//        if(number % 3 == 0) {
//            stringBuilder.append("Pling");
//        }
//        if(number % 5 == 0) {
//            stringBuilder.append("Plang");
//        }
//        if(number % 7 == 0) {
//            stringBuilder.append("Plong");
//        }
//        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
//            stringBuilder.append(number);
//        }
//        return stringBuilder.toString();
//    }
}
