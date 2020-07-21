package com.cg.bookStore.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bookStore.entities.Admin;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.entities.CartInformation;
import com.cg.bookStore.entities.CustomerReview;

/************************************************************************************
 *          @author          Kiran Rajput
 *          Description      It is a A Book Dao Interface class that provides Interface for the, 
                             DAo class and all its conponents  
  *         Version             1.0
  *         Created Date    18-JUL-2020
 ************************************************************************************/

@Transactional
@Repository
public class BookDaoImpl implements BookDao{

	@PersistenceContext
	private EntityManager em;
		
	
	@Override
	public OrderInformation viewOrderDetails(int orderId) {
		return em.find(OrderInformation.class,orderId);
	}
	

			public boolean removeBook(int bookId) {
			    String jpql ="delete from OrderInformation p where p.book.bookId=:bid";
					
				Query query = em.createQuery(jpql);
					
				query.setParameter("bid", bookId);
				int res =query.executeUpdate();
				if(res > 0)
					return true;
				else
					return false;
					
		}

		

			/************************************************************************************
			 * Method:                        cancel order information
		     * Description:                   To cancel the details of the order 
			 * @param getAppointment          cancel order
			 ************************************************************************************/
			
			@Override
			public boolean findOrder(int orderId) {
				// TODO Auto-generated method stub
				return em.contains(em.find(OrderInformation.class, orderId));
				
			}



			@Override
			public void updateOrderStatus(int orderId, String orderStatus) {
				// TODO Auto-generated method stub
				em.find(OrderInformation.class, orderId).setOrderStatus(orderStatus);
			}


			@Override
			public OrderInformation getOrderDetails(int orderId) {
				// TODO Auto-generated method stub
				return em.find(OrderInformation.class, orderId);
			}
			
			/************************************************************************************
			 * Method:                        List order information
		     * Description:                   To fetch the details of the order 
			 * @param getAppointment          List information
			 ************************************************************************************/
			
			@Override
			public List<OrderInformation> showListOrder() {
				// TODO Auto-generated method stub
				Query query= em.createQuery("from OrderInformation o");
				List<OrderInformation> orders = query.getResultList();
				return orders;
			}
			
			
			//Update customer details in order through admin			
			@Override
			public boolean updateOrderInfo(OrderInformation orderInfo) 
			{
				em.merge(orderInfo);
				return false;
			}

			@Override
			public OrderInformation getOrderById(int orderId) 
			{
				return em.find(OrderInformation.class, orderId);
			}

	}








		







