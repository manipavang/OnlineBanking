package com.OnlineBanking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBanking.demo.Beans.Bank;
public interface BankRepository extends JpaRepository<Bank, Long> {

}
