package com.cg.bookStore;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.service.BookService;
@Transactional
@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner{

	@PersistenceContext
	 EntityManager em;

	
	@Autowired
	BookService book;
	
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
//		BookCategory bookCtg = em.find(BookCategory.class, 150);
//		BookInformation book = new BookInformation();
//		book.setTitle("The wings of fire");
//		book.setAuthor("APJ Abdul kalam");
//		book.setDescription("Life Biopic");
//		book.setRating(1);
//		book.setIsbnNumber("945155588511");
//		book.setPublishDate(LocalDate.now());
//		book.setLastUpdateTime(LocalDate.now());
//		book.setPrice(500);
//		book.setCategory(bookCtg);		
//		em.persist(book); //1
//		
//		CustomerInformation cust = new CustomerInformation();
//		
//		cust.setFullName("Kiran Rajput");
//		cust.setPassword("Kiran!@#");
//		cust.setEmailAddress("krajout97@gmail.com");
//		cust.setPhoneNumber("8852343434");
//		cust.setAddress("Dasrath Agra, Bhelsar, Faizabad");
//		cust.setCity("Agra");
//		cust.setZipCode(226774);
//		cust.setCountry("India");
//		cust.setRegisterDate(LocalDate.now());

//		em.persist(cust);   //2
//		bk.addCustomer(cust);   // not to uncomment
//		
//		BookInformation books = em.find(BookInformation.class,1000);
//		CustomerInformation cust = em.find(CustomerInformation.class, 100);
//		OrderInformation order = new OrderInformation();
//		order.setRecipientName("Kiran Rajput");
//		order.setRecipientPhoneNumber("8852565885");
//		order.setStreetAddress("226/126 Ga Prakash Puram, Bhadewan");
//		order.setCity("Lucknow");
//		order.setZipCode(226004);
//		order.setCountry("India");
//		order.setShippingAddress("226/126 Ga Prakash Puram, Bhadewan");
//		order.setQuantity(12);
//		order.setTotalPrice(123);
//		order.setOrderStatus("Processing");
//		order.setPaymentMethod("COD");
//		order.setBook(books);
//		order.setOrderDate(LocalDate.now());
//		order.setCartIds("1122");
//		order.setCustomer(cust);
//		
//		em.persist(order);

		
		//		bk.addOrder(order);
//      bkAdmin.updateShippingAddress(1551, "144411, Unnamed Road Krishna P.G.");
//		
//		BookInformation book = adminDAO.getBookById(1501);
//		
//		OrderInformation order = adminDAO.getOrderByid(1601);
//		
//		
//		OrderItems orderedItem = new OrderItems();
//		orderedItem.setBook(book);
//		orderedItem.setOrder(order);
//		orderedItem.setQuantity(3);
//		bk.addOrder(order, orderedItem);	
	}

}
