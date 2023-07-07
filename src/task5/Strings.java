package task5;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

        String text = "нерадивых собратьев и спас их жизни любопытствующих бяка";
        String text2 = "Жилкос себе дед да баба, у них была курочка Рябакос; кос снесла под полом яичко - пестро, вострокос, костяно, мудрено!";
//        findLongest(text);

        isPalindrome("яблоко");
//        changeWord(text);
//        substringCount(text2, "кос");
//        invertWords(text);
    }

    public static String findLongest(String text) {
        String[] words = text.split(" ");
        String maxLength = "";
        for (String word : words) {
            if(word.length() > maxLength.length()) {
                maxLength = word;
            }
        }
        System.out.println("Самое длинное слово в тексте: " + maxLength);
        return maxLength;
    }

    public static boolean isPalindrome(String word) {
        boolean result = false;
        StringBuilder builder = new StringBuilder();
        builder.append(word);
        String reversedString = builder.reverse().toString();
        if(word.equals(reversedString)){
            result = true;
        }
        System.out.println(result);
        return result;
    }

    public static void changeWord(String originText, String wrongWord, String change) {
        String newText = originText.replaceAll(wrongWord, change);
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
