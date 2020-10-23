package com.gwtplatform.dispatch.rest.client.serialization;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.multibindings.com_gwtplatform_mvp_client_DesktopGinjector_BindingRegistererModuleGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_BindingRegistererModuleGinjector_fragment {
  private com.gwtplatform.dispatch.rest.client.serialization.Serialization singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$Serialization$_annotation$$com$google$gwt$inject$client$multibindings$Internal$ = null;
  
  public com.gwtplatform.dispatch.rest.client.serialization.Serialization get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$Serialization$_annotation$$com$google$gwt$inject$client$multibindings$Internal$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$Serialization$_annotation$$com$google$gwt$inject$client$multibindings$Internal$ == null) {
    com.gwtplatform.dispatch.rest.client.serialization.Serialization result = get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$Serialization$_annotation$$com$google$gwt$inject$client$multibindings$Internal$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$client$serialization$Serialization$_annotation$$com$google$gwt$inject$client$multibindings$Internal$;
    
  }
  
  
  /**
   * Binding for com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization> declared at:
   *   Implicit provider for @com.google.gwt.inject.client.multibindings.Internal() com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>
   */
  public com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization> get_Key$type$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$com$google$gwt$inject$client$multibindings$Internal$() {
    com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization> result = new com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>() { 
      public com.gwtplatform.dispatch.rest.client.serialization.Serialization get() { 
        return get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$Serialization$_annotation$$com$google$gwt$inject$client$multibindings$Internal$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization declared at:
   *   Inheriting com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization from parent
   */
  public com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization$_annotation$$none$$() {
    com.gwtplatform.dispatch.rest.client.serialization.JsonSerialization result = injector.getParent().getFragment_com_gwtplatform_dispatch_rest_client_serialization().get_Key$type$com$gwtplatform$dispatch$rest$client$serialization$JsonSerialization$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_BindingRegistererModuleGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_BindingRegistererModuleGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_BindingRegistererModuleGinjector injector) {
    this.injector = injector;
  }
  
}
