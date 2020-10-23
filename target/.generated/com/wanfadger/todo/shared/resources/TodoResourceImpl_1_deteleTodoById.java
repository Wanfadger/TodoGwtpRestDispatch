package com.wanfadger.todo.shared.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;

import com.gwtplatform.dispatch.rest.client.codegen.AbstractRestAction;
import com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory;
import com.gwtplatform.dispatch.rest.shared.ContentType;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.HttpParameter.Type;

public class TodoResourceImpl_1_deteleTodoById extends AbstractRestAction<java.lang.Void> {
    public TodoResourceImpl_1_deteleTodoById(
            HttpParameterFactory httpParameterFactory,
            String defaultDateFormat,
            java.lang.String id) {
        super(httpParameterFactory, defaultDateFormat, HttpMethod.DELETE, "/todos/{id}");

        addParam(Type.PATH, "id", id);
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
        return "java.lang.Void";
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
