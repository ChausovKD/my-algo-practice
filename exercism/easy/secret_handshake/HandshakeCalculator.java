package easy.secret_handshake;

// Link: https://exercism.org/tracks/java/exercises/secret-handshake

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();
        for (int i = 1; number > 0; i++) {
            if ((number & 1) == 1) {
                switch (i) {
                    case 1 -> {
                        signals.add(Signal.WINK);
                    }
                    case 2 -> {
                        signals.add(Signal.DOUBLE_BLINK);
                    }
                    case 3 -> {
                        signals.add(Signal.CLOSE_YOUR_EYES);
                    }
                    case 4 -> {
                        signals.add(Signal.JUMP);
                    }
                    case 5 -> {
                        Collections.reverse(signals);
                    }
                }
            }
            number >>= 1;
        }
        return signals;
    }
}
