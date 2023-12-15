import org.junit.*;
import java.util.List;

import mmu.quotes.*;

public class ComponentTests {

    @Test
    public void WhenCreateQuoteThenHtmlIsCreated() {
        QuoteComponent quote = new QuoteComponent("quote text", "author name");
        String html = quote.render();
        Assert.assertEquals(html, "<div><span>quote text</span><span>- author name</span></div>");
    }

    @Test
    public void WhenCreateQuotesThenHtmlIsCreated() {
        QuotesComponent quotes = new QuotesComponent(List.of(new QuoteComponent("quote text", "author name")));
        String html = quotes.render();
        Assert.assertEquals(html, "<h1>Famous Quotes</h1>\n<div>\n<div><span>quote text</span><span>- author name</span></div>\n</div>\n");
    }

}