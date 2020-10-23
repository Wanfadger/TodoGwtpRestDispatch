package com.gwtplatform.mvp.shared.proxy;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$mvp$shared$proxy$PlaceTokenRegistry$_annotation$$none$$(com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter$_annotation$$none$$(com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter injectee) {
    
  }
  
  private com.gwtplatform.mvp.shared.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.shared.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.shared.proxy.TokenFormatter result = get_Key$type$com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry declared at:
   *   Implicit GWT.create binding for com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry
   */
  public com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry get_Key$type$com$gwtplatform$mvp$shared$proxy$PlaceTokenRegistry$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry.class);
    assert created instanceof com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry;
    com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry result = (com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry) created;
    
    memberInject_Key$type$com$gwtplatform$mvp$shared$proxy$PlaceTokenRegistry$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter declared at:
   *   Implicit binding for com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter
   */
  public com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter get_Key$type$com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter$_annotation$$none$$() {
    com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter result = com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter_com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter_methodInjection(injector.getFragment_com_gwtplatform_common_shared().get_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$shared$proxy$PlaceTokenRegistry$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter_com$gwtplatform$mvp$shared$proxy$RouteTokenFormatter_methodInjection(com.gwtplatform.common.shared.UrlUtils _0, com.gwtplatform.mvp.shared.proxy.PlaceTokenRegistry _1) {
    return new com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
