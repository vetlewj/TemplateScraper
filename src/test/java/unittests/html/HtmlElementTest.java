package unittests.html;

import org.junit.jupiter.api.Test;
import scraper.Scraper;
import scraper.html.HtmlElement;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class HtmlElementTest {

    @Test
    void getAttribute() {
        File testFile = new File("src/test/resources/snlMichelangelo.html");
        Scraper scraper = Scraper.createScraperWithHtmlFile(testFile);

        HtmlElement htmlElement = scraper.getElementsByClass("page-title__heading-text").get(0);
        assertEquals("page-title__heading-text", htmlElement.getAttributeValue("class"));
    }

    @Test
    void stringRepresentationOfHtmlElement(){
        File testFile = new File("src/test/resources/snlMichelangelo.html");
        Scraper scraper = Scraper.createScraperWithHtmlFile(testFile);

        HtmlElement htmlElement = scraper.getElementsByClass("page-title__heading-text").get(0);
        assertEquals("<span class=\"page-title__heading-text\">Michelangelo</span>", htmlElement.toString());
    }
}
