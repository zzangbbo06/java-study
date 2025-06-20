package com.gn.dao;

import java.sql.SQLException;
import java.util.List;

import com.gn.controller.Book;

public class BoardDAO extends JDBConnection{

	public int insert(Book book){
		int result = 0;
		String sql = "INSERT INTO library (isbn, type, price)"
				+ "VALUES(?, ?, ?)";
		
		try {
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getIsbn());
			psmt.setString(2, book.getType());
			psmt.setInt(3, book.getPrice());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("게시글 등록 - 예외 발생");
			e.printStackTrace();
		}
			return result;
		
	}
		
}
