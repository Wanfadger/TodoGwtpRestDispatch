package com.gwtplatform.dispatch.rest.client;

import javax.inject.Singleton;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.TypeLiteral;
import com.wanfadger.todo.shared.resources.TodoResource;
import com.wanfadger.todo.shared.resources.TodoResourceImpl;
import com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider;
import com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl;

public class RestGinModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(TodoResource.class)
                .to(TodoResourceImpl.class)
                .in(Singleton.class);
        bind(JacksonMapperProvider.class)
                .to(JacksonMapperProviderImpl.class)
                .in(Singleton.class);
    }
}
