package com.gwtplatform.dispatch.rest.client.serialization.mappers;

import com.github.nmorel.gwtjackson.client.AbstractObjectMapper;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.deser.VoidJsonDeserializer;
import com.github.nmorel.gwtjackson.client.ser.VoidJsonSerializer;
import java.lang.Override;
import java.lang.Void;

public final class java_lang_VoidMapperImpl extends AbstractObjectMapper<Void> implements java_lang_VoidMapper {
  public java_lang_VoidMapperImpl() {
    super("Void");
  }

  @Override
  protected JsonDeserializer<Void> newDeserializer() {
    return VoidJsonDeserializer.getInstance();
  }

  @Override
  protected JsonSerializer<Void> newSerializer() {
    return VoidJsonSerializer.getInstance();
  }
}
