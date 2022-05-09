package com.OnlineBanking.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.demo.Beans.Withdrawal;
import com.OnlineBanking.demo.Repository.WithdrawalRepository;

@Service
@Transactional
public class WithdrawalService {
	@Autowired
	private WithdrawalRepository repo;
	
	public List<Withdrawal> listAll() {
		return repo.findAll();
	}
	public void save(Withdrawal withdrawal) {
		repo.save(withdrawal);
	}
	
	public Withdrawal get(long wid) {
		return repo.findById(wid).get();
	}
	
	public void delete(long wid) {
		repo.deleteById(wid);
	}
}