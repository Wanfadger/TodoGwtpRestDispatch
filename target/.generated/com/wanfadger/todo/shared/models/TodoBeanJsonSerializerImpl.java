package com.wanfadger.todo.shared.models;

import com.github.nmorel.gwtjackson.client.JsonSerializationContext;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer;
import com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer;
import com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

public final class TodoBeanJsonSerializerImpl extends AbstractBeanJsonSerializer<Todo> {
  public TodoBeanJsonSerializerImpl() {
  }

  @Override
  public Class getSerializedType() {
    return Todo.class;
  }

  @Override
  protected BeanPropertySerializer[] initSerializers() {
    BeanPropertySerializer[] result = new BeanPropertySerializer[2];
    result[0] = new BeanPropertySerializer<Todo, String>("id") {
      @Override
      protected JsonSerializer<?> newSerializer() {
        return StringJsonSerializer.getInstance();
      }

      @Override
      public String getValue(Todo bean, JsonSerializationContext ctx) {
        return bean.getId();
      }
    };
    result[1] = new BeanPropertySerializer<Todo, String>("name") {
      @Override
      protected JsonSerializer<?> newSerializer() {
        return StringJsonSerializer.getInstance();
      }

      @Override
      public String getValue(Todo bean, JsonSerializationContext ctx) {
        return bean.getName();
      }
    };
    return result;
  }
}
