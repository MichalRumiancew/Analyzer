package Analyzer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestAnalyzer implements Analyzer<List<String>> {


    @Override
    public List<String> analize(String text) {
        Map<String, Long> map = Analyzer.getWordFrequency(text);
        return map
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .sorted((x, y) -> y.getKey().length() - x.getKey().length())
                .sorted(Map.Entry.<String, Long>comparingByKey().reversed())
                .limit(10)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    @Override
    public List<String> interpret(String text) {
        return null;
    }
}