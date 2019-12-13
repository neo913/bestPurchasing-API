package com.bestPurchasing.retail.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bestPurchasing.retail.VO.Orders;

@Repository
public class OrdersDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Order CRUD
	 */
	
	public List<Orders> getAllOrders() {
		String query = "SELECT * FROM orders";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Orders>(Orders.class));
	}
	
	public Orders getOrder(long oID) {
		String query = "SELECT * FROM orders WHERE oID=?";
		Object[] params = { oID };
		return jdbcTemplate.queryForObject(query, params, new BeanPropertyRowMapper<Orders>(Orders.class));
	}
	
	public Orders getOrderByUID(long uID) {
		String query = "SELECT * FROM orders WHERE uID=?";
		Object[] params = { uID };
		return jdbcTemplate.queryForObject(query, params, new BeanPropertyRowMapper<Orders>(Orders.class));
	}
	
	public void createOrder(long uID, String products, String address1, String address2, String province, String postal, String note, String paidMethod, String cardNumber, double totalPrice, boolean paid) {
		String query = 
				"INSERT INTO orders (oID, uID, products, date, address1, address2, province, postal, note, paidMethod, cardNumber, totalPrice, paid)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] params = { this.getLastOID() + 1, uID, products, getCurrentTime(), address1, address2, province, postal, note, paidMethod, cardNumber, totalPrice, paid };
		jdbcTemplate.update(query, params);
	}
	
	public void updateOrder(long oID, long uID, String products, String address1, String address2, String province, String postal, String note, String paidMethod, String cardNumber, double totalPrice, boolean paid) {
		String query = 
				"UPDATE orders SET products=?, address1=?, address2=?, province=?, postal=?, note=?, paidMethod=?, cardNumber=?, totalPrice=?, paid=? WHERE oID=?";
		Object[] params = { products, address1, address2, province, postal, note, paidMethod, cardNumber, totalPrice, paid, oID };
		jdbcTemplate.update(query, params);
	}
	
	public void deleteOrder(long oID) {
		String query = "DELETE FROM orders WHERE oID=?";
		Object[] params = { oID };
		jdbcTemplate.update(query, params);
	}
	
	public long getLastOID() {
		String query = "SELECT COUNT(oID) FROM orders";
		int count = jdbcTemplate.queryForObject(query,  Integer.class);
		if(count == 0) {
			return 0;
		} else {
			query = "SELECT oID FROM orders ORDER BY oID DESC LIMIT 1";
			return jdbcTemplate.queryForObject(query, Long.class);
		}
	}
	public Date getCurrentTime() {
		return new Date();
	}
}
