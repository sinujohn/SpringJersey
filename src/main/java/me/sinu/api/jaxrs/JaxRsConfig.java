package me.sinu.api.jaxrs;

import org.glassfish.jersey.server.ResourceConfig;


/**
 * Created by sinuj on 5/20/2016.
 */
public class JaxRsConfig extends ResourceConfig {

    public JaxRsConfig() {
        packages("me.sinu.api.resource");
    }
}
