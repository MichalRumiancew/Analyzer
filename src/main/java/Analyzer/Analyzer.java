package Analyzer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface Analyzer<T> {

    T analize(String text);

    List<String> interpret(String text);

    static Map<String, Long> getWordFrequency(String text) {

        //po czy masz dzielić

        static Map<String, Long> getWordsMap (String text){
            return Arrays.stream(text
                    .toLowerCase()
                    .split("[/. -]|\\r?\\n"))
                    .map(x -> x.replaceAll("[^\\p{LD}\\s]", ""))
                    .filter(x -> !x.matches(""))
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        }
    }
}