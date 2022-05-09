package com.OnlineBanking.demo.Service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.demo.Beans.Deposit;
import com.OnlineBanking.demo.Repository.DepositRepository;

@Service
@Transactional
public class DepositService {
	@Autowired
	private DepositRepository repo;
	
	public List<Deposit> listAll(){
		return repo.findAll();
	}
	public void save(Deposit deposit) {
		repo.save(deposit);
	}
	public Deposit get(long did) {
		return repo.findById(did).get();
	}
	public void delete(long did) {
		repo.deleteById(did);
	}

}