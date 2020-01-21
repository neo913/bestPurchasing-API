package com.bestPurchasing.retail.HOME;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestPurchasing.retail.DAO.CommentDao;
import com.bestPurchasing.retail.VO.Comment;
import com.bestPurchasing.retail.VO.Product;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CommentAPI {

	@Autowired
	private CommentDao commentDao;
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getAllCommentByBID", method = RequestMethod.GET)
	public List<Comment> getAllCommentByBID(long bID) {
		List<Comment> comments = commentDao.getAllCommentByBID(bID);
		return comments;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/createComment", method = RequestMethod.POST)
	public void createComment(long bID, String contents, long writer, Date date) {
		commentDao.createComment(bID, contents, writer, date);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/updateComment", method = RequestMethod.PUT)
	public void updateComment(long cID, String contents, Date date) {
		commentDao.updateComment(cID, contents, date);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/deleteComment", method = RequestMethod.DELETE)
	public void deleteComment(long cID) {
		commentDao.deleteComment(cID);
	}
	
}
