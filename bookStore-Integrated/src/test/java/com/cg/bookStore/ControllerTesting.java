package com.cg.bookStore;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class ControllerTesting extends BookStoreApplicationTests{

	/*
	@Autowired
	private WebApplicationContext webApplicationContext;

	
	
	
	private MockMvc mockMvc;
	
	
	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
	}
	
	//demo test
		@Test
		public void demoTest() throws Exception
		{
		
			MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/DemoTest").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Hello"))
			.andDo(print()));
		
		}
		

	// Cancel Order.	
		@Test
		public void cancleOrder1() throws Exception
		{
		MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/CancleOrder/1000").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Order is Cancelled"))
			.andDo(print()));
			
		}
		
		
		@Test
		public void cancleOrder2() throws Exception
		{
		
		MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/CancleOrder/1000").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Order is already Cancelled"))
			.andDo(print()));
			
		}
		
		
		@Test
		public void cancleOrder3() throws Exception
		{
		
			MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/CancleOrder/1051").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Cannot Cancelled Order, Order is already Shipped"))
			.andDo(print()));
			
		}
		
		@Test
		public void cancleOrder4() throws Exception
		{
		
				MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/CancleOrder/100").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Order Id Not Found"))
			.andDo(print()));
			
			
		}
		@Test
		public void ListOrder() throws Exception
		{
		MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/ListOrder").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Order is Null"))
			.andDo(print()));
			
		}
		
		*/
		
		
	
	

}