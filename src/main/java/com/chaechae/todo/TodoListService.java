package com.chaechae.todo;

import java.util.List;

public interface TodoListService {
	/**
	 * TODO : todo item insert
	 */
	public void insertTodo(TodoItemDto itemDto);

	public List<TodoItemDto> getTodoList();
	
	public int deleteTodo(TodoItemDto itemDto);

	public int updateTodo(TodoItemDto itemDto);
}
