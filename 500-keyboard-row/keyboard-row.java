import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        Set<Character> set1 = toSet(row1);
        Set<Character> set2 = toSet(row2);
        Set<Character> set3 = toSet(row3);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            if (canType(lower, set1) || canType(lower, set2) || canType(lower, set3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private Set<Character> toSet(String row) {
        Set<Character> set = new HashSet<>();
        for (char c : row.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    private boolean canType(String word, Set<Character> row) {
        for (char c : word.toCharArray()) {
            if (!row.contains(c)) return false;
        }
        return true;
    }
}
