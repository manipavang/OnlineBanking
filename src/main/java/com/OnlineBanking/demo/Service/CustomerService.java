package com.OnlineBanking.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineBanking.demo.Beans.Customer;
import com.OnlineBanking.demo.Repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll() {
		return repo.findAll();
	}
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public Customer get(long cid) {
		return repo.findById(cid).get();
	}
	
	public void delete(long cid) {
		repo.deleteById(cid);
	}
}
