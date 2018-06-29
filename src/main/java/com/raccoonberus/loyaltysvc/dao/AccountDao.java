package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.model.Account;

import java.util.List;

public interface AccountDao extends BaseDao<Account> {

    Account getByUsername(String username);

    void block(Account account);

    List<Account> getBlocked(int limit);

}
