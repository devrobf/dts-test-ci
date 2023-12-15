package mmu.quotes;

import java.util.List;

public class QuotesComponent implements Component {
    private List<QuoteComponent> quotes;

    public QuotesComponent(List<QuoteComponent> quotes) {
        this.quotes = quotes;
    }

    public String render() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<h1>Famous Quotes</h1>\n<div class='quotes'>\n");
        for (QuoteComponent quote : quotes) {
            stringBuilder.append(quote.render() + "\n");
        }
        stringBuilder.append("</div>\n");
        return stringBuilder.toString();
    }
}
