package com.raccoonberus.loyaltysvc.dao.jpa;

import com.raccoonberus.loyaltysvc.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class AccountDaoImpl
        extends BaseHibernateDaoImpl<Account, Long>
        implements com.raccoonberus.loyaltysvc.dao.AccountDao {

    @Override
    public Account getByUsername(String username) {
        return null;
    }

    @Override
    public void doBlockTill(Account account, Date dateTill) {
    }

    @Override
    public List<Account> inBlockedPeriodNow(int limit) {
        return null;
    }

}
