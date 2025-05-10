package medium.diamond;

// Link: https://exercism.org/tracks/java/exercises/diamond

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Link: https://exercism.org/tracks/java/exercises/diamond

public class DiamondPrinter {

    List<String> printToList(char endCh) {
        char startCh = 'A';
        int numberOfLines = (endCh - startCh) * 2 + 1;
        List<String> result = new ArrayList<>();
        int mid = numberOfLines / 2;

        for (int i = 0; i <= mid; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" ".repeat(mid - i))
                    .append((char) (startCh + i));
            if(i > 0) {
                stringBuilder.append(" ".repeat(i * 2 - 1))
                        .append((char) (startCh + i));
            }
                stringBuilder.append(" ".repeat(mid - i));
                result.add(stringBuilder.toString());
        }
        List<String> reversedPart = new ArrayList<>(result);
        Collections.reverse(reversedPart);
        reversedPart.removeFirst();
        result.addAll(reversedPart);

        return result;
    }
}
