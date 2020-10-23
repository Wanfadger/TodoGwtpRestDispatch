package com.google.gwt.inject.client.multibindings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.multibindings.com_gwtplatform_mvp_client_DesktopGinjector_SetModuleGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_SetModuleGinjector_fragment {
  public native void com$google$gwt$inject$client$multibindings$ProviderForSet_registry_fieldInjection(com.google.gwt.inject.client.multibindings.ProviderForSet injectee, com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> value) /*-{
    injectee.@com.google.gwt.inject.client.multibindings.ProviderForSet::registry = value;
  }-*/;
  
  public void memberInject_Key$type$com$google$gwt$inject$client$multibindings$ProviderForSet$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$(com.google.gwt.inject.client.multibindings.ProviderForSet<com.gwtplatform.dispatch.rest.client.serialization.Serialization> injectee) {
    com$google$gwt$inject$client$multibindings$ProviderForSet_registry_fieldInjection(injectee, get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$com$google$gwt$inject$client$multibindings$Internal$());
    
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> declared at:
   *   com.google.gwt.inject.client.multibindings.InternalModule.bindInternalBindingsRegistry(InternalModule.java:69)
   */
  public com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$com$google$gwt$inject$client$multibindings$Internal$() {
    com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> result = get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for java.util.Set<com.gwtplatform.dispatch.rest.client.serialization.Serialization> declared at:
   *   com.google.gwt.inject.client.multibindings.InternalModule.bindAndExpose(InternalModule.java:60)
   */
  public java.util.Set<com.gwtplatform.dispatch.rest.client.serialization.Serialization> get_Key$type$java$util$Set$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$() {
    java.util.Set<com.gwtplatform.dispatch.rest.client.serialization.Serialization> result = get_Key$type$com$google$gwt$inject$client$multibindings$ProviderForSet$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$().get();
    return result;
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.multibindings.ProviderForSet<com.gwtplatform.dispatch.rest.client.serialization.Serialization> declared at:
   *   Implicit GWT.create binding for com.google.gwt.inject.client.multibindings.ProviderForSet<com.gwtplatform.dispatch.rest.client.serialization.Serialization>
   */
  public com.google.gwt.inject.client.multibindings.ProviderForSet<com.gwtplatform.dispatch.rest.client.serialization.Serialization> get_Key$type$com$google$gwt$inject$client$multibindings$ProviderForSet$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.inject.client.multibindings.ProviderForSet.class);
    assert created instanceof com.google.gwt.inject.client.multibindings.ProviderForSet;
    com.google.gwt.inject.client.multibindings.ProviderForSet<com.gwtplatform.dispatch.rest.client.serialization.Serialization> result = (com.google.gwt.inject.client.multibindings.ProviderForSet<com.gwtplatform.dispatch.rest.client.serialization.Serialization>) created;
    
    memberInject_Key$type$com$google$gwt$inject$client$multibindings$ProviderForSet$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> declared at:
   *   Inheriting com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> from parent
   */
  public com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$() {
    com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> result = injector.getParent().getFragment_com_google_gwt_inject_client_multibindings().get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_SetModuleGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_SetModuleGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_SetModuleGinjector injector) {
    this.injector = injector;
  }
  
}
