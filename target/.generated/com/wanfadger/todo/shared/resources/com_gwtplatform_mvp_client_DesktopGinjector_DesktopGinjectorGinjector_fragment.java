package com.wanfadger.todo.shared.resources;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$wanfadger$todo$shared$resources$TodoResourceImpl$_annotation$$none$$(com.wanfadger.todo.shared.resources.TodoResourceImpl injectee) {
    
  }
  
  private com.wanfadger.todo.shared.resources.TodoResource singleton_Key$type$com$wanfadger$todo$shared$resources$TodoResource$_annotation$$none$$ = null;
  
  public com.wanfadger.todo.shared.resources.TodoResource get_Key$type$com$wanfadger$todo$shared$resources$TodoResource$_annotation$$none$$() {
    
    if (singleton_Key$type$com$wanfadger$todo$shared$resources$TodoResource$_annotation$$none$$ == null) {
    com.wanfadger.todo.shared.resources.TodoResource result = get_Key$type$com$wanfadger$todo$shared$resources$TodoResourceImpl$_annotation$$none$$();
        singleton_Key$type$com$wanfadger$todo$shared$resources$TodoResource$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$wanfadger$todo$shared$resources$TodoResource$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.wanfadger.todo.shared.resources.TodoResourceImpl declared at:
   *   Implicit GWT.create binding for com.wanfadger.todo.shared.resources.TodoResourceImpl
   */
  public com.wanfadger.todo.shared.resources.TodoResourceImpl get_Key$type$com$wanfadger$todo$shared$resources$TodoResourceImpl$_annotation$$none$$() {
    Object created = GWT.create(com.wanfadger.todo.shared.resources.TodoResourceImpl.class);
    assert created instanceof com.wanfadger.todo.shared.resources.TodoResourceImpl;
    com.wanfadger.todo.shared.resources.TodoResourceImpl result = (com.wanfadger.todo.shared.resources.TodoResourceImpl) created;
    
    memberInject_Key$type$com$wanfadger$todo$shared$resources$TodoResourceImpl$_annotation$$none$$(result);
    
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
