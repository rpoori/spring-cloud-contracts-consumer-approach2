package com.my.poc.userservicecontracts.utils;

import lombok.SneakyThrows;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class ConfigurationPropertiesLoader {

    @SneakyThrows
    public static <T> T getConfig(Class<T> configClass, String prefix) {
        ResourcePropertySource resourcePropertySource =
                new ResourcePropertySource("classpath:application.properties");

        MutablePropertySources propertySources = new MutablePropertySources();
        propertySources.addFirst(resourcePropertySource);

        Binder binder = new Binder(ConfigurationPropertySources.from(propertySources));
        return binder.bind(prefix, configClass).get();
    }
}
