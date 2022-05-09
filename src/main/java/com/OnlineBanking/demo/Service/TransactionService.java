package com.OnlineBanking.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineBanking.demo.Beans.Transaction;
import com.OnlineBanking.demo.Repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {

	@Autowired
	private TransactionRepository repo;
	
	public List<Transaction> listAll() {
		return repo.findAll();
	}
	
	public void save(Transaction transaction) {
		repo.save(transaction);
	}
	
	public Transaction get(long tid) {
		return repo.findById(tid).get();
	}
	
	public void delete(long tid) {
		repo.deleteById(tid);
	}
}