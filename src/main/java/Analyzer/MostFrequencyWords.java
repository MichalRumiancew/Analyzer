package Analyzer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequencyWords implements Analyzer<List<String>> {

    @Override
    public List<String> analize(String text) {
        Map<String, Long> map = Analyzer.getWordFrequency(text)
        return map
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

    @Override
    public List<String> interpret(String text) {
        return null;
    }
}
