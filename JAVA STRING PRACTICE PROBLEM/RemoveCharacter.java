public class RemoveCharacter {
    public static String remove(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }
        return result.toString();
    }
}