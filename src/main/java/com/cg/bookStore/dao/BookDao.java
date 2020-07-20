package com.cg.bookStore.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.bookStore.entities.Admin;


import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.entities.CartInformation;
import com.cg.bookStore.entities.CustomerReview;

/************************************************************************************
 *          @author          Kiran Rajput
 *          Description      It is a dao class that provides the methods for listing,
 *          deleting, cancel and view orders
 *          Version             1.0
 *          Created Date     18-JUL-2020
 ************************************************************************************/
@Repository
public interface BookDao {

	public OrderInformation viewOrderDetails(int orderId);
	
	public boolean removeBook(int bookId);
	
	//Cancle Order
		public boolean findOrder(int orderId);
		public OrderInformation getOrderDetails(int orderId);
		public void updateOrderStatus(int orderId,String orderStatus);
		
		/************************************************************************************
		 * Method:                        List order information
	     * Description:                   To fetch the details of the order 
		 * @param getAppointment          List information
		 ************************************************************************************/
		  public List<OrderInformation> showListOrder();
		
		  //Update Customer Information
		
		  public OrderInformation getOrderById(int orderId);
		public boolean updateOrderInfo(OrderInformation orderInfo);
	

	
    
}
