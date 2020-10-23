package com.wanfadger.todo.shared.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;

import com.gwtplatform.dispatch.rest.client.codegen.AbstractRestAction;
import com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory;
import com.gwtplatform.dispatch.rest.shared.ContentType;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.HttpParameter.Type;

public class TodoResourceImpl_0_deteleTodo extends AbstractRestAction<java.lang.Void> {
    public TodoResourceImpl_0_deteleTodo(
            HttpParameterFactory httpParameterFactory,
            String defaultDateFormat,
            com.wanfadger.todo.shared.models.Todo todo) {
        super(httpParameterFactory, defaultDateFormat, HttpMethod.DELETE, "/todos");

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
        return "java.lang.Void";
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
