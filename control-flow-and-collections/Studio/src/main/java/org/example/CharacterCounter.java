package org.example;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // S1: Loop through the string one character at a time
        // S2: Store and/or update the count for a given character using a HashMap
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : phrase.toCharArray()) {
            if (Character.isSpaceChar(c)) { // consider only letters and digits
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // S3: Loop through the data structure to print the results
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

