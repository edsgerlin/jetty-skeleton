package com.edsgerlin.jetty.skeleton;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProducer {

    @Produces
    @ApplicationScoped
    public EntityManagerFactory create() {
        return Persistence.createEntityManagerFactory("JettySkeleton");
    }

    public void destroy(@Disposes EntityManagerFactory factory) {
        factory.close();
    }

}
