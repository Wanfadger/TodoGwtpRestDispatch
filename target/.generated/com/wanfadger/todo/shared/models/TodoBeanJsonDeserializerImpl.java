package com.wanfadger.todo.shared.models;

import com.github.nmorel.gwtjackson.client.JsonDeserializationContext;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer;
import com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer;
import com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer;
import com.github.nmorel.gwtjackson.client.deser.bean.Instance;
import com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder;
import com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap;
import com.github.nmorel.gwtjackson.client.stream.JsonReader;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

public final class TodoBeanJsonDeserializerImpl extends AbstractBeanJsonDeserializer<Todo> {
  public TodoBeanJsonDeserializerImpl() {
  }

  @Override
  public Class getDeserializedType() {
    return Todo.class;
  }

  @Override
  protected InstanceBuilder<Todo> initInstanceBuilder() {
    return new InstanceBuilder<Todo>() {
      @Override
      public Instance<Todo> newInstance(JsonReader reader, JsonDeserializationContext ctx, Map<String, String> bufferedProperties) {
        return new Instance<Todo>(create(), bufferedProperties);
      }

      private Todo create() {
        return new Todo();
      }
    };
  }

  @Override
  protected SimpleStringMap<BeanPropertyDeserializer<Todo, ?>> initDeserializers() {
    SimpleStringMap<BeanPropertyDeserializer<Todo, ?>> map = SimpleStringMap.createObject().cast();
    map.put("id", new BeanPropertyDeserializer<Todo, String>() {
      @Override
      protected JsonDeserializer<?> newDeserializer() {
        return StringJsonDeserializer.getInstance();
      }

      @Override
      public void setValue(Todo bean, String value, JsonDeserializationContext ctx) {
        bean.setId(value);
      }
    });
    map.put("name", new BeanPropertyDeserializer<Todo, String>() {
      @Override
      protected JsonDeserializer<?> newDeserializer() {
        return StringJsonDeserializer.getInstance();
      }

      @Override
      public void setValue(Todo bean, String value, JsonDeserializationContext ctx) {
        bean.setName(value);
      }
    });
    return map;
  }
}
