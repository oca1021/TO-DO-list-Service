package com.chaechae.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TodoListController {
	private final static Logger logger = LoggerFactory.getLogger(TodoListController.class);
	/**
	 * TODO : 투두리스트 전체 조회
	 */
	@GetMapping("/todoAllList")
	public boolean getTodoAllList() {
		
		
		return true;
	}
	
	/**
	 * TODO : 투두리스트 상세 조회
	 */
	@GetMapping("/todoView")
	public int getTodoView(@RequestParam int seq) {
		logger.info("TodoListContoller getTodoView start");
		logger.info("===Params===");
		logger.info("seq  : " + seq);
		logger.info("============");
		logger.info("to-do item(" + seq + ") select");
		logger.info("TOdoListContoller getTodoView end");
		
		return seq;
	}	
	
	

	/**
	 * TODO : 투두리스트 생성
	 */
	
	/**
	 * TODO : 투두리스트 수정  
	 */
		
	/**
	 * TODO : 투두리스트 삭제 
	 */	


	
}
