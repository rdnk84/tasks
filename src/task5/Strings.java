package task5;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

        String text = "нерадивых собратьев и спас их жизни бяка";
        String text2 = "Жилкос себе дед да баба, у них была курочка Рябакос; кос снесла под полом яичко - пестро, вострокос, костяно, мудрено!";
//        findLongest(text);

//        isPalindrome("яблоко", "yколбя");
//        changeWord(text);
//        substringCount(text2, "кос");
        invertWords(text);
    }

    public static String findLongest(String text) {
        String[] words = text.split(" ");
        String maxLength = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].length() < words[j].length()) {
                    String aj = words[j];
                    String ai = words[i];

                    words[j] = ai;
                    words[i] = aj;
                }
            }
        }
        maxLength = words[words.length - 1];
        for (int j = words.length - 1; j > 0; j--) {
            if (words[j].length() == words[j - 1].length()) {
                maxLength = maxLength.concat(", " + words[j - 1]);
            }
        }
        System.out.println("Самое длинное слово в тексте: " + maxLength);
        return maxLength;
    }

    public static boolean isPalindrome(String str1, String str2) {
        boolean result = false;
        char[] originWord = str1.toCharArray();
        String revertedString = "";
        for (int j = originWord.length - 1; j >= 0; j--) {
            revertedString = revertedString + originWord[j];
        }
        if (str2.equals(revertedString)) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

    public static void changeWord(String text) {
        String newText = text.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(newText);
    }

    public static void substringCount(String str1, String str2) {
        int count = 0;
        for (String word : str1.split(" ")) {
            if (word.contains(str2)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void invertWords(String text) {
        StringBuilder builder = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            builder.append(words[i])
                    .reverse();
            words[i] = builder.toString();
            builder.setLength(0);
        }
        for(String word : words) {
            builder.append(word)
                    .append(" ");
        }
        String newText = builder.toString();
        System.out.println("Reversed string word by word is: " + newText);
    }
}
