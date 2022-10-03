package com.starhealth.springmvc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.starhealth.springmvc.entity.Book;

@Repository
public class BookDaoImp implements IBookDAO {

	Connection conn = DBUtil.getDBConnection();
	
	@Override
	public int addBook(Book book) {
		
		int count = 0;

		try {
			String insertQuery = "insert into employee(bid,bname,bprice,btype,doi) values(?,?,?,?,current_date)";
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, book.getBid());
			pstmt.setString(2, book.getBname());
			pstmt.setDouble(3, book.getBprice());
			pstmt.setString(4, book.getBtype());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
		
		
	}

	

	@Override
	public List<Book> selectAllBooks() {
		String selectQuery = "select * from books";

		PreparedStatement pstmt;

		List<Book> list = new ArrayList<Book>();
		
		try {
			pstmt = conn.prepareStatement(selectQuery);

			ResultSet rs = pstmt.executeQuery();

			

			while (rs.next()) {

				Book book = new Book();
				book.setBid(rs.getInt("bid"));
				book.setBname(rs.getString("bname"));
				book.setBprice(rs.getDouble("bprice"));
				book.setDoi(rs.getDate("doi"));
				book.setBtype(rs.getString("btype"));

				list.add(book);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

}
