package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	
	                 /*SAVE UNIMPLEMENTSD METHOD*/
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}
	
	                /*SAVE UNIMPLEMENTSD METHOD*/	               
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}
	                /*SAVE UNIMPLEMENTSD METHOD*/
	
	
	                 /*UPDATE UNIMPLEMENTSD METHOD*/
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}
	
	                /*UPDATE UNIMPLEMENTSD METHOD*/

	                /*DELETE UNIMPLEMENTSD METHOD*/
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);	
	}
	               /*DELETE UNIMPLEMENTSD METHOD*/
}




