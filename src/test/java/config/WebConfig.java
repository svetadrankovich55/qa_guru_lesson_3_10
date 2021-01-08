package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:web.local.properties",
        "classpath:web.remote.properties"
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

    @Key("webdriver.remote")
    String webdriverRemote();
}
