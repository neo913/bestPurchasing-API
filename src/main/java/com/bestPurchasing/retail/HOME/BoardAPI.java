package com.bestPurchasing.retail.HOME;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestPurchasing.retail.DAO.BoardDao;
import com.bestPurchasing.retail.VO.Board;
import com.bestPurchasing.retail.VO.Product;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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
	@GetMapping("/getAllBoard")
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
	@GetMapping("/getBoard")
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
	@GetMapping("/createBoard")
	public void createBoard(String title, long writer, String contents, String comments) {
		boardDao.createBoard(title, writer, contents, comments);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@GetMapping("/updateBoard")
	public void updateBoard(long bID, String title, long writer, String contents, String comments, Date date) {
		boardDao.updateBoard(bID, title, writer, contents, comments, date);
	}
	
	@ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Product.class),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 500, message = "Failure")})
	@GetMapping("/deleteBoard")
	public void deletBoard(long bID) {
		boardDao.deleteBoard(bID);
	}
}
