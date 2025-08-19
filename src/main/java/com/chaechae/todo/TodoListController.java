package com.chaechae.todo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@CrossOrigin("*")
public class TodoListController {
	

	private final static Logger logger = LoggerFactory.getLogger(TodoListController.class);


	@Autowired
	private TodoListService listService;
	
	
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
	public Map<String, Integer> getTodoView(@RequestParam int seq) {
		logger.info("TodoListContoller getTodoView start");
		logger.info("===Params===");
		logger.info("seq  : " + seq);
		logger.info("============");
		logger.info("to-do item(" + seq + ") select");
		logger.info("TOdoListContoller getTodoView end");
		
		Map<String, Integer> map = new HashMap<>();
		map.put("seq", seq);
		return map;
	}	

	/**
	 * TODO : 투두리스트 생성
	 */
	@PostMapping("/insertTodo")
	public ResponseEntity<String> insertTodo(@RequestBody TodoItemDto itemDto) {
		logger.info("TodoListContoller insertTodo start");
		logger.info("title : " + itemDto.getTitle() );
		logger.info("content : " + itemDto.getContent() );
		logger.info("startDt : " + itemDto.getStartDt() );
		logger.info("comleted :" + itemDto.isCompleted() );
		logger.info("regDt : " + itemDto.getRegDt() );
		
		// 필수값 체크(제목)
		if( itemDto.getTitle() == null ) {
			return new ResponseEntity<String>("제목을 입력해주세요.", HttpStatus.EXPECTATION_FAILED);
		}
		// 필수값 체크(시작일)
		if( itemDto.getStartDt() == null ) {
			return new ResponseEntity<String>("시작 일자를 지정해주세요.", HttpStatus.EXPECTATION_FAILED);
		}
		
		// 길이 체크(제목)
		if( itemDto.getTitle().length() > 255 ) {
			return new ResponseEntity<String>("제목 길이를 200글자 이내로 작성해주세요.", HttpStatus.EXPECTATION_FAILED);
		}

		// 길이 체크(내용)
		if( itemDto.getContent() != null && itemDto.getContent().length() > 3000 ) {
			return new ResponseEntity<String>("내용의 길이를 3000글자 이내로 작성해주세요.", HttpStatus.EXPECTATION_FAILED);
		}
		
		try {
			listService.insertTodo(itemDto);
		} catch( Exception e ) {
			return new ResponseEntity<String>("전산팀에 문의하세요.", HttpStatus.EXPECTATION_FAILED);
		}
		
		return new ResponseEntity<String>("등록이 완료되었습니다.", HttpStatus.CREATED);
	}	

	/**
	 * TODO : 투두리스트 수정  
	 */
		
	/**
	 * TODO : 투두리스트 삭제 
	 */	
	

	
}
