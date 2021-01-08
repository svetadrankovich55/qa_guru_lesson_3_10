package test;

import com.codeborne.selenide.Configuration;
import config.WebConfigHelper;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest {

    @Test
    void selenideSearchTest() {
        Configuration.remote = WebConfigHelper.getWebdriverRemote();
        String searchURl = WebConfigHelper.getSearchUrl();
        String searchItem = WebConfigHelper.getSearchItem();
        String searchResult = WebConfigHelper.getSearchResult();
        Configuration.browser = WebConfigHelper.getBrowserName();
        Configuration.browserVersion = WebConfigHelper.getBrowserVersion();


        open(searchURl);
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));

        System.out.println(WebConfigHelper.getBrowserName());
        System.out.println(WebConfigHelper.getBrowserVersion());

    }
}
