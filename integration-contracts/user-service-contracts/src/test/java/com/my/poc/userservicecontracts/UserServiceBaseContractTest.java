package com.my.poc.userservicecontracts;

import com.my.poc.notificationstoreimpl.UserServiceConfig;
import io.restassured.RestAssured;
import org.junit.Before;

import static com.my.poc.userservicecontracts.utils.ConfigurationPropertiesLoader.getConfig;

public class UserServiceBaseContractTest {

    @Before
    public void setup() {
        UserServiceConfig userServiceConfig = getConfig(UserServiceConfig.class, "user-service");
        RestAssured.baseURI = userServiceConfig.getRestApiUrl();
    }
}
