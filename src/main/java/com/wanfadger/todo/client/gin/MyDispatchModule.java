package com.wanfadger.todo.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.dispatch.rest.client.gin.RestDispatchAsyncModuleBuilder;

public class MyDispatchModule extends AbstractGinModule {

	@Override
	protected void configure() {
	    RestDispatchAsyncModuleBuilder builder = new RestDispatchAsyncModuleBuilder();
	    
	    install(builder.build());
	    
	    bindConstant().annotatedWith(RestApplicationPath.class).to("http://localhost:8080");

	}

}
