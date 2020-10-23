package com.gwtplatform.dispatch.rest.client.serialization.mappers;

import com.github.nmorel.gwtjackson.client.AbstractObjectMapper;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer;
import com.github.nmorel.gwtjackson.client.ser.CollectionJsonSerializer;
import com.wanfadger.todo.shared.models.Todo;
import com.wanfadger.todo.shared.models.TodoBeanJsonDeserializerImpl;
import com.wanfadger.todo.shared.models.TodoBeanJsonSerializerImpl;
import java.lang.Override;
import java.util.List;

public final class java_util_List_com_wanfadger_todo_shared_models_Todo_MapperImpl extends AbstractObjectMapper<List<Todo>> implements java_util_List_com_wanfadger_todo_shared_models_Todo_Mapper {
  public java_util_List_com_wanfadger_todo_shared_models_Todo_MapperImpl() {
    super("List");
  }

  @Override
  protected JsonDeserializer<List<Todo>> newDeserializer() {
    return ListJsonDeserializer.newInstance(new TodoBeanJsonDeserializerImpl());
  }

  @Override
  protected JsonSerializer<List<Todo>> newSerializer() {
    return CollectionJsonSerializer.newInstance(new TodoBeanJsonSerializerImpl());
  }
}
