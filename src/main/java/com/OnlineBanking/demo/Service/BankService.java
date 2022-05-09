package com.OnlineBanking.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineBanking.demo.Beans.Bank;
import com.OnlineBanking.demo.Repository.BankRepository;
@Service
@Transactional
public class BankService {

	@Autowired
	private BankRepository repo;
	
	public List<Bank> listAll() {
		return repo.findAll();
	}
	
	public void save(Bank bank) {
		repo.save(bank);
	}
	
	public Bank get(long bid) {
		return repo.findById(bid).get();
	}
	
	public void delete(long bid) {
		repo.deleteById(bid);
	}
}
