package com.gwtplatform.dispatch.rest.client.serialization.mappers;

import com.github.nmorel.gwtjackson.client.AbstractObjectMapper;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.wanfadger.todo.shared.models.Todo;
import com.wanfadger.todo.shared.models.TodoBeanJsonDeserializerImpl;
import com.wanfadger.todo.shared.models.TodoBeanJsonSerializerImpl;
import java.lang.Override;

public final class com_wanfadger_todo_shared_models_TodoMapperImpl extends AbstractObjectMapper<Todo> implements com_wanfadger_todo_shared_models_TodoMapper {
  public com_wanfadger_todo_shared_models_TodoMapperImpl() {
    super("Todo");
  }

  @Override
  protected JsonDeserializer<Todo> newDeserializer() {
    return new TodoBeanJsonDeserializerImpl();
  }

  @Override
  protected JsonSerializer<Todo> newSerializer() {
    return new TodoBeanJsonSerializerImpl();
  }
}
