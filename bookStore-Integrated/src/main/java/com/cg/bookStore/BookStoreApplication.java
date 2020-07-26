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
//		BookCategory bookCtg = em.find(BookCategory.class, 250);
//		BookInformation book = new BookInformation();
//		book.setTitle("introduction to C");
//		book.setAuthor("Dennis Ritchie");
//		book.setDescription("C: intro to programming");
//		book.setRating(1);
//		book.setIsbnNumber("944562588511");
//		book.setPublishDate(LocalDate.now());
//		book.setLastUpdateTime(LocalDate.now());
//		book.setPrice(234);
//		book.setCategory(bookCtg);		
//		em.persist(book);
//		
//		CustomerInformation cust = new CustomerInformation();
//		
//		cust.setFullName("satyam sinha");
//		cust.setPassword("satam1234");
//		cust.setEmailAddress("satamsinha01@gmail.com");
//		cust.setPhoneNumber("9882343434");
//		cust.setAddress("patna, Bihar");
//		cust.setCity("muzzafarnagar");
//		cust.setZipCode(226675);
//		cust.setCountry("India");
//		cust.setRegisterDate(LocalDate.now());
//
//		em.persist(cust);
//		bk.addCustomer(cust);
		
//		BookInformation books = em.find(BookInformation.class,2001);
//		CustomerInformation cust = em.find(CustomerInformation.class, 200);
//		OrderInformation order = new OrderInformation();
//		order.setRecipientName("satyam sinha");
//		order.setRecipientPhoneNumber("9882343434");
//		order.setStreetAddress("patna, Bihar");
//		order.setCity("muzzafarnagar");
//		order.setZipCode(226675);
//		order.setCountry("India");
//		order.setShippingAddress("patna, Bihar");
//		order.setQuantity(05);
//		order.setTotalPrice(500);
//		order.setOrderStatus("shipped");
//		order.setPaymentMethod("COD");
//		order.setBook(books);
//		order.setOrderDate(LocalDate.now());
//		order.setCartIds("1111");
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
