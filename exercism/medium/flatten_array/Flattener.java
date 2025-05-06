package medium.flatten_array;

// Link: https://exercism.org/tracks/java/exercises/flatten-array

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattener {

    public static List<Object> flatten(List<Object> input) { // second solution
        return input.stream()
                .flatMap(element -> element instanceof List<?> ?
                        Flattener.flatten((List<Object>) element).stream() : Stream.of(element))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

//    <T> List<T> flatten(List<T> list) { // first solution
//        List<T> flattenedList = new ArrayList<>();
//
//        for (T element : list) {
//            if (element instanceof List<?>) {
//                flattenedList.addAll(flatten((List<T>) element));
//            }
//            else if (element != null) {
//                flattenedList.add(element);
//            }
//        }
//        return flattenedList;
//    }
}
