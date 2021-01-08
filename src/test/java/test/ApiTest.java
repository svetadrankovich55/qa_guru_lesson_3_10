package test;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {
    @Test
    void apiTest() {
        ApiConfig apiConfig = ConfigFactory.newInstance().create(ApiConfig.class);
        System.out.println(apiConfig.apiUrl());
        System.out.println(apiConfig.apiLogin());
        System.out.println(apiConfig.apiPassword());
    }

}
