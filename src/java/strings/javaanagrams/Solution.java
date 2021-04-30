package java.strings.javaanagrams;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    private static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> charFrequencyA = getCharFrequency(a);
        Map<Character, Integer> charFrequencyB = getCharFrequency(b);

        return charFrequencyA.equals(charFrequencyB) ? true : false;
    }

    private static Map<Character, Integer> getCharFrequency(String string) {
        Map<Character, Integer> charFrequency = new TreeMap<>();
        Integer count;

        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            if (charFrequency.containsKey(character)) {
                count = charFrequency.get(character) + 1;
                charFrequency.put(character, count);
            } else {
                charFrequency.put(character, 1);
            }
        }

        return charFrequency;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
