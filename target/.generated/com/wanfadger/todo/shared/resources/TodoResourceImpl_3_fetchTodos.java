package com.wanfadger.todo.shared.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;

import com.gwtplatform.dispatch.rest.client.codegen.AbstractRestAction;
import com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory;
import com.gwtplatform.dispatch.rest.shared.ContentType;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.HttpParameter.Type;

public class TodoResourceImpl_3_fetchTodos extends AbstractRestAction<java.util.List<com.wanfadger.todo.shared.models.Todo>> {
    public TodoResourceImpl_3_fetchTodos(
            HttpParameterFactory httpParameterFactory,
            String defaultDateFormat) {
        super(httpParameterFactory, defaultDateFormat, HttpMethod.GET, "/todos");

    }

    @Override
    public boolean isSecured() {
        return true;
    }

    @Override
    public String getBodyClass() {
        return null;
    }

    @Override
    public String getResultClass() {
        return "java.util.List<com.wanfadger.todo.shared.models.Todo>";
    }

    @Override
    public List<ContentType> getClientProducedContentTypes() {
        List<ContentType> contentTypes = new ArrayList<ContentType>();

        return contentTypes;
    }

    @Override
    public List<ContentType> getClientConsumedContentTypes() {
        List<ContentType> contentTypes = new ArrayList<ContentType>();
        contentTypes.add(ContentType.valueOf("*/*"));

        return contentTypes;
    }
}
