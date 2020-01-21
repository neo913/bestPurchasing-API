package com.bestPurchasing.retail.HOME;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestPurchasing.retail.DAO.ProductDao;
import com.bestPurchasing.retail.VO.Product;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductAPI {

	@Autowired
	private ProductDao productDao;
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		List<Product> products = productDao.getAllProducts();
		return products;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public Product getProduct(long pID) {
		Product product = productDao.getProduct(pID);
		return product;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public void createProduct(String name, String brand, String category, double price, int stock, int offer, String description) {
		productDao.createProduct(name, brand, category, price, stock, offer, description);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	public void updateProduct(long pID, String name, String brand, String category, double price, int stock, int offer, String description) {
		productDao.updateProduct(pID, name, brand, category, price, stock, offer, description);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.DELETE)
	public void deleteProduct(long pID) {
		productDao.deleteProduct(pID);
	}
	
}
