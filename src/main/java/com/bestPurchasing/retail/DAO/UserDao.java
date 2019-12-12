package com.bestPurchasing.retail.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bestPurchasing.retail.VO.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * User CRUD
	 */
	public List<User> getAllUsers() {
		String query = "SELECT * FROM user";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<User>(User.class));
	}
	
	public User getUser(long uID) {
		String query = "SELECT * FROM user WHERE uID = ?";
		Object[] params = { uID };
		return jdbcTemplate.queryForObject(query, params, new BeanPropertyRowMapper<User>(User.class));
	}
	
	public void createUser(String uName, String fName, String lName, String address1, String address2, String province, String postal, String phone) {
		String query = 
						"INSERT INTO user (uID, uName, fName, lName, address1, address2, province, postal, phone, note) "
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] params = { this.getlastUID() + 1, uName, fName, lName, address1, address2, province, postal, phone, "" };
		jdbcTemplate.update(query, params);
	}
	
	public void updateUser(long uID, String uName, String fName, String lName, String address1, String address2, String province, String postal, String phone, String note) {
		String query = 
						"UPDATE user SET uName=?, fName=?, lName=?, address1=?, addres2=?, province=?, postal=?, phone=?, note=? WHERE uID=? ";
		Object[] params = { uName, fName, lName, address1, address2, province, postal, phone, note, uID };
		jdbcTemplate.update(query, params);
	}
	
	public void deleteUser(long uID) {	// Just in case - will not be used
		String query = "DELETE FROM user WHERE uID = ?";
		Object[] params = { uID };
		jdbcTemplate.update(query, params);
	}
	
	public long getlastUID() {
		String query = "SELECT COUNT(uID) FROM user";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		if(count == 0) {
			return 0;
		} else {
			query = "SELECT uID FROM user ORDER BY uID DESC LIMIT 1";
			return jdbcTemplate.queryForObject(query,  Long.class);
		}
	}
	
}
