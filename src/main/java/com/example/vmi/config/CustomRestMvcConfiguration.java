package com.example.vmi.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class CustomRestMvcConfiguration extends RepositoryRestConfigurerAdapter{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setBasePath("/api");
        config.setRepositoryDetectionStrategy(RepositoryDetectionStrategy.RepositoryDetectionStrategies.DEFAULT);
    }
    
}
