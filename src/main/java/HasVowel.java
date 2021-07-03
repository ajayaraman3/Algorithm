import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HasVowel {

    public static void main(String[] args) {

        String input = "Hello";
        char[] inputList = input.toCharArray();

        List<String> vowelList = Arrays.asList(new String[] {"A", "E", "I", "O", "U"});

        for (char c : inputList) {
            if(vowelList.contains(Character.toString(c).toUpperCase())) {
                System.out.println( "Has vowel");
            }
        }

        LinkedList l = new LinkedList();
        l.descendingIterator();

    }



}
