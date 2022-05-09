package com.OnlineBanking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBanking.demo.Beans.Transaction;
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
