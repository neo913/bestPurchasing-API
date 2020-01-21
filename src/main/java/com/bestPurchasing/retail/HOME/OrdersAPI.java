package com.bestPurchasing.retail.HOME;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestPurchasing.retail.DAO.OrdersDao;
import com.bestPurchasing.retail.VO.Orders;
import com.bestPurchasing.retail.VO.Product;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrdersAPI {

	@Autowired
	private OrdersDao ordersDao;
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
	public List<Orders> getAllOrders() {
		List<Orders> orders = ordersDao.getAllOrders();
		return orders;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getOrder", method = RequestMethod.GET)
	public Orders getOrder(long oID) {
		Orders order = ordersDao.getOrder(oID);
		return order;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getOrderByUID", method = RequestMethod.GET)
	public Orders getOrderByUID(long uID) {
		Orders order = ordersDao.getOrder(uID);
		return order;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	public void createOrder(long uID, String products, String address1, String address2, String province, String postal, String note, String paidMethod, String cardNumber, double totalPrice, boolean paid) {
		ordersDao.createOrder(uID, products, address1, address2, province, postal, note, paidMethod, cardNumber, totalPrice, paid);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/updateOrder", method = RequestMethod.PUT)
	public void updateOrder(long oID, long uID, String products, String address1, String address2, String province, String postal, String note, String paidMethod, String cardNumber, double totalPrice, boolean paid) {
		ordersDao.updateOrder(oID, uID, products, address1, address2, province, postal, note, paidMethod, cardNumber, totalPrice, paid);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/deleteOrder", method = RequestMethod.DELETE)
	public void deleteOrder(long oID) {
		ordersDao.deleteOrder(oID);
	}
	
}
