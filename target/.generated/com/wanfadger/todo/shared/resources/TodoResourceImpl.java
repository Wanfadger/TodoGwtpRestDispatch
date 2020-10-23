package com.wanfadger.todo.shared.resources;

import com.gwtplatform.dispatch.rest.client.core.StaticParametersFactory;
import com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.wanfadger.todo.shared.resources.TodoResource;
import com.wanfadger.todo.shared.resources.TodoResourceImpl_0_deteleTodo;
import com.wanfadger.todo.shared.resources.TodoResourceImpl_1_deteleTodoById;
import com.wanfadger.todo.shared.resources.TodoResourceImpl_2_fetchTodoById;
import com.wanfadger.todo.shared.resources.TodoResourceImpl_3_fetchTodos;
import com.wanfadger.todo.shared.resources.TodoResourceImpl_4_persistTodo;
import com.wanfadger.todo.shared.resources.TodoResourceImpl_5_updateTodo;

public class TodoResourceImpl implements TodoResource {
    private final HttpParameterFactory httpParameterFactory;
    private final String defaultDateFormat;

    TodoResourceImpl() {
        this.defaultDateFormat = StaticParametersFactory.getDefaultDateFormat();
        this.httpParameterFactory = StaticParametersFactory.getHttpParameterFactory();
    }

    @Override
    public RestAction<java.lang.Void> deteleTodo(
            com.wanfadger.todo.shared.models.Todo todo) {
        return new TodoResourceImpl_0_deteleTodo(
                httpParameterFactory,
                defaultDateFormat,
                todo);
    }

    @Override
    public RestAction<java.lang.Void> deteleTodoById(
            java.lang.String id) {
        return new TodoResourceImpl_1_deteleTodoById(
                httpParameterFactory,
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<com.wanfadger.todo.shared.models.Todo> fetchTodoById(
            java.lang.String id) {
        return new TodoResourceImpl_2_fetchTodoById(
                httpParameterFactory,
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<java.util.List<com.wanfadger.todo.shared.models.Todo>> fetchTodos() {
        return new TodoResourceImpl_3_fetchTodos(
                httpParameterFactory,
                defaultDateFormat);
    }

    @Override
    public RestAction<com.wanfadger.todo.shared.models.Todo> persistTodo(
            com.wanfadger.todo.shared.models.Todo todo) {
        return new TodoResourceImpl_4_persistTodo(
                httpParameterFactory,
                defaultDateFormat,
                todo);
    }

    @Override
    public RestAction<com.wanfadger.todo.shared.models.Todo> updateTodo(
            java.lang.String id, 
            com.wanfadger.todo.shared.models.Todo todo) {
        return new TodoResourceImpl_5_updateTodo(
                httpParameterFactory,
                defaultDateFormat,
                id,
                todo);
    }

}
