package com.bestPurchasing.retail.HOME;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestPurchasing.retail.DAO.UserDao;
import com.bestPurchasing.retail.VO.User;

 	
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserAPI {

	@Autowired
	private UserDao userDao;
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = User.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		List<User> users = userDao.getAllUsers();
		return users;
	}
	
	@ApiResponses(value = { 
	@ApiResponse(code = 200, message = "Success", response = User.class),
	@ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"),
	@ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser(long uID) {
		User user = userDao.getUser(uID);
		return user;
	}
	
	@ApiResponses(value = { 
	@ApiResponse(code = 200, message = "Success", response = User.class),
	@ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"),
	@ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public void createUser(String uName, String fName, String lName, String address1, String address2, String province, String postal, String phone) {
		userDao.createUser(uName, fName, lName, address1, address2, province, postal, phone);
	}
	
	@ApiResponses(value = { 
	@ApiResponse(code = 200, message = "Success", response = User.class),
	@ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"),
	@ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public void updateUser(long uID, String uName, String fName, String lName, String address1, String address2, String province, String postal, String phone, String note) {
		userDao.updateUser(uID, uName, fName, lName, address1, address2, province, postal, phone, note);
	}
	
	@ApiResponses(value = { 
	@ApiResponse(code = 200, message = "Success", response = User.class),
	@ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"),
	@ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	public void deleteuser(long uID) {
		userDao.deleteUser(uID);
	}
	
}
