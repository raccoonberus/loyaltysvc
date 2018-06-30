package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, Long> {

    Account getByUsername(String username);

    void block(Account account);

    List<Account> getBlocked(int limit);

}
