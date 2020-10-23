package com.wanfadger.todo.shared.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.wanfadger.todo.shared.models.Todo;

@Path("/todos")
//http://localhost:8080/todos
public interface TodoResource {

	@GET
	RestAction<List<Todo>> fetchTodos();
	
	@POST
	RestAction<Todo> persistTodo(Todo todo);
	
	@GET
	@Path("/{id}")
	RestAction<Todo> fetchTodoById(@PathParam("id") String id);
	
	@PUT
    @Path("/{id}")
	RestAction<Todo> updateTodo(@PathParam("id") String id , Todo todo);
	
	
	@DELETE
	@Path("/{id}")
	RestAction<Void> deteleTodoById(@PathParam("id") String id);
	
	@DELETE
	RestAction<Void> deteleTodo(Todo todo);
	
	
}
