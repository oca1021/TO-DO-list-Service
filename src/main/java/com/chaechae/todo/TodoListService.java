package com.chaechae.todo;

import java.util.List;

/**
 * 투두리스트(Todo list)와 관련된 비즈니스 로직을 처리하는 서비스 인터페이스입니다.
 * 이 인터페이스는 할 일 항목의 생성, 목록 조회, 상세 조회, 수정, 삭제 기능을 정의합니다.
 * TODO: 다건 수정, 다건 삭제 기능 추가 및 목록 조회 시 페이징, 정렬, 조건 추가 필요
 */
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
