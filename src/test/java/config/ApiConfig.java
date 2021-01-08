package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:\\C:\\Users\\Sveta-Sova\\Desktop\\Api.properties.txt",
        "system:properties"

})
public interface ApiConfig extends Config {

    @DefaultValue("https://demoqa.com/automation-practice-form")
    @Key("api.url")
    String apiUrl();

    @DefaultValue("MyLogin")
    @Key("api.login")
    String apiLogin();

    @Key("api.password")
    String apiPassword();

}
