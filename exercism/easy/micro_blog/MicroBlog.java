package easy.micro_blog;

// Link: https://exercism.org/tracks/java/exercises/micro-blog

public class MicroBlog {

    public String truncate(String input) { // second solution
        return input.codePointCount(0, input.length()) <= 5 ? input :
                input.substring(0, input.offsetByCodePoints(0,5));
    }

//    public String truncate(String input) { // first solution
//        int codePointCount = input.codePointCount(0, input.length());
//        if (codePointCount <= 5) {
//            return input;
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        int codePointAdded = 0;
//        for (int i = 0; i < input.length() && codePointAdded < 5; ) {
//            int codePointCurrentChar = input.codePointAt(i);
//            stringBuilder.appendCodePoint(codePointCurrentChar);
//            i += Character.charCount(codePointCurrentChar);
//            codePointAdded++;
//        }
//        return stringBuilder.toString();
//    }

}
