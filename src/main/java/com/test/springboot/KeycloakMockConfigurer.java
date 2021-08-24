package com.test.springboot;

import com.tngtech.keycloakmock.api.KeycloakMock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import static com.tngtech.keycloakmock.api.ServerConfig.aServerConfig;

@Configuration
public class KeycloakMockConfigurer {
    private final static Logger logger = LoggerFactory.getLogger(KeycloakMockConfigurer.class);

    public static KeycloakMock mock = new KeycloakMock(aServerConfig()
            .withPort(8000).withDefaultRealm("realm").build());

    static {
        mock.start();
        logger.info("Keycloak Mock server started");
    }
}
