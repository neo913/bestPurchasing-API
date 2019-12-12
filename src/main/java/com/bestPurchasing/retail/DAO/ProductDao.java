package com.bestPurchasing.retail.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bestPurchasing.retail.VO.Product;

@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * Product CRUD
	 */
	
	public List<Product> getAllProducts() {
		String query = "SELECT * FROM product";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Product>(Product.class));
	}
	
	public Product getProduct(long pID) {
		String query = "SELECT * FROM user WHERE pID = ?";
		Object[] params = { pID };
		return jdbcTemplate.queryForObject(query, params, new BeanPropertyRowMapper<Product>(Product.class));
	}
	
	public void createProduct(String name, String brand, String category, double price, int stock, int offer, String description) {
		String query = 
						"INSERT INTO product (pID, name, brand, category, price, stock, offer, description)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] params = { this.getLastPID() + 1, name, brand, category, price, stock, 0, description };
		jdbcTemplate.update(query, params);
	}
	
	public void updateProduct(long pID, String name, String brand, String category, double price, int stock, int offer, String description) {
		String query = 
						"UPDATE product SET name=?, brand=?, category=?, price=?, stock=?, offer=?, description=? WHERE pID=?";
		
		Object[] params = { name, brand, category, price, stock, offer, description, pID };
		jdbcTemplate.update(query, params);
	}
	
	public void deleteProduct(long pID) {
		String query = "DELETE FROM product WHERE pID = ?";
		Object[] params = { pID };
		jdbcTemplate.update(query, params);
	}
	
	public long getLastPID() {
		String query = "SELECT COUNT(pID) FROM product";
		int count = jdbcTemplate.queryForObject(query,  Integer.class);
		if(count == 0) {
			return 0;
		} else {
			query = "SELECT pID FROM product ORDER BY pID DESC LIMIT 1";
			return jdbcTemplate.queryForObject(query, Long.class);
		}
	}
	
}
