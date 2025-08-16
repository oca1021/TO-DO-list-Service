package com.chaechae.todo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodoListDao {

	private final static Logger logger = LoggerFactory.getLogger(TodoListDao.class);

    @Autowired
    private DataSource dataSource;
	
	public void inserTodo(TodoItemDto itemDto) {
	
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            String sql = "INSERT INTO TO_DO_ITEM (TITLE, CONTENT, START_DT, REG_DT) VALUES (?, ?, ?, ?)";
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, itemDto.getTitle());
            pstmt.setString(2, itemDto.getContent());
            pstmt.setDate(3, new Date(itemDto.getStartDt().getTime()));
            pstmt.setDate(4, new Date(itemDto.getRegDt().getTime()));
            
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
		
	}
}
