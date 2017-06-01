package com.example.springremoteexample.repository;

import com.example.springremoteexample.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pkpk1234 on 2017/6/1.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
