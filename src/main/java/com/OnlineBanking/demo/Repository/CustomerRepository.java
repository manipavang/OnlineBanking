package com.OnlineBanking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBanking.demo.Beans.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
