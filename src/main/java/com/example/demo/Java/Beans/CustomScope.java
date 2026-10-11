package com.example.demo.Java.Beans;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

class MyScope implements Scope {

    private final Map<String, Object> beans = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> factory) {
        return beans.computeIfAbsent(name,
                key -> factory.getObject());
    }

    @Override
    public Object remove(String name) {
        return beans.remove(name);
    }

    @Override
    public void registerDestructionCallback(
            String name, Runnable callback) {}

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "myScope";
    }
}


@Configuration
class AppConfig {

    @Bean
    static CustomScopeConfigurer scopeConfigurer() {
        CustomScopeConfigurer configurer =
                new CustomScopeConfigurer();

        configurer.addScope("myScope", new MyScope());
        return configurer;
    }
}


@Component
@Scope("myScope")
class MyService {
}