package easy.reverse_string;

// Link: https://exercism.org/tracks/java/exercises/reverse-string

public class ReverseString {

    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
}
