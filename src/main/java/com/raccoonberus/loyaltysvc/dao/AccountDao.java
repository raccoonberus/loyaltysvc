package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AccountDao extends BaseDao<Account, Long> {

    Account getByUsername(String username);

    void doBlockTill(Account account, Date dateTill);

    List<Account> inBlockedPeriodNow(int limit);

}
