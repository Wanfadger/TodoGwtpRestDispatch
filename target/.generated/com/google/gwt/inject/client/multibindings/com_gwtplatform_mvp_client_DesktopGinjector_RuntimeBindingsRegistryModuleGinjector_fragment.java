package com.google.gwt.inject.client.multibindings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.multibindings.com_gwtplatform_mvp_client_DesktopGinjector_RuntimeBindingsRegistryModuleGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_RuntimeBindingsRegistryModuleGinjector_fragment {
  private com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> singleton_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$ = null;
  
  public com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$() {
    
    if (singleton_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$ == null) {
    com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry<com.google.inject.Provider<com.gwtplatform.dispatch.rest.client.serialization.Serialization>> result = get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$_annotation$$none$$();
        singleton_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$com$google$inject$Provider$com$gwtplatform$dispatch$rest$client$serialization$Serialization$$$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry declared at:
   *   Inheriting com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry from parent
   */
  public com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$_annotation$$none$$() {
    com.google.gwt.inject.client.multibindings.RuntimeBindingsRegistry result = injector.getParent().getFragment_com_google_gwt_inject_client_multibindings().get_Key$type$com$google$gwt$inject$client$multibindings$RuntimeBindingsRegistry$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_RuntimeBindingsRegistryModuleGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_RuntimeBindingsRegistryModuleGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_RuntimeBindingsRegistryModuleGinjector injector) {
    this.injector = injector;
  }
  
}
