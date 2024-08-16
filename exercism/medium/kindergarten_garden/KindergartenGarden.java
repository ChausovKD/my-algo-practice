package medium.kindergarten_garden;

// Link: https://exercism.org/tracks/java/exercises/kindergarten-garden

import java.util.ArrayList;
import java.util.List;

public class KindergartenGarden {

    private static List<String> STUDENTS = new ArrayList<>();

    static {
        STUDENTS.add("Alice");
        STUDENTS.add("Bob");
        STUDENTS.add("Charlie");
        STUDENTS.add("David");
        STUDENTS.add("Eve");
        STUDENTS.add("Fred");
        STUDENTS.add("Ginny");
        STUDENTS.add("Harriet");
        STUDENTS.add("Ileana");
        STUDENTS.add("Joseph");
        STUDENTS.add("Kincaid");
        STUDENTS.add("Larry");
    }

    private final String garden;

    KindergartenGarden(String garden) {
        this.garden = garden.replaceAll("\n", "");
    }

    List<Plant> getPlantsOfStudent(String student) {
        int index = STUDENTS.indexOf(student);
        int countStudent = garden.length() / 4;
        StringBuilder stringBuilder = new StringBuilder();
        if (index != -1) {
            stringBuilder.append(garden, index * 2, index * 2 + 2)
                    .append(garden, (countStudent + index) * 2, (countStudent + index) * 2 + 2);
        }
        return stringBuilder.chars().mapToObj(c -> Plant.getPlant((char) c)).toList();
    }
}
