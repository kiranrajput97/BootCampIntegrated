package com.cg.bookStore;

	import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.service.BookService;

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class ServiceTesting {

		@Autowired
		BookService service;

		@Test
		public void cancleOrder()
		{
			String exceptedValue="Order is Cancelled";
			String actualValue=service.cancleOrder(100);
			assertEquals(exceptedValue,actualValue);
		}
		@Test
		public void alreadyCancleOrder()
		{
			String exceptedValue="Order is already Cancelled";
			String actualValue=service.cancleOrder(100);
			assertEquals(exceptedValue,actualValue);
		}
		
		@Test
		public void cantCancelledOrder()
		{
			String exceptedValue="Cannot Cancelled Order, Order is already Shipped";
			String actualValue=service.cancleOrder(150);
			assertEquals(exceptedValue,actualValue);
		}
		@Test
		public void Null()
		{
			List<OrderInformation> expectedValue= new ArrayList<OrderInformation>();
			expectedValue=null;
			assertEquals(expectedValue,service.showOrderList());
			
		}
		
		
	}
