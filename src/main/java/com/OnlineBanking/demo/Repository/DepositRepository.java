package com.OnlineBanking.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBanking.demo.Beans.Deposit;

public interface DepositRepository extends JpaRepository<Deposit, Long>{

	List<Deposit> findAll();
	
}