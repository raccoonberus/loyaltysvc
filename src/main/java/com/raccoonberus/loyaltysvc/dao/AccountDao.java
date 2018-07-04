package com.raccoonberus.loyaltysvc.dao;

import com.raccoonberus.loyaltysvc.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AccountDao extends JpaRepository<Account, Long> {

    Account getByUsername(String username);

    @Query("UPDATE Account acc SET acc.bannedTill = :bannedTill WHERE acc.id = :accountId")
    void doBlockTill(Account account, Date dateTill);

    @Query("SELECT acc FROM Account acc WHERE acc.bannedTill > :bannedTill")
    List<Account> inBlockedPeriodNow(int limit);

}
