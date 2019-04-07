package Analyzer;

import java.util.List;
import java.util.Map;

class WordCountAnalyzer implements Analyzer<Long> {
    @Override
    public Long analize(String text) {
        Map<String, Long> map = Analyzer.getWordFrequency(text)
        Long counter = 0L;
        for (Map.Entry<String, Long> m : map.entrySet()) {
            counter += m.getValue();
        }

        return counter;


    }

    @Override
    public List<String> interpret(String text) {
        return null;
    }
}