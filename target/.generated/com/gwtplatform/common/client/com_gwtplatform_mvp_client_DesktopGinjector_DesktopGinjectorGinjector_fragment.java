package com.gwtplatform.common.client;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$common$client$ClientUrlUtils$_annotation$$none$$(com.gwtplatform.common.client.ClientUrlUtils injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.common.client.ClientUrlUtils declared at:
   *   Implicit GWT.create binding for com.gwtplatform.common.client.ClientUrlUtils
   */
  public com.gwtplatform.common.client.ClientUrlUtils get_Key$type$com$gwtplatform$common$client$ClientUrlUtils$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.common.client.ClientUrlUtils.class);
    assert created instanceof com.gwtplatform.common.client.ClientUrlUtils;
    com.gwtplatform.common.client.ClientUrlUtils result = (com.gwtplatform.common.client.ClientUrlUtils) created;
    
    memberInject_Key$type$com$gwtplatform$common$client$ClientUrlUtils$_annotation$$none$$(result);
    
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
