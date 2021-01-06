package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static String getSearchUrl() {
        return getConfig().searchUrl();
    }

    public static String getSearchItem() {
        return getConfig().searchItem();
    }

    public static String getSearchResult() {
        return getConfig().searchResult();
    }

    public static String getBrowserVersion() {
        return getConfig().browserVersion();
    }

    public static String getBrowserName() {
        return getConfig().browserName();
    }

    public static String getWebdriverRemote() {
        return getConfig().webdriverRemote();
    }


    private static WebConfig getConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "local");
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

}
