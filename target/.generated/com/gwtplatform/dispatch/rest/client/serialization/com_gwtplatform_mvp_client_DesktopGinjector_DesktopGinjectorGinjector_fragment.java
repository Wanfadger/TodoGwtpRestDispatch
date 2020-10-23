package com.gwtplatform.dispatch.rest.client.serialization;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization$_annotation$$none$$(com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProviderImpl$_annotation$$none$$(com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl injectee) {
    
  }
  
  private com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProvider$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProvider$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProvider$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider result = get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProviderImpl$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProvider$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProvider$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization declared at:
   *   Implicit binding for com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization
   */
  public com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization$_annotation$$none$$() {
    com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization result = com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization_com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization_methodInjection(get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProvider$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization_com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization_methodInjection(com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider _0) {
    return new com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization(_0);
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl
   */
  public com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProviderImpl$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl.class);
    assert created instanceof com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl;
    com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl result = (com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JacksonMapperProviderImpl$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
