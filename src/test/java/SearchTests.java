import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    @Disabled
    void successfulSearchTest() {
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }

    @Test
    @Disabled
    void successfulSearchDuckDuckGoTest() {
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("https://selenide.org"));
    }

    @Test
    void successfulSearchYahooTest() {
        open("https://www.yahoo.com/");
        $("[type=search]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("https://selenide.org"));
    }
}