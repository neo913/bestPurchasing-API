package com.bestPurchasing.retail.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bestPurchasing.retail.VO.Board;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Board CRUD
	 */
	
	public List<Board> getAllBoard() {
		String query = "SELECT * FROM board";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Board>(Board.class));
	}
	
	public Board getBoard(long bID) {
		String query = "SELECT * FROM board WHERE bID=?";
		Object[] params = { bID };
		return jdbcTemplate.queryForObject(query, params, new BeanPropertyRowMapper<Board>(Board.class));
	}
	
	public void createBoard(String title, long writer, String contents, String comments) {
		String query = 
				"INSERT INTO board (bID, title, writer, contents, comments, date)"
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		Object[] params = { this.getLastbID() + 1, title, writer, contents, comments, this.getCurrentTime() };
		jdbcTemplate.update(query, params);
	}
	
	public void updateBoard(long bID, String title, long writer, String contents, String comments, Date date) {
		String query = 
				"UPDATE board SET bid=?, title=?, writer=?, contents=?, comments=?, date=?";
		Object[] params = { bID, title, writer, contents, comments, date };
		jdbcTemplate.update(query, params);
	}
	
	public void deleteBoard(long bID) {
		String query = "DELETE FROM board WHERE bID=?";
		Object[] params = { bID };
		jdbcTemplate.update(query, params);
	}
		
	public long getLastbID() {
		String query = "SELECT COUNT(bID) FROM board";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		if(count == 0) {
			return 0;
		} else {
			query = "SELECT bID FROM board ORDER BY bID DESC LIMIT 1";
			return jdbcTemplate.queryForObject(query, Long.class);
		}
	}
	
	public Date getCurrentTime() {
		return new Date();
	}
		
}
