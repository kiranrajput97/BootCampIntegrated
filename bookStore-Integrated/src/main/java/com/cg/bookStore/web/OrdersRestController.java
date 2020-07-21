package com.cg.bookStore.web;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.cg.bookStore.exceptions.BookIdNotFoundException;
import com.cg.bookStore.entities.Admin;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.entities.CartInformation;
import com.cg.bookStore.entities.CustomerReview;
import com.cg.bookStore.exceptions.BookIdException;
import com.cg.bookStore.exceptions.OrdersException;
import com.cg.bookStore.service.BookService;
import com.cg.bookStore.util.OrderConstraints;

import org.springframework.http.HttpStatus;

/************************************************************************************
*          @author          Kiran Rajput
*          Description      It is a controller class that process action for 
*                           listing, deleting, cancel and view orders
*          Version          1.0
*          Created Date     18-Jul-2020
************************************************************************************/

@RestController
public class OrdersRestController {

	@Autowired
	public BookService service;

	@GetMapping("/viewOrderDetailsById/{orderId}")
	public OrderInformation viewOrderDetails(@RequestParam int orderId) throws OrdersException
	{
		return service.viewOrderDetails(orderId);	
	}

	@DeleteMapping("/deletebook/{bookId}")
	public String deleteBook(@PathVariable("bookId")String bookId)throws BookIdException,
	BookIdNotFoundException
	{	
	   	service.removeBook(bookId);
	   	return "Successfully Deleted";	
	}
	
	/************************************************************************************
	 * Method:                      cancel orders
     * Description:                  To cancel order
	 * @param listOrders	         cancel orders
	 * @throws BookIdException 
	 * @throws OrdersException 
	 * @mapping GetMapping           Make HTTP request to get all appointments 
	************************************************************************************/
	@GetMapping("/cancelOrder/{orderId}")
	public ResponseEntity<String> cancelOrder(@PathVariable int orderId) throws BookIdException 
		{
		/*
		String order_Id=Integer.toString(orderId);
		if(!(order_Id.matches("[0-9]+")))
			
		{
			throw new BookIdException("It must be digit");
		}
		*/
		
		String result="Order Id Not Found";
		if(service.findOrderById(orderId))
		{			
			result=service.cancleOrder(orderId);
			return new ResponseEntity<String>(result,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}
	
		/************************************************************************************
		 * Method:                       List all orders
	     * Description:                  To List all orders
		 * @param listOrders	         List all orders
		 * @mapping GetMapping           Make HTTP request to get all appointments 
		************************************************************************************/
		@GetMapping("/listOrders")
		public List<OrderInformation> showOrder() throws OrdersException
	{
		
		List<OrderInformation> orders = service.showOrderList();
		if(orders==null)
		{
			throw new OrdersException("order list is null");
		}
		return orders;	
	}
}
