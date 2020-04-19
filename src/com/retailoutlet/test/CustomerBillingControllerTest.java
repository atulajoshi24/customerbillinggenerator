package com.retailoutlet.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.retailoutlet.controller.CustomerBillingController;
import com.retailoutlet.domain.CustomerType;

public class CustomerBillingControllerTest {
	
	@Test
	public void testPremiumCustomerSlab1(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.PREMIUM, 4000);
		assertTrue(billingAmount == 3600);
		
	}
	
	
	@Test
	public void testPremiumCustomerSlab2(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.PREMIUM, 8000);
		assertTrue(billingAmount == 7000);
		
	}
	
	@Test
	public void testPremiumCustomerSlab3(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.PREMIUM, 12000);
		assertTrue(billingAmount == 10200);
		
	}
	
	@Test
	public void testPremiumCustomerSlab4(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.PREMIUM,20000);
		assertTrue(billingAmount == 15800);
		
	}
	
	
	@Test
	public void testRegularCustomerSlab1(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.REGULAR, 5000);
		assertTrue(billingAmount == 5000);
		
	}
	
	
	@Test
	public void testRegularCustomerSlab2(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.REGULAR, 10000);
		assertTrue(billingAmount == 9500);
		
	}
	
	@Test
	public void testRegularCustomerSlab3(){
		
		CustomerBillingController customerController = new CustomerBillingController();
		double billingAmount = customerController.getBillingAmount(CustomerType.REGULAR, 15000);
		assertTrue(billingAmount == 13500);
		
	}

	

}
