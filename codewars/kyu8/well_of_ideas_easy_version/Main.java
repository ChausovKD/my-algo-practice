package kyu8.well_of_ideas_easy_version;

/*
    Task: Well of Ideas - Easy Version (8 kyu)
    URL: https://www.codewars.com/kata/57f222ce69e09c3630000212

    Description: For every good kata idea there seem to be quite a few bad ones! You need to check the provided array
    (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are
    more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.

    Input: {"bad", "bad", "bad"}
    Output: "Fail!"

    Input: {"good", "bad", "bad", "bad", "bad"}
    Output: "Publish!"

    Input: {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}
    Output: "I smell a series!"
*/

public class Main {
    public static String well(String[] x) {
        int count = 0;
        for (String i : x) {
            if (i.equals("good")) {
                count++;
            }
            if (count > 2) {
                return "I smell a series!";
            }
        }
        if (count == 1 || count == 2) {
            return "Publish!";
        } else {
            return "Fail!";
        }
    }

    public static void main(String[] args) {
        System.out.println(well(new String[] {"bad", "bad", "bad"}));
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
