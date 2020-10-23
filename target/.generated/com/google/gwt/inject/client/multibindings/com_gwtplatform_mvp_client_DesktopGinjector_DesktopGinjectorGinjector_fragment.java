package com.google.gwt.inject.client.multibindings;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$_annotation$$none$$(com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry injectee) {
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> declared at:
   *   com.google.gwt.inject.client.multibindings.GinMultibinder.install(GinMultibinder.java:125)
   */
  public com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$() {
    com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> result = injector.getChild_com_gwtplatform_mvp_client_DesktopGinjector_RuntimeBindingsRegistryModuleGinjector().getFragment_com_google_gwt_inject_client_multibindings().get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for java.util.Set<com.gwtplatform.dispatch.rest.client.serialization.Serialization> declared at:
   *   com.google.gwt.inject.client.multibindings.GinMultibinder.install(GinMultibinder.java:126)
   */
  public java.util.Set<com.gwtplatform.dispatch.rest.client.serialization.Serialization> get_Key$type$java$util$Set$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$() {
    java.util.Set<com.gwtplatform.dispatch.rest.client.serialization.Serialization> result = injector.getChild_com_gwtplatform_mvp_client_DesktopGinjector_SetModuleGinjector().getFragment_com_google_gwt_inject_client_multibindings().get_Key$type$java$util$Set$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry declared at:
   *   Implicit GWT.create binding for com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry
   */
  public com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry.class);
    assert created instanceof com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry;
    com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry result = (com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry) created;
    
    memberInject_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$_annotation$$none$$(result);
    
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
