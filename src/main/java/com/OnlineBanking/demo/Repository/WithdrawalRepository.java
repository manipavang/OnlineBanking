package com.OnlineBanking.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBanking.demo.Beans.Withdrawal;

public interface WithdrawalRepository extends JpaRepository<Withdrawal, Long>{

}