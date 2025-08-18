package com.chaechae.todo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListServiceImpl implements TodoListService {

	private final static Logger logger = LoggerFactory.getLogger(TodoListServiceImpl.class);

	@Autowired
	private TodoListMapper listMapper;
	
	/**
	 * TODO : todo item insert 인터페이스 구현
	 */
	@Override
	public void insertTodo(TodoItemDto itemDto) {
		logger.info("TodoListServiceImpl insertTodo start");
		
		itemDto.setRegtDt(new Date());
		// mapper		
		listMapper.insertTodo(itemDto);
		
	}

	
	
}
