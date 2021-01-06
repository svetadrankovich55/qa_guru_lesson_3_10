package test;

import com.codeborne.selenide.Configuration;
import config.ConfigHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {


    @BeforeAll
    static void setup() {



    }

    @Test
    void selenideSearchTest() {
        Configuration.remote = ConfigHelper.getWebdriverRemote();
        String searchURl = ConfigHelper.getSearchUrl();
        String searchItem = ConfigHelper.getSearchItem();
        String searchResult = ConfigHelper.getSearchResult();
        Configuration.browser = ConfigHelper.getBrowserName();
        Configuration.browserVersion = ConfigHelper.getBrowserVersion();


        open(searchURl);
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));

        System.out.println(ConfigHelper.getBrowserName());
        System.out.println(ConfigHelper.getBrowserVersion());

    }
}
