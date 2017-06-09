/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redhat.refarch.microservices.sales.service;

import io.swagger.jaxrs.config.BeanConfig;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Resource;



/**
 *
 * @author czhu
 */
public class SwaggerTestApplication extends SalesService {

    public SwaggerTestApplication() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setTitle("My API");
        beanConfig.setBasePath("/TestSwagger");
        beanConfig.setResourcePackage("com.haufe.demo.resources");
        beanConfig.setScan(true);
    }

//    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<Class<?>>();

        set.add(Resource.class);

        set.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        set.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        return set;
    }
}
