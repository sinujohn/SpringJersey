package me.sinu.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sinuj on 12/31/2015.
 */
@Configuration
@ComponentScan( basePackages = {"me.sinu.api", "me.sinu.api.resource"} )
public class SpringBeansConfig {

}
