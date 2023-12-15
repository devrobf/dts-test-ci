package mmu.quotes;

import org.yaml.snakeyaml.Yaml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import mmu.quotes.QuoteComponent;

public class QuoteReader {

    public static List<QuoteComponent> readQuotes(String filePath) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        List<Map<String, Object>> quoteMaps = yaml.load(fileInputStream);
        return convertToQuotes(quoteMaps);
    }

    private static List<QuoteComponent> convertToQuotes(List<Map<String, Object>> quoteMaps) {
        List<QuoteComponent> quotes = new ArrayList<>();

        for (Map<String, Object> quoteMap : quoteMaps) {
            String author = (String) quoteMap.get("author");
            String quoteText = (String) quoteMap.get("quote");
            QuoteComponent quote = new QuoteComponent(quoteText, author);
            quotes.add(quote);
        }

        return quotes;
    }
}
