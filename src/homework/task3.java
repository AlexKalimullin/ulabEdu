/*
        Task3
            Реализовать функцию нечеткого поиска
                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

package homework;

import java.util.Objects;

public class task3 {
    public static void fuzzySearch(String s1, String s2){
        int count = 0;
        int wordIndex = 0;
        int phraseIndex = 0;

        String[] wordArray = s1.split("");
        String[] phraseArray = s2.split("");

        if (s1.length()==0 || s2.length()==0 || s1.length()>s2.length()){
            System.out.println(false);
            return;
        }
        while (wordIndex < wordArray.length && phraseIndex < phraseArray.length) {
            if (Objects.equals(wordArray[wordIndex], phraseArray[phraseIndex])) {
                count++;
                wordIndex++;
            }
            phraseIndex++;
        }
        System.out.println(count == wordArray.length);
    }

    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }
}
