package com.chaechae.todo;

import java.util.List;

public interface TodoListService {
	/**
	 * TODO : todo item insert
	 */
	public void insertTodo(TodoItemDto itemDto);

	public List<TodoItemDto> getTodoList();
	
    /**
     * 특정 할 일 항목을 삭제합니다.
     *
     * @param itemDto 삭제할 할 일 항목의 seq값을 담은 DTO
     * @return 삭제된 개수
     */
	public int deleteTodo(TodoItemDto itemDto);

    /**
     * 특정 할 일 항목을 수정합니다.
     *
     * @param itemDto 수정할 할 일 항목의 정보를 담은 DTO
     * @return 수정된 개수
     */
	public int updateTodo(TodoItemDto itemDto);
}
