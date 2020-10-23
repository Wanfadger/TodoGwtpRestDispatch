package com.gwtplatform.dispatch.rest.client.serialization.mappers;

import javax.inject.Singleton;

import com.github.nmorel.gwtjackson.client.ObjectMapper;

import com.wanfadger.todo.shared.models.Todo;

@Singleton
public interface com_wanfadger_todo_shared_models_TodoMapper extends ObjectMapper<Todo> {}
