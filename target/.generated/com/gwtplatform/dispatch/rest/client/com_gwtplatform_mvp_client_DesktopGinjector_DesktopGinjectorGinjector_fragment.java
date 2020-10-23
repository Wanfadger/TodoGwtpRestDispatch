package com.gwtplatform.dispatch.rest.client;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$rest$client$DefaultRestDispatchHooks$_annotation$$none$$(com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks injectee) {
    
  }
  
  private com.gwtplatform.dispatch.rest.client.RestDispatch singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatch$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rest.client.RestDispatch get_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatch$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatch$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rest.client.RestDispatch result = injector.getFragment_com_gwtplatform_dispatch_rest_client_core().get_Key$type$com$gwtplatform$dispatch$rest$client$core$DefaultRestDispatch$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatch$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatch$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.dispatch.rest.client.RestDispatchHooks singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatchHooks$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rest.client.RestDispatchHooks get_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatchHooks$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatchHooks$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rest.client.RestDispatchHooks result = get_Key$type$com$gwtplatform$dispatch$rest$client$DefaultRestDispatchHooks$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatchHooks$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatchHooks$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks
   */
  public com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks get_Key$type$com$gwtplatform$dispatch$rest$client$DefaultRestDispatchHooks$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks.class);
    assert created instanceof com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks;
    com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks result = (com.gwtplatform.dispatch.rest.client.DefaultRestDispatchHooks) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$rest$client$DefaultRestDispatchHooks$_annotation$$none$$(result);
    
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
