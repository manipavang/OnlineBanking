package com.OnlineBanking.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBanking.demo.Beans.AccountDetail;
public interface AccountDetailRepository extends JpaRepository<AccountDetail, Long> {

}
