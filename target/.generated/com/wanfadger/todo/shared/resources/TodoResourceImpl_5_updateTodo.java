package com.wanfadger.todo.shared.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;

import com.gwtplatform.dispatch.rest.client.codegen.AbstractRestAction;
import com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory;
import com.gwtplatform.dispatch.rest.shared.ContentType;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.HttpParameter.Type;

public class TodoResourceImpl_5_updateTodo extends AbstractRestAction<com.wanfadger.todo.shared.models.Todo> {
    public TodoResourceImpl_5_updateTodo(
            HttpParameterFactory httpParameterFactory,
            String defaultDateFormat,
            java.lang.String id,
            com.wanfadger.todo.shared.models.Todo todo) {
        super(httpParameterFactory, defaultDateFormat, HttpMethod.PUT, "/todos/{id}");

        addParam(Type.PATH, "id", id);
        setBodyParam(todo);
    }

    @Override
    public boolean isSecured() {
        return true;
    }

    @Override
    public String getBodyClass() {
        return "com.wanfadger.todo.shared.models.Todo";
    }

    @Override
    public String getResultClass() {
        return "com.wanfadger.todo.shared.models.Todo";
    }

    @Override
    public List<ContentType> getClientProducedContentTypes() {
        List<ContentType> contentTypes = new ArrayList<ContentType>();
        contentTypes.add(ContentType.valueOf("*/*"));

        return contentTypes;
    }

    @Override
    public List<ContentType> getClientConsumedContentTypes() {
        List<ContentType> contentTypes = new ArrayList<ContentType>();
        contentTypes.add(ContentType.valueOf("*/*"));

        return contentTypes;
    }
}
