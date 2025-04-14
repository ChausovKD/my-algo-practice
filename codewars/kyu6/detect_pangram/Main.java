package kyu6.detect_pangram;

/*
  Task: Detect Pangram (6 kyu)
  URL: https://www.codewars.com/kata/545cedaa9943f7fe7b000048

  Description: A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the
  sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once
  (case is irrelevant). Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore
  numbers and punctuation.

  Input: "The quick brown fox jumps over the lazy dog."
  Output: true

  Input: "You shall not pass!"
  Output: false

  Input: "Cwm fjord bank glyphs vext quiz"
  Output: true
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static boolean check(String sentence){
        List<Character> alf = new ArrayList<>();
        for (int i = 97; i <= 122; i++){
            alf.add((char) i);
        }
        sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z]", "");
        List<Character> listC = new ArrayList<>();
        for (char c : sentence.toCharArray()){
            listC.add(c);
        }
        listC = listC.stream().distinct().sorted().collect(Collectors.toList());
        return alf.equals(listC);
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
        System.out.println(check("Cwm fjord bank glyphs vext quiz"));
    }
}
