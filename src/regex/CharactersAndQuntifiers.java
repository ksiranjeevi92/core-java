package regex;

import java.util.regex.Pattern;

public class CharactersAndQuntifiers {
    public static void main(String[] args) {
        String myString = "agh1";
        System.out.println(Pattern.matches("[abc]+", myString));
        System.out.println(Pattern.matches("\\D*", myString));
    }
}
