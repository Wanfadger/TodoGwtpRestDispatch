package com.gwtplatform.dispatch.rest.client.interceptor;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$DefaultRestInterceptorRegistry$_annotation$$none$$(com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry injectee) {
    
  }
  
  private com.gwtplatform.dispatch.rest.client.interceptor.RestInterceptorRegistry singleton_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$RestInterceptorRegistry$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rest.client.interceptor.RestInterceptorRegistry get_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$RestInterceptorRegistry$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$RestInterceptorRegistry$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rest.client.interceptor.RestInterceptorRegistry result = get_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$DefaultRestInterceptorRegistry$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$RestInterceptorRegistry$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$RestInterceptorRegistry$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry
   */
  public com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry get_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$DefaultRestInterceptorRegistry$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry.class);
    assert created instanceof com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry;
    com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry result = (com.gwtplatform.dispatch.rest.client.interceptor.DefaultRestInterceptorRegistry) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$rest$client$interceptor$DefaultRestInterceptorRegistry$_annotation$$none$$(result);
    
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
