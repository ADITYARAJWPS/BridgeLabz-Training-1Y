import java.util.*;

public class RemoveDuplicates {
    public static String remove(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        return result.toString();
    }
}