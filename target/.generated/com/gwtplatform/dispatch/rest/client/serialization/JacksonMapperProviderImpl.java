package com.gwtplatform.dispatch.rest.client.serialization;

import javax.inject.Inject;
import javax.inject.Provider;

import com.github.nmorel.gwtjackson.client.ObjectMapper;
import com.google.inject.TypeLiteral;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.dispatch.rest.client.serialization.mappers.*;

public class JacksonMapperProviderImpl extends AbstractJacksonMapperProvider {
    JacksonMapperProviderImpl() {
        registerProvider("com.wanfadger.todo.shared.models.Todo",
                new Provider<ObjectMapper<?>>() {
                    private ObjectMapper<?> mapper;

                    @Override
                    public ObjectMapper<?> get() {
                        if (mapper == null){
                            mapper = (ObjectMapper<?>) GWT.create(com_wanfadger_todo_shared_models_TodoMapper.class);
                        }

                        return mapper;
                    }
                });
        registerProvider("java.util.List<com.wanfadger.todo.shared.models.Todo>",
                new Provider<ObjectMapper<?>>() {
                    private ObjectMapper<?> mapper;

                    @Override
                    public ObjectMapper<?> get() {
                        if (mapper == null){
                            mapper = (ObjectMapper<?>) GWT.create(java_util_List_com_wanfadger_todo_shared_models_Todo_Mapper.class);
                        }

                        return mapper;
                    }
                });
        registerProvider("java.lang.Void",
                new Provider<ObjectMapper<?>>() {
                    private ObjectMapper<?> mapper;

                    @Override
                    public ObjectMapper<?> get() {
                        if (mapper == null){
                            mapper = (ObjectMapper<?>) GWT.create(java_lang_VoidMapper.class);
                        }

                        return mapper;
                    }
                });
    }
}
