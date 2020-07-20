package com.cg.bookStore;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.OrderInformation;

@SpringBootApplication
@Transactional
public class BookStoreApplication implements CommandLineRunner{

	@PersistenceContext
	EntityManager em;
	
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		BookCategory bookCtg = em.find(BookCategory.class, 100);
//		BookInformation book = new BookInformation();
//		book.setTitle("The star of Patronage");
//		book.setAuthor("Mahirishi Vyas");
//		book.setDescription("Arjuna: The warrior of mahabharata");
//		book.setRating(1);
//		book.setIsbnNumber("945156588511");
//		book.setPublishDate(LocalDate.now());
//		book.setLastUpdateTime(LocalDate.now());
//		book.setPrice(234);
//		book.setCategory(bookCtg);		
//		em.persist(book);
//		
//		CustomerInformation cust = new CustomerInformation();
//		
//		cust.setFullName("Adwait Verma");
//		cust.setPassword("Meghna1234");
//		cust.setEmailAddress("vermaadwait98@gmail.com");
//		cust.setPhoneNumber("9452343434");
//		cust.setAddress("Dasrath Mau, Bhelsar, Faizabad");
//		cust.setCity("Faizabad");
//		cust.setZipCode(226775);
//		cust.setCountry("India");
//		cust.setRegisterDate(LocalDate.now());
//
//		em.persist(cust);
//		bk.addCustomer(cust);
//		
//		BookInformation books = em.find(BookInformation.class, 1551);
//		CustomerInformation cust = em.find(CustomerInformation.class, 201);
//		OrderInformation order = new OrderInformation();
//		order.setRecipientName("Akhil Verma");
//		order.setRecipientPhoneNumber("9452565885");
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
