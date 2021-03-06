package com.test.springboot;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShutdownController implements ApplicationContextAware {
    private ApplicationContext context;

    @GetMapping("/shutdown")
    public void shutdown() {
        KeycloakMockConfigurer.mock.stop();
        ((ConfigurableApplicationContext) context).close();
        System.out.println("shutting down the application");
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.context = ctx;

    }

}

