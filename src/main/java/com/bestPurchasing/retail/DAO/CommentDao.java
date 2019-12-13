package com.bestPurchasing.retail.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bestPurchasing.retail.VO.Comment;

@Repository
public class CommentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Comment CRUD
	 */
	
	public List<Comment> getAllCommentByBID(long bID) {
		String query  = "SELECT * FROM comment WHERE bID=?";
		Object[] params = { bID };
		return jdbcTemplate.query(query, params, new BeanPropertyRowMapper<Comment>(Comment.class));
	}
	
	public void createComment(long bID, String contents, long writer, Date date) {
		String query = 
				"INSERT INTO comment (cID, bID, contents, writer, date"
				+ "VALUES (?, ?, ?, ?, ?)";
		Object[] params = { this.getLastCID() + 1, bID, contents, writer, date };
		jdbcTemplate.update(query, params);
	}
	
	public void updateComment(long cID, String contents, Date date) {
		String query = 
				"UPDATE comment SET contents=?, date=? WHERE cID=?";
		Object[] params = { contents, date, cID };
		jdbcTemplate.update(query, params);
	}
	
	public void deleteComment(long cID) {
		String query = "DELETE FROM comment WHERE cID=?";
		Object[] params = { cID };
		jdbcTemplate.update(query, params);
	}
	
	public long getLastCID() {
		String query = "SELECT COUNT(cID) FROM comment";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		if(count == 0) {
			return 0;
		} else {
			query = "SELECT cID FROM comment ORDER BY cID DESC LIMIT 1";
			return jdbcTemplate.queryForObject(query, Long.class);
		}
	}
	
}
