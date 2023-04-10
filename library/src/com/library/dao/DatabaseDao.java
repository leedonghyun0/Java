package com.library.dao;

import static com.library.dao.connection.DBUtil.getConnetion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.library.vo.Book;
import com.library.dao.connection.DBUtil;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getBookList() {
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet re = stmt.executeQuery("select * from book order by no");
		
		while(rs.next()) {
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String isRent = rs.getString("isRent");
			rs.getDate("regdate");
		}
		return null;
	}

	
	
	@Override
	public int insertBook(List<Book> list) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	
	
	
	@Override
	public int deleteBook(List<Book> list) {
		System.out.println("DB - 도서 삭제");
		return 0;
	}

	
	
	
	@Override
	public int updateBook(List<Book> list) {
		int res = 0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate("update book set isrent='Y' where no = " + no);
			System.out.println(res + "건 수정 되었습니다.");
			
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
