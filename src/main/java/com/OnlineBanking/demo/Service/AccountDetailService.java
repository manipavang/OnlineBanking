package com.OnlineBanking.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineBanking.demo.Beans.AccountDetail;
import com.OnlineBanking.demo.Repository.AccountDetailRepository;

@Service
@Transactional
public class AccountDetailService {

	@Autowired
	private AccountDetailRepository repo;
	
	public List<AccountDetail> listAll() {
		return repo.findAll();
	}
	
	public void save(AccountDetail accountdetail) {
		repo.save(accountdetail);
	}
	
	public AccountDetail get(long cid) {
		return repo.findById(cid).get();
	}
	
	public void delete(long cid) {
		repo.deleteById(cid);
	}
}
