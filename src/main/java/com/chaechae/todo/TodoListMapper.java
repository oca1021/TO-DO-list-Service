package com.chaechae.todo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoListMapper {
	
	public void insertTodo(TodoItemDto itemDto);
	
}
