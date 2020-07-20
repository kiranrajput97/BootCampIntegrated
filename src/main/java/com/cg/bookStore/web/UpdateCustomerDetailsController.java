package com.cg.bookStore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.service.BookService;

@RestController
public class UpdateCustomerDetailsController {
	
	@Autowired
	BookService update;
	
	@PutMapping("/update_cust_det_address/{orderId}")
	public void updateShippingAddress(@PathVariable int orderId, @RequestBody OrderInformation orderInfo)    
	{
		update.updateShippingAddress(orderId, orderInfo.getShippingAddress());
    }
	
	@PutMapping("/update_cust_det_status/{orderId}")
	public void updateOrderStatus(@PathVariable int orderId, @RequestBody OrderInformation orderInfo)    
	{
		update.updateShippingAddress(orderId, orderInfo.getOrderStatus());
    }

}
