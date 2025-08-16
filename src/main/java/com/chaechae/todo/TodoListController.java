package com.chaechae.todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TodoListController {
	
	private final static Logger logger = LoggerFactory.getLogger(TodoListController.class);

    @Autowired
    private DataSource dataSource;
	
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
	public void insertTodo(int seq) {
		logger.info("TodoListContoller insertTodo start");
		logger.info("seq : " + seq );
		
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            String sql = "INSERT INTO TO_DO_ITEM (SEQ) VALUES (?)";
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, seq);
            pstmt.executeUpdate();
        } catch( SQLException e ) {
            logger.error("DB INSERT failed: {}", e.getMessage());
            e.printStackTrace();
        } finally {

            try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
	};
	
	/**
	 * TODO : 투두리스트 수정  
	 */
		
	/**
	 * TODO : 투두리스트 삭제 
	 */	


	
}
