package com.chaechae.todo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoListMapper {
	
	public void insertTodo(TodoItemDto itemDto);
	
	public List<TodoItemDto> getTodoList();
	
	public int deleteTodo(TodoItemDto itemDto);
	
}
