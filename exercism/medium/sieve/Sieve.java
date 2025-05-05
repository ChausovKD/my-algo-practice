package medium.sieve;

// Link: https://exercism.org/tracks/java/exercises/sieve

import java.util.ArrayList;
import java.util.List;

public class Sieve {

    private int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        boolean[] isPrime = new boolean[maxPrime + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= maxPrime; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= maxPrime; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxPrime; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= maxPrime; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
