package com.bestPurchasing.retail.HOME;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestPurchasing.retail.DAO.BoardDao;
import com.bestPurchasing.retail.VO.Board;
import com.bestPurchasing.retail.VO.Product;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BoardAPI {

	@Autowired
	private BoardDao boardDao;
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getAllBoard", method = RequestMethod.GET)
	public List<Board> getAllBoard() {
		List<Board> boards = boardDao.getAllBoard();
		return boards;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/getBoard", method = RequestMethod.GET)
	public Board getBoard(long bID) {
		Board board = boardDao.getBoard(bID);
		return board;
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/createBoard", method = RequestMethod.POST)
	public void createBoard(String title, long writer, String contents, String comments) {
		boardDao.createBoard(title, writer, contents, comments);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/updateBoard", method = RequestMethod.PUT)
	public void updateBoard(long bID, String title, long writer, String contents, String comments, Date date) {
		boardDao.updateBoard(bID, title, writer, contents, comments, date);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(value = "/deleteBoard", method = RequestMethod.DELETE)
	public void deletBoard(long bID) {
		boardDao.deleteBoard(bID);
	}
}
