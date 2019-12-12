package com.bestPurchasing.retail.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bestPurchasing.retail.VO.Order;

@Repository
public class OrderDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Order CRUD
	 */
	
	public List<Order> getAllOrders() {
		String query = "SELECT * FROM order";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Order>(Order.class));
	}
	
	public Order getOrder(long oID) {
		String query = "SELECT * FROM order WHERE oID=?";
		Object[] params = { oID };
		return jdbcTemplate.queryForObject(query, params, new BeanPropertyRowMapper<Order>(Order.class));
	}
	
	public void createOrder(long uID, String products, String address1, String address2, String province, String postal, String note) {
		String query = 
				"INSERT INTO order (oID, uId, products, date, address1, address2, province, postal, note)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] params = { this.getLastOID() + 1, uID, products, getCurrentTime(), address1, address2, province, postal, note };
		jdbcTemplate.update(query, params);
	}
	
	public long getLastOID() {
		return 0;	// temp
	}
	public Date getCurrentTime() {
		return new Date();
	}
}
