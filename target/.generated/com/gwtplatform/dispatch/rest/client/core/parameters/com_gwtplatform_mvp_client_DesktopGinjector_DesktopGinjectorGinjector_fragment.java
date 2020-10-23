package com.gwtplatform.dispatch.rest.client.core.parameters;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory$_annotation$$none$$(com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory injectee) {
    
  }
  
  private com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory singleton_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$HttpParameterFactory$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory get_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$HttpParameterFactory$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$HttpParameterFactory$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rest.client.core.parameters.HttpParameterFactory result = get_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$HttpParameterFactory$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$HttpParameterFactory$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory declared at:
   *   Implicit binding for com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory
   */
  public com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory get_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory$_annotation$$none$$() {
    com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory result = com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory_com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory_methodInjection(injector.getFragment_com_gwtplatform_common_shared().get_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$dispatch$rest$client$annotations$DefaultDateFormat$());
    memberInject_Key$type$com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory_com$gwtplatform$dispatch$rest$client$core$parameters$DefaultHttpParameterFactory_methodInjection(com.gwtplatform.common.shared.UrlUtils _0, java.lang.String _1) {
    return new com.gwtplatform.dispatch.rest.client.core.parameters.DefaultHttpParameterFactory(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
