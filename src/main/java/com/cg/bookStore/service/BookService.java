package com.cg.bookStore.service;

import java.util.List;

import com.cg.bookStore.exceptions.BookIdNotFoundException;
import com.cg.bookStore.entities.Admin;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.entities.CartInformation;
import com.cg.bookStore.entities.CustomerReview;
import com.cg.bookStore.exceptions.BookIdException;
import com.cg.bookStore.exceptions.OrdersException;

/************************************************************************************
*          @author         Kiran Rajput
*          Description      It is a service class that provides the services for 
*                           Listing , cancel and update order Information
*          Version          1.0
*          Created Date     18-JUL-2020
************************************************************************************/

public interface BookService {
	public OrderInformation viewOrderDetails(int orderId)throws OrdersException;
	


	public boolean removeBook(String bookId)throws BookIdException,BookIdNotFoundException;
	
	

	//Cancel Order.
	public boolean findOrderById(int orderId);
	public String cancleOrder(int orderId);
	
	/************************************************************************************
	 * Method:                        List Ofder
     * Description:                   to list all the orders 
	************************************************************************************/
	
	public List<OrderInformation> showOrderList();
	
	//Update Customer Information
	public boolean updateShippingAddress(int orderId,String newAddress);
	public boolean updateOrderStatus(int orderId,String status);
	
	
}
 
