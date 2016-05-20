package me.sinu.api.jaxrs;

import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Created by sinuj on 5/20/2016.
 */
public class JaxRsConfig extends ResourceConfig {

    public JaxRsConfig() {
        packages("me.sinu.api.resource");

        initSwagger();
    }

    private void initSwagger() {
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/springjersey/api");
        beanConfig.setResourcePackage("me.sinu.api.resource");
        beanConfig.setScan(true);
    }
}
