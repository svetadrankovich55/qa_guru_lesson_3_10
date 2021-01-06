package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config.properties"
})
public interface WebConfig extends Config {

    @Key("search.url")
    String searchUrl();

    @Key("search.item")
    String searchItem();

    @Key("search.result")
    String searchResult();

    @Key("browser.version")
    String browserVersion();

    @Key("browser.name")
    String browserName();


    /*@Key("password")
    String searchPassword();

    @Key("search.site")
    String searchSite();

    @Key("search.item")
    String searchItem();

    @Key("search.result")
    String searchResult();

    @Key("webdriver.remote")
    String webdriverRemote();*/
}
