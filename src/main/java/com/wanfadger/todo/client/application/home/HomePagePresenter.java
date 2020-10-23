package com.wanfadger.todo.client.application.home;

import java.util.List;

import javax.inject.Inject;

import com.wanfadger.todo.client.application.ApplicationPresenter;
import com.wanfadger.todo.client.place.NameTokens;
import com.wanfadger.todo.shared.models.Todo;
import com.wanfadger.todo.shared.resources.TodoResource;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.client.RestDispatch;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
    interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }

    private RestDispatch restDispatch;
    
    private TodoResource todoResource;
    
    @Inject
    HomePagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy , RestDispatch restDispatch , TodoResource todoResource) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
      this.restDispatch = restDispatch;
      this.todoResource = todoResource;
    }
    
    
    @Override
    protected void onBind() {
    	// TODO Auto-generated method stub
    	super.onBind();
        
    	restDispatch.execute(todoResource.fetchTodos(), new AsyncCallback<List<Todo>>() {
		  @Override
		public void onFailure(Throwable caught) {
			GWT.log("something went wrong from the server "+caught.getMessage());
		}
		  
		  @Override
			public void onSuccess(List<Todo> result) {
				GWT.log("sucess "+result);
				
			}
    	});
    	
    }
    
    
    
    
    
}