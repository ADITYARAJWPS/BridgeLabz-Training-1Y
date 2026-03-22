public class CountVowelsConsonants {
    public static int[] count(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}